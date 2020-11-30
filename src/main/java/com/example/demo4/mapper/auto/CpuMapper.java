package com.example.demo4.mapper.auto;

import com.example.demo4.model.auto.Cpu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-24
 */
@Mapper
public interface CpuMapper extends BaseMapper<Cpu> {
    List<Cpu> findAllUser();
}
