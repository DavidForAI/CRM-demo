package com.example.demo4.mapper.auto;

import com.example.demo4.model.auto.Cpu;
import com.sun.jna.platform.win32.Netapi32Util;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CpuMapperTest {
    @Autowired
    CpuMapper cpuMapper;

    @org.junit.Test
    public void findAllUser() {
        List<Cpu> all = cpuMapper.findAllUser();
        for(Cpu p : all){
            System.out.println(p);
        }
    }
}