package com.example.demo4.service.impl;

import com.example.demo4.model.auto.Cpu;
import com.example.demo4.mapper.auto.CpuMapper;
import com.example.demo4.service.ICpuService;
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
public class CpuServiceImpl extends ServiceImpl<CpuMapper, Cpu> implements ICpuService {

    @Autowired
    private CpuMapper cpuMapper;
    @Override
    public int insert(Cpu cpu) {
        return cpuMapper.insert(cpu);
    }

    @Override
    public List<Cpu> findAllUser() {
        return cpuMapper.findAllUser();
    }
}
