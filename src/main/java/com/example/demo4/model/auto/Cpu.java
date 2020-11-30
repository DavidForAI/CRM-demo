package com.example.demo4.model.auto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Cpu extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * cpu数量
     */
    private Integer cpuNum;

    /**
     * CPU总的使用率
     */
    private Double total;

    /**
     * CPU系统使用率
     */
    private Double sys;

    /**
     * CPU用户使用率
     */
    private Double used;

    /**
     * CPU当前等待率
     */
    private Double wait;

    /**
     * CPU当前空闲率
     */
    private Double free;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCpuNum() {
        return cpuNum;
    }

    public void setCpuNum(Integer cpuNum) {
        this.cpuNum = cpuNum;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getSys() {
        return sys;
    }

    public void setSys(Double sys) {
        this.sys = sys;
    }

    public Double getUsed() {
        return used;
    }

    public void setUsed(Double used) {
        this.used = used;
    }

    public Double getWait() {
        return wait;
    }

    public void setWait(Double wait) {
        this.wait = wait;
    }

    public Double getFree() {
        return free;
    }

    public void setFree(Double free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "id=" + id +
                ", cpuNum=" + cpuNum +
                ", total=" + total +
                ", sys=" + sys +
                ", used=" + used +
                ", wait=" + wait +
                ", free=" + free +
                '}';
    }
}
