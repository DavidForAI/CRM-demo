package com.example.demo4.domain.sevice;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.demo4.utils.Arith;
import lombok.Data;

@Data
public class Cpu {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer cpuNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCpuNum()
    {
        return cpuNum;
    }

    public void setCpuNum(int cpuNum)
    {
        this.cpuNum = cpuNum;
    }

    public double getTotal()
    {
        return Arith.round(Arith.mul(total, 100), 2);
    }

    public void setTotal(double total)
    {
        this.total = total;
    }

    public double getSys()
    {
        return Arith.round(Arith.mul(sys / total, 100), 2);
    }

    public void setSys(double sys)
    {
        this.sys = sys;
    }

    public double getUsed()
    {
        return Arith.round(Arith.mul(used / total, 100), 2);
    }

    public void setUsed(double used)
    {
        this.used = used;
    }

    public double getWait()
    {
        return Arith.round(Arith.mul(wait / total, 100), 2);
    }

    public void setWait(double wait)
    {
        this.wait = wait;
    }

    public double getFree()
    {
        return Arith.round(Arith.mul(free / total, 100), 2);
    }

    public void setFree(double free)
    {
        this.free = free;
    }
}
