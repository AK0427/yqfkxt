package com.ak.springboot.service.impl;

import com.ak.springboot.entity.Trip;
import com.ak.springboot.mapper.TripMapper;
import com.ak.springboot.service.ITripService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 锴锴
 * @since 2022-10-29
 */
@Service
public class TripServiceImpl extends ServiceImpl<TripMapper, Trip> implements ITripService {

}
