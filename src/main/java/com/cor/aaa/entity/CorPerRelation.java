package com.cor.aaa.entity;

import java.io.Serializable;

/**
 * 矫正人员社会关系信息
 *
 * @Author:范博源
 * @Date:2018-11-1 14:08
 */
public class CorPerRelation implements Serializable {
    /**
     * 主键编号
     */
    private String corPerRelaId;
    /**
     * 矫正人员编号
     */
    private Integer corPerId;
    /**
     * 名字
     */
    private String corPerRelName;
    /**
     * 工作单位
     */
    private String workUnit;
    /**
     * 联系电话
     */
    private String corPerRelPhone;
    /**
     * 和矫正人员的关系
     */
    private String relation;

    @Override
    public String toString() {
        return "CorPerRelation{" +
                "corPerRelaId='" + corPerRelaId + '\'' +
                ", corPerId=" + corPerId +
                ", corPerRelName='" + corPerRelName + '\'' +
                ", workUnit='" + workUnit + '\'' +
                ", corPerRelPhone='" + corPerRelPhone + '\'' +
                ", relation='" + relation + '\'' +
                '}';
    }

    public String getCorPerRelaId() {
        return corPerRelaId;
    }

    public void setCorPerRelaId(String corPerRelaId) {
        this.corPerRelaId = corPerRelaId;
    }

    public Integer getCorPerId() {
        return corPerId;
    }

    public void setCorPerId(Integer corPerId) {
        this.corPerId = corPerId;
    }

    public String getCorPerRelName() {
        return corPerRelName;
    }

    public void setCorPerRelName(String corPerRelName) {
        this.corPerRelName = corPerRelName;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getCorPerRelPhone() {
        return corPerRelPhone;
    }

    public void setCorPerRelPhone(String corPerRelPhone) {
        this.corPerRelPhone = corPerRelPhone;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
