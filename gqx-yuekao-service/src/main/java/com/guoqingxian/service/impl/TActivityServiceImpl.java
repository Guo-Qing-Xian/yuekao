package com.guoqingxian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guoqingxian.model.TActivity;
import com.guoqingxian.struct.PageResult;
import com.guoqingxian.vo.SearchVo;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.util.Objects;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guoqingxian.mapper.TActivityMapper;
import com.guoqingxian.service.TActivityService;

@Service
public class TActivityServiceImpl extends ServiceImpl<TActivityMapper, TActivity> implements TActivityService {

    @Override
    public PageResult<TActivity> listTActivity(Integer currPage, Integer pageSize, SearchVo searchVo) {
        Page<TActivity> page = new Page<>(currPage, pageSize);
        QueryWrapper<TActivity> queryWrapper = new QueryWrapper<>();
        if (Objects.nonNull(searchVo)) {
            String name = searchVo.getName();
            if (!Strings.isEmpty(name)) {
                queryWrapper.like("activity_name", name);
            }
            String startTime = searchVo.getStartTime();
            if (!Strings.isEmpty(startTime)) {
                queryWrapper.ge("create_time", startTime);
            }
            String endTime = searchVo.getEndTime();
            if (!Strings.isEmpty(endTime)) {
                queryWrapper.le("create_time", endTime);
            }
            Integer type = searchVo.getType();
            if (type != null) {
                queryWrapper.eq("activity_type", type);
            }
        }
        page = baseMapper.listTActivity(page, queryWrapper);
        return new PageResult<>(page.getRecords(), page.getTotal());
    }
}

