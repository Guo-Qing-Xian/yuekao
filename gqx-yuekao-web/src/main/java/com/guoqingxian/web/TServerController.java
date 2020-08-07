/**
 * 作者:   郭青贤
 * 时间:   2020/8/7 10:02
 */
package com.guoqingxian.web;

import com.guoqingxian.model.TServer;
import com.guoqingxian.service.TServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class TServerController {
    private final TServerService tServerService;
    @Autowired
    public TServerController(TServerService tServerService) {
        this.tServerService = tServerService;
    }

    @RequestMapping("listTServer")
    public List<TServer> listTServer(){
        return tServerService.list();
    }
}
