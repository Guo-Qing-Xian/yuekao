package com.guoqingxian.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guoqingxian.model.TType;
import com.guoqingxian.mapper.TTypeMapper;
import com.guoqingxian.service.TTypeService;
@Service
public class TTypeServiceImpl extends ServiceImpl<TTypeMapper, TType> implements TTypeService{

}
