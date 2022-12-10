package com.ak.springboot.service.impl;

import com.ak.springboot.entity.Declares;
import com.ak.springboot.mapper.DeclaresMapper;
import com.ak.springboot.service.IDeclaresService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 锴锴
 * @since 2022-10-30
 */
@Service
public class DeclaresServiceImpl extends ServiceImpl<DeclaresMapper, Declares> implements IDeclaresService {
    public Boolean saveDeclares(Declares declares){
        return saveOrUpdate(declares);
    }
}
