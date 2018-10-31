package com.cor.aaa.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 机构信息
 */
public class Organization implements Serializable {
    /**
     * 上级机构
     */
    private Organization supOrg;
    /**
     * 机构id
     */
    private Integer orgId;
    /**
     * 机构名称
     */
    private String orgName;
    /**
     * 上级机构编号
     */
    private Integer superiorOrg;
    /**
     * 机构类型 0为司法机构，1为法院
     */
    private int orgType;
    /**
     * 机构负责人
     */
    private int orgPrincipal;

    /**
     * 机构负责人信息
     */
    private Manager orgPri;
    /**
     * 下级机构
     */
    private List<Organization> subOrgs;

    public Organization getSupOrg() {
        return supOrg;
    }

    public void setSupOrg(Organization supOrg) {
        this.supOrg = supOrg;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getSuperiorOrg() {
        return superiorOrg;
    }

    public void setSuperiorOrg(Integer superiorOrg) {
        this.superiorOrg = superiorOrg;
    }

    public int getOrgType() {
        return orgType;
    }

    public void setOrgType(int orgType) {
        this.orgType = orgType;
    }

    public List<Organization> getSubOrgs() {
        return subOrgs;
    }

    public void setSubOrgs(List<Organization> subOrgs) {
        this.subOrgs = subOrgs;
    }

    public int getOrgPrincipal() {
        return orgPrincipal;
    }

    public void setOrgPrincipal(int orgPrincipal) {
        this.orgPrincipal = orgPrincipal;
    }

    public Manager getOrgPri() {
        return orgPri;
    }

    public void setOrgPri(Manager orgPri) {
        this.orgPri = orgPri;
    }

    public Organization() {
    }

    @Override
    public String toString() {
        return "Organization{" +
                "supOrg=" + supOrg +
                ", orgId=" + orgId +
                ", orgName='" + orgName + '\'' +
                ", superiorOrg=" + superiorOrg +
                ", orgType=" + orgType +
                ", orgPrincipal=" + orgPrincipal +
                ", orgPri=" + orgPri +
                '}';
    }
}
