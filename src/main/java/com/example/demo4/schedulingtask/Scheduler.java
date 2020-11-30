package com.example.demo4.schedulingtask;

import com.example.demo4.domain.service;
import com.example.demo4.model.auto.Cpu;
import com.example.demo4.model.auto.Mem;
import com.example.demo4.service.ICpuService;
import com.example.demo4.service.IMemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class Scheduler {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    ICpuService cpuService;

    @Autowired
    IMemService iMemService;

    @Scheduled(fixedRate = 5000)
    public void testTasks() throws Exception {
        copyTo(cpuService);
        service Server = new service();
        System.out.println(Server.getCpu());
    }

    @Scheduled(fixedRate = 5000)
    public void memSetTasks() throws Exception {
        service service = new service();
        service.copyTo();
        Mem mem = new Mem();
        mem.setFree(service.getMem().getFree());
        mem.setTotal(service.getMem().getTotal());
        mem.setUsed(service.getMem().getUsed());
        iMemService.insert(mem);
        System.out.println(service.getMem());
    }

    public static void copyTo(ICpuService cpuService) throws Exception {
        service Server = new service();
        Server.copyTo();
        Cpu cpu = new Cpu();
        cpu.setWait(Server.getCpu().getWait());
        cpu.setCpuNum(Server.getCpu().getCpuNum());
        cpu.setFree(Server.getCpu().getFree());
        cpu.setSys(Server.getCpu().getSys());
        cpu.setTotal(Server.getCpu().getTotal());
        cpu.setUsed(Server.getCpu().getUsed());
        cpuService.insert(cpu);
    }
}
