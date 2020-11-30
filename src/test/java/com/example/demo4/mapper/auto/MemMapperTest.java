package com.example.demo4.mapper.auto;

import com.example.demo4.model.auto.Cpu;
import com.example.demo4.model.auto.Mem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MemMapperTest {

    @Autowired
    private MemMapper memMapper;

    @Test
    public void findAllMem() {
        List<Mem> all = memMapper.findAllMem();
        for(Mem p : all){
            System.out.println(p);
        }
    }
}