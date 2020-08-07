package com.guoqingxian.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;import com.guoqingxian.model.TActivity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TActivityMapper extends BaseMapper<TActivity> {
    Page<TActivity> listTActivity(Page<TActivity> page,@Param("ew") QueryWrapper<TActivity> queryWrapper);
}