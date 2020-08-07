package com.guoqingxian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guoqingxian.model.TActivity;
import com.guoqingxian.struct.PageResult;
import com.guoqingxian.vo.SearchVo;

public interface TActivityService extends IService<TActivity> {


    PageResult<TActivity> listTActivity(Integer currPage, Integer pageSize, SearchVo searchVo);
}

