package com.ak.springboot.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.ak.springboot.common.Constants;
import com.ak.springboot.controller.dto.UserDTO;
import com.ak.springboot.entity.User;
import com.ak.springboot.exception.ServiceException;
import com.ak.springboot.mapper.UserMapper;
import com.ak.springboot.service.IUserService;
import com.ak.springboot.utils.TokenUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 锴锴
 * @since 2022-10-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public UserDTO login(UserDTO userDTO) {
        User one = getUserInfo(userDTO);
        System.out.println("ddddddddddddddddddddddd"+one);
        if(one!=null){
            BeanUtil.copyProperties(one,userDTO,true);
            //设置token
            String token = TokenUtils.genToken(one.getId().toString(), one.getPassword());
            userDTO.setToken(token);
            return userDTO;
        }else{
            throw new ServiceException(Constants.CODE_600,"用户名或密码错误");
        }


    }

    @Override
    public User register(UserDTO userDTO) {
        User one = getUserInfo(userDTO);
        if(one==null){
            one=new User();
            BeanUtil.copyProperties(userDTO,one,true);
            save(one);//把copy完成后的用户对象存储到数据库
        }else{
            throw new ServiceException(Constants.CODE_600,"用户名已存在");
        }
        return null;
    }



    private User getUserInfo(UserDTO userDTO){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("username",userDTO.getUsername());
        queryWrapper.eq("password",userDTO.getPassword());
        User one;
        try{
            one= getOne(queryWrapper);//从数据库查询用户信息
        }catch (Exception e){
            throw new ServiceException(Constants.CODE_500,"系统错误");
        }
        return one;
    }
}
