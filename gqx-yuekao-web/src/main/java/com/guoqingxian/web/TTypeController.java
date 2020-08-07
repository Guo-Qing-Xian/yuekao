/**
 * 作者:   郭青贤
 * 时间:   2020/8/7 10:14
 */
package com.guoqingxian.web;

import com.guoqingxian.model.TServer;
import com.guoqingxian.model.TType;
import com.guoqingxian.service.TTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class TTypeController {
    private final TTypeService tTypeService;
    @Autowired
    public TTypeController(TTypeService tTypeService) {
        this.tTypeService = tTypeService;
    }

    @RequestMapping("listTType")
    public List<TType> listTType(){
        return tTypeService.list();
    }
}
