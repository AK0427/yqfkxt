package com.ak.springboot.controller;


import cn.hutool.core.util.StrUtil;
import com.ak.springboot.common.Constants;
import com.ak.springboot.common.Result;
import com.ak.springboot.controller.dto.UserDTO;
import com.ak.springboot.entity.Declares;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//导包：entity==pojo
import com.ak.springboot.service.IUserService;
import com.ak.springboot.entity.User;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 锴锴
 * @since 2022-10-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @PostMapping
    public Result save(@RequestBody User user){
        return Result.success(userService.saveOrUpdate(user));
    }

    @DeleteMapping("/{id}")
    public Result deleteId(@PathVariable Integer id){
        return Result.success(userService.removeById(id));
    }

    @GetMapping
    public Result findAll(){
        return Result.success(userService.list());
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam(defaultValue = "") Integer pageNum ,
                                @RequestParam(defaultValue = "") Integer pageSize,
                                @RequestParam(defaultValue = "") String username){
        IPage<User> page = new Page<>(pageNum,pageSize);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if(!"".equals(username)){
            queryWrapper.like("username",username);
        }
        return Result.success(userService.page(page, queryWrapper));
    }

    @PostMapping("/login")//登录
    public Result login(@RequestBody UserDTO userDTO){
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        if(StrUtil.isBlank(username)||StrUtil.isBlank(password)){
            return Result.error(Constants.CODE_400,"参数错误");
        }
        UserDTO dto= userService.login(userDTO);
        return Result.success(dto);
    }
    @PostMapping("/register")//注册
    public Result register(@RequestBody UserDTO userDTO){
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        if(StrUtil.isBlank(username)||StrUtil.isBlank(password)){
            return Result.error(Constants.CODE_400,"参数错误");
        }

        return Result.success(userService.register(userDTO));
    }
    @GetMapping("/username/{username}")//个人信息
   public Result findAll(@PathVariable String username){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        return Result.success(userService.getOne(queryWrapper));
    }



}

