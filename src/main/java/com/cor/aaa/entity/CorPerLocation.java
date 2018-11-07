package com.cor.aaa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 矫正人员的位置
 *
 * @Author:范博源
 * @Date:2018-11-7 15:35
 */
public class CorPerLocation implements Serializable {
    /**
     * 位置编号
     */
    private String corPerLocationId;
    /**
     * 人员编号
     */
    private Integer corPerId;
    /**
     * 位置坐标
     */
    private String point;
    /**
     * 到此位置的时间
     */
    private Date pointTime;

    public String getCorPerLocationId() {
        return corPerLocationId;
    }

    public void setCorPerLocationId(String corPerLocationId) {
        this.corPerLocationId = corPerLocationId;
    }

    public Integer getCorPerId() {
        return corPerId;
    }

    public void setCorPerId(Integer corPerId) {
        this.corPerId = corPerId;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public Date getPointTime() {
        return pointTime;
    }

    public void setPointTime(Date pointTime) {
        this.pointTime = pointTime;
    }
}
