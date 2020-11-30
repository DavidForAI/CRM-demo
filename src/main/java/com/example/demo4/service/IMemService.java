package com.example.demo4.service;

import com.example.demo4.model.auto.Mem;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-24
 */
@Service
public interface IMemService extends IService<Mem> {
    int insert(Mem mem);

    List<Mem> findAllMem();
}
