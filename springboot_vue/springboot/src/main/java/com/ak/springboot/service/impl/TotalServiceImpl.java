package com.ak.springboot.service.impl;

import com.ak.springboot.entity.Total;
import com.ak.springboot.mapper.TotalMapper;
import com.ak.springboot.service.ITotalService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 锴锴
 * @since 2022-11-12
 */
@Service
public class TotalServiceImpl extends ServiceImpl<TotalMapper, Total> implements ITotalService {

}
