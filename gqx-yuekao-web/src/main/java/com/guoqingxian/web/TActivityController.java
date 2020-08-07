/**
 * 作者:   郭青贤
 * 时间:   2020/8/7 9:22
 */
package com.guoqingxian.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guoqingxian.model.TActivity;
import com.guoqingxian.model.TActivityServer;
import com.guoqingxian.service.TActivityServerService;
import com.guoqingxian.service.TActivityService;
import com.guoqingxian.struct.PageResult;
import com.guoqingxian.struct.Result;
import com.guoqingxian.vo.SearchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class TActivityController {
    private final TActivityServerService tActivityServerService;
    private final TActivityService tActivityService;
    @Autowired
    public TActivityController(TActivityServerService tActivityServerService, TActivityService tActivityService) {
        this.tActivityServerService = tActivityServerService;
        this.tActivityService = tActivityService;
    }

    @RequestMapping("listTActivity")
    public PageResult<TActivity> listTActivity(Integer currPage, Integer pageSize, @RequestBody SearchVo searchVo){
        return tActivityService.listTActivity(currPage,pageSize,searchVo);
    }

    @RequestMapping("updateTActivityServer")
    public Result updateTActivityServer(@RequestBody TActivity tActivity){
        List<TActivityServer> tActivityServers = new ArrayList<>();
        Integer id = tActivity.getId();
        boolean update = tActivityService.updateById(tActivity);

        QueryWrapper<TActivityServer> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("activity_id",id);
        boolean remove = tActivityServerService.remove(queryWrapper);

        List<Integer> list = tActivity.getType();
        for (Integer integer : list) {
            tActivityServers.add(new TActivityServer(id,integer));
        }
        boolean saveBatch = tActivityServerService.saveBatch(tActivityServers);
        if (update && remove && saveBatch){
            return Result.ok();
        }
        return new Result(500,"error");
    }

    @RequestMapping("addTActivityServer")
    public Result addTActivityServer(@RequestBody TActivity tActivity){
        List<TActivityServer> tActivityServers = new ArrayList<>();
        boolean save = tActivityService.save(tActivity);

        List<Integer> list = tActivity.getType();
        for (Integer integer : list) {
            tActivityServers.add(new TActivityServer(tActivity.getId(),integer));
        }
        boolean saveBatch = tActivityServerService.saveBatch(tActivityServers);
        if (save && saveBatch){
            return Result.ok();
        }
        return new Result(500,"error");
    }

    @RequestMapping("deleteTActivityServer")
    public Result deleteTActivityServer(Integer id){
        boolean removeById = tActivityService.removeById(id);

        QueryWrapper<TActivityServer> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("activity_id",id);
        boolean remove = tActivityServerService.remove(queryWrapper);

        if (removeById && remove){
            return Result.ok();
        }
        return new Result(500,"error");
    }

}
