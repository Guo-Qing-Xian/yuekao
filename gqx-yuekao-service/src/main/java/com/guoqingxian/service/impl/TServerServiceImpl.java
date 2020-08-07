package com.guoqingxian.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guoqingxian.model.TServer;
import com.guoqingxian.mapper.TServerMapper;
import com.guoqingxian.service.TServerService;
@Service
public class TServerServiceImpl extends ServiceImpl<TServerMapper, TServer> implements TServerService{

}
