package com.ak.springboot.controller;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Quarter;
import cn.hutool.http.HttpUtil;
import com.ak.springboot.common.Result;
import com.ak.springboot.entity.Other;
import com.ak.springboot.entity.Places;
import com.ak.springboot.entity.Teacherstudent;
import com.ak.springboot.entity.Total;
import com.ak.springboot.service.IOtherService;
import com.ak.springboot.service.IPlacesService;
import com.ak.springboot.service.ITeacherstudentService;
import com.ak.springboot.service.ITotalService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/echarts")
public class EchartsController {
    @Autowired
    private IOtherService otherService;
    @Autowired
    private ITotalService totalService;

    @GetMapping("/members")
    public Result members(){
        List<Other> list= otherService.list();
        int q1=0;
        int q2=0;
        int q3=0;
        int q4=0;
        for (Other user : list) {
            Date date =  user.getDate();
            Quarter quarter = DateUtil.quarterEnum(date);

            switch (quarter){
                case Q1:q1+=1; break;
                case Q2:q2+=1; break;
                case Q3:q3+=1; break;
                case Q4:q4+=1; break;
                default:break;
            }
        }
        return Result.success(CollUtil.newArrayList(q1,q2,q3,q4));
    }
    @GetMapping("/epidemic")
    public String epidemic() {
        return HttpUtil.get("https://c.m.163.com/ug/api/wuhan/app/data/list-total?t=" + System.currentTimeMillis());
    }


    @GetMapping("/epidemics")
    public Result epidemics(){
//        List<Places> list = placesService.list();
        List<Total> list = totalService.list(Wrappers.lambdaQuery());
        return Result.success(list);

    }
}
