package com.example.demo4.controller;


import com.example.demo4.model.auto.Cpu;
import com.example.demo4.service.ICpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-24
 */
@RestController
@RequestMapping("/cpu")
public class CpuController {

    @Autowired
    ICpuService iCpuService;

    @PostMapping("/findAllUser")
    public List<Cpu> findAllUser(){
        return iCpuService.findAllUser();
    }
}
