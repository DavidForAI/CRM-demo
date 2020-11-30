package com.example.demo4.controller;

import com.example.demo4.domain.service;
import com.example.demo4.model.auto.Cpu;
import com.example.demo4.model.auto.Mem;
import com.example.demo4.schedulingtask.Scheduler;
import com.example.demo4.service.ICpuService;
import com.example.demo4.service.IMemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class Controller {
    @Autowired
    ICpuService iCpuService;

    @Autowired
    IMemService iMemService;

    @RequestMapping("/sys")
    public service getService() throws Exception {
        service Server = new service();
        Server.copyTo();
        Cpu cpu = new Cpu();
        cpu.setWait(Server.getCpu().getWait());
        cpu.setCpuNum(Server.getCpu().getCpuNum());
        cpu.setFree(Server.getCpu().getFree());
        cpu.setId(Server.getCpu().getId());
        cpu.setSys(Server.getCpu().getSys());
        cpu.setTotal(Server.getCpu().getTotal());
        cpu.setUsed(Server.getCpu().getUsed());
        return Server;
    }

    @RequestMapping("/show")
    @ResponseBody
    public List<Cpu> show(){
        return iCpuService.findAllUser();
    }

    @RequestMapping("/Mem")
    @ResponseBody
    public List<Mem> mem(){
        return iMemService.findAllMem();
    }

    @RequestMapping("/showCpu")
    public String showCpu() {
        return "pie";
    }
    @RequestMapping("/showMem")
    public String showMem() {
        return "Mem";
    }


}
