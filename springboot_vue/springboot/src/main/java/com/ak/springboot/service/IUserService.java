package com.ak.springboot.service;

import com.ak.springboot.controller.dto.UserDTO;
import com.ak.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 锴锴
 * @since 2022-10-24
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

}
