package com.ak.springboot.controller;


import com.ak.springboot.common.Result;
import com.ak.springboot.entity.Teacherstudent;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//导包：entity==pojo
import com.ak.springboot.service.IOtherService;
import com.ak.springboot.entity.Other;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 锴锴
 * @since 2022-11-01
 */
@RestController
@RequestMapping("/other")
public class OtherController {

    @Resource
    private IOtherService otherService;

    @PostMapping
    public Result save(@RequestBody Other other){
        return Result.success(otherService.saveOrUpdate(other));
    }

    @DeleteMapping("/{id}")
    public Result deleteId(@PathVariable Integer id){
        return Result.success(otherService.removeById(id));
    }

    @GetMapping
    public Result findAll(){
        return Result.success(otherService.list());
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam(defaultValue = "") Integer pageNum ,
                                    @RequestParam(defaultValue = "") Integer pageSize,
                                       @RequestParam(defaultValue = "") String name){
        IPage<Other> page=new Page<>(pageNum,pageSize);
        QueryWrapper<Other> queryWrapper = new QueryWrapper<>();
        if(!"".equals(name)){
            queryWrapper.like("name",name);
        }
        return Result.success(otherService.page(page, queryWrapper));
    }
}

