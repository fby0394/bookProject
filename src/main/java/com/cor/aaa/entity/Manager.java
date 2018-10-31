package com.cor.aaa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 管理人员信息
 */
public class Manager implements Serializable {

    /**
     * 人员编号
     */
    private Integer managerId;
    /**
     * 用户名
     */
    private String managerName;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 所属部门编号
     */
    private Integer orgId;
    /**
     * 角色编号
     */
    private Integer roleId;
    /**
     * 联系手机号
     */
    private String phone;
    /**
     * 角色状态 0 在职 1 离职
     */
    private Integer status;
    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 所属部门
     */
    private Organization org;

    /**
     * 入职日期
     */
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date hireDate;

    /**
     * 离职日期

     */
    private Date termDate;


    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getTermDate() {
        return termDate;
    }

    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }
    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", orgId=" + orgId +
                ", roleId='" + roleId + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", roleName='" + roleName + '\'' +
                ", org=" + org +
                '}';
    }
}
