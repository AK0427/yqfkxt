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
import com.ak.springboot.service.ITotalService;
import com.ak.springboot.entity.Total;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 锴锴
 * @since 2022-11-12
 */
@RestController
@RequestMapping("/total")
public class TotalController {

    @Resource
    private ITotalService totalService;

    @PostMapping
    public Result save(@RequestBody Total total){
        return Result.success(totalService.saveOrUpdate(total));
    }

    @DeleteMapping("/{id}")
    public Result deleteId(@PathVariable Integer id){
        return Result.success(totalService.removeById(id));
    }

    @GetMapping
    public Result findAll(){
        return Result.success(totalService.list());
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam(defaultValue = "") Integer pageNum ,
                           @RequestParam(defaultValue = "") Integer pageSize){
        IPage<Total> page=new Page<>(pageNum,pageSize);
        QueryWrapper<Total> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        return Result.success(totalService.page(page, queryWrapper));
    }
}

