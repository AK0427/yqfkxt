package com.ak.springboot.controller;


import com.ak.springboot.common.Result;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//导包：entity==pojo
import com.ak.springboot.service.IPlacesService;
import com.ak.springboot.entity.Places;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 锴锴
 * @since 2022-11-11
 */
@RestController
@RequestMapping("/places")
public class PlacesController {

    @Resource
    private IPlacesService placesService;

    @PostMapping
    public Result save(@RequestBody Places places){
        return Result.success(placesService.saveOrUpdate(places));
    }

    @DeleteMapping("/{id}")
    public Result deleteId(@PathVariable Integer id){
        return Result.success(placesService.removeById(id));
    }

    @GetMapping
    public Result findAll(){
        return Result.success(placesService.list());
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam(defaultValue = "") Integer pageNum ,
                                    @RequestParam(defaultValue = "") Integer pageSize,
                           @RequestParam(defaultValue = "") String place){
        IPage<Places> page=new Page<>(pageNum,pageSize);
        QueryWrapper<Places> queryWrapper = new QueryWrapper<>();
//        queryWrapper.orderByDesc("id");
        if(!"".equals(place)){
            queryWrapper.like("place",place);
        }
        return Result.success(placesService.page(page, queryWrapper));
    }
}

