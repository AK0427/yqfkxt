package com.ak.springboot.controller;


import com.ak.springboot.common.Result;
import com.ak.springboot.entity.Teacherstudent;
import com.ak.springboot.service.ITeacherstudentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

//导包：entity==pojo

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 锴锴
 * @since 2022-10-30
 */
@RestController
@RequestMapping("/teacherstudent")
public class TeacherstudentController {

    @Resource
    private ITeacherstudentService teacherstudentService;

    @PostMapping
    public Result save(@RequestBody Teacherstudent teacherstudent){
        return Result.success(teacherstudentService.saveOrUpdate(teacherstudent));
    }

    @DeleteMapping("/{id}")
    public Result deleteId(@PathVariable Integer id){
        return Result.success(teacherstudentService.removeById(id));
    }

    @GetMapping
    public Result findAll(){
        return Result.success(teacherstudentService.list());
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam(defaultValue = "") Integer pageNum ,
                           @RequestParam(defaultValue = "") Integer pageSize,
                           @RequestParam(defaultValue = "") String status,
                           @RequestParam(defaultValue = "") String state){
        IPage<Teacherstudent> page=new Page<>(pageNum,pageSize);
        QueryWrapper<Teacherstudent> queryWrapper = new QueryWrapper<>();
        if(!"".equals(status)){
            queryWrapper.like("status",status);
        }
        if(!"".equals(state)){
            queryWrapper.like("state",state);
        }
//        queryWrapper.orderByDesc("id");
        return Result.success(teacherstudentService.page(page, queryWrapper));
    }
}

