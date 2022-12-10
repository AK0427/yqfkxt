package com.ak.springboot.controller;


import com.ak.springboot.common.Result;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//导包：entity==pojo
import com.ak.springboot.service.ITripService;
import com.ak.springboot.entity.Trip;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 锴锴
 * @since 2022-10-29
 */
@RestController
@RequestMapping("/trip")
public class TripController {

    @Resource
    private ITripService tripService;

    @PostMapping
    public Result save(@RequestBody Trip trip){
        return Result.success(tripService.saveOrUpdate(trip));
    }

    @DeleteMapping("/{id}")
    public Result deleteId(@PathVariable Integer id){
        return Result.success(tripService.removeById(id));
    }

    @GetMapping
    public Result findAll(){
        return Result.success(tripService.list());
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam(defaultValue = "") Integer pageNum ,
                                @RequestParam(defaultValue = "") Integer pageSize,
                                @RequestParam(defaultValue = "") String status,
                                @RequestParam(defaultValue = "") String state){
        IPage<Trip> page = new Page<>(pageNum,pageSize);
        QueryWrapper<Trip> queryWrapper = new QueryWrapper<>();
//        queryWrapper.orderByDesc("id");倒序显示
        if(!"".equals(status)){
            queryWrapper.like("status",status);
        }
        if(!"".equals(state)){
            queryWrapper.like("state",state);
        }
        return Result.success(tripService.page(page, queryWrapper));
    }
}

