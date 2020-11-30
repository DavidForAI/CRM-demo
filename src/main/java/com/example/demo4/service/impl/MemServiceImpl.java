package com.example.demo4.service.impl;

import com.example.demo4.model.auto.Mem;
import com.example.demo4.mapper.auto.MemMapper;
import com.example.demo4.service.IMemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-24
 */
@Service
public class MemServiceImpl extends ServiceImpl<MemMapper, Mem> implements IMemService {

    @Autowired
    private MemMapper memMapper;

    @Override
    public int insert(Mem mem) {
        return memMapper.insert(mem);
    }

    @Override
    public List<Mem> findAllMem() {
        return memMapper.findAllMem();
    }
}
