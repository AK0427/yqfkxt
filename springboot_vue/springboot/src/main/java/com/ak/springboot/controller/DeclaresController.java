package com.ak.springboot.controller;


import com.ak.springboot.common.Result;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//导包：entity==pojo
import com.ak.springboot.service.IDeclaresService;
import com.ak.springboot.entity.Declares;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 锴锴
 * @since 2022-10-30
 */
@RestController
@RequestMapping("/declares")
public class DeclaresController {

    @Resource
    private IDeclaresService declaresService;

    @PostMapping
    public Result save(@RequestBody Declares declares){
        return Result.success(declaresService.saveOrUpdate(declares));
    }

    @DeleteMapping("/{id}")
    public Result deleteId(@PathVariable Integer id){
        return Result.success(declaresService.removeById(id));
    }

    @GetMapping
    public Result findAll(){
        return Result.success(declaresService.list());
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam(defaultValue = "") Integer pageNum ,
                           @RequestParam(defaultValue = "") Integer pageSize,
                           @RequestParam(defaultValue = "") String name){
        IPage<Declares> page=new Page<>(pageNum,pageSize);
        QueryWrapper<Declares> queryWrapper = new QueryWrapper<>();
//        queryWrapper.orderByDesc("id");       搜索出来的列表按照id从大到小排列
        if(!"".equals(name)){
            queryWrapper.like("name",name);
        }
        return Result.success(declaresService.page(page, queryWrapper));
    }
}

