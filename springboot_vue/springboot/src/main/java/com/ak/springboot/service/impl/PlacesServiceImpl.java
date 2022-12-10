package com.ak.springboot.service.impl;

import com.ak.springboot.entity.Places;
import com.ak.springboot.mapper.PlacesMapper;
import com.ak.springboot.service.IPlacesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 锴锴
 * @since 2022-11-11
 */
@Service
public class PlacesServiceImpl extends ServiceImpl<PlacesMapper, Places> implements IPlacesService {

}
