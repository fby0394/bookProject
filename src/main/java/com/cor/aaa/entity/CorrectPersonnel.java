package com.cor.aaa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 矫正人员信息
 *
 * @Author: 范博源
 * @Date: 2018-10-25 12:30
 */
public class CorrectPersonnel implements Serializable {
    /**
     * 人员编号
     */
    private Integer corPerId;
    /**
     * 人员姓名
     */
    private String corPerName;
    /**
     * 曾用名
     */
    private String corPerNames;
    /**
     * 矫正的部门编号
     */
    private Integer corOrgId;
    /**
     * 矫正的部门信息
     */
    private Organization corOrg;
    /**
     * 矫正人员身份证号
     */
    private String corPerCarid;
    /**
     * 矫正人员联系手机号
     */
    private String corPerPhone;
    /**
     * 矫正人员照片
     */
    private String corPerPic;
    /**
     * 登记的工作人员编号
     */
    private Integer manId;
    /**
     * 登记的工作人员信息
     */
    private Manager manManger;
    /**
     * 矫正人员政治面貌
     */
    private String proliticsStatus;
    /**
     * 矫正人员文化程度
     */
    private String standardOfCulture;
    /**
     * 职业
     */
    private String profession;
    /**
     * 民族
     */
    private String nationality;
    /**
     * 婚姻状况
     */
    private String marriage;
    /**
     * 户籍
     */
    private String censusRegister;
    /**
     * 籍贯
     */
    private String nativePlace;
    /**
     * 户籍地址
     */
    private String marrigerAddress;
    /**
     * 居住地址
     */
    private String address;
    /**
     * 监管级别编号
     */
    private Integer supRankId;
    /**
     * 监管级别
     */
    private String supRankName;
    /**
     * 状态编号
     */
    private Integer corPerStateId;
    /**
     * 矫正状态
     */
    private String corPerState;
    /**
     * 罪名
     */
    private String accusation;
    /**
     * 执行类别编号
     */
    private Integer perCatId;
    /**
     * 执行类别
     */
    private String performCategory;
    /**
     * 判决书号
     */
    private String judgmentNum;
    /**
     * 判决日期
     */
    private Date judgmentTime;
    /**
     * 判决机关编号
     */
    private Integer judgmentOrgId;

    /**
     * 判决机关信息
     */
    private Organization judgmentOrg;
    /**
     * 原判刑期
     */
    private String judgmentDeadline;
    /**
     * 附加刑
     */
    private String additionPenal;
    /**
     * 刑期（起止）
     */
    private String penalDeadline;
    /**
     * 矫正期限（起止）
     */
    private String correctDeadline;
    /**
     * 入矫日期
     */
    private String correctBeginTime;
    /**
     * 解矫日期
     */
    private String correctEndTime;

    public CorrectPersonnel() {
    }

    public Integer getCorPerId() {
        return corPerId;
    }

    public void setCorPerId(Integer corPerId) {
        this.corPerId = corPerId;
    }

    public String getCorPerName() {
        return corPerName;
    }

    public void setCorPerName(String corPerName) {
        this.corPerName = corPerName;
    }

    public String getCorPerNames() {
        return corPerNames;
    }

    public void setCorPerNames(String corPerNames) {
        this.corPerNames = corPerNames;
    }

    public Integer getCorOrgId() {
        return corOrgId;
    }

    public void setCorOrgId(Integer corOrgId) {
        this.corOrgId = corOrgId;
    }

    public String getCorPerCarid() {
        return corPerCarid;
    }

    public void setCorPerCarid(String corPerCarid) {
        this.corPerCarid = corPerCarid;
    }

    public String getCorPerPhone() {
        return corPerPhone;
    }

    public void setCorPerPhone(String corPerPhone) {
        this.corPerPhone = corPerPhone;
    }

    public String getCorPerPic() {
        return corPerPic;
    }

    public void setCorPerPic(String corPerPic) {
        this.corPerPic = corPerPic;
    }

    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public String getProliticsStatus() {
        return proliticsStatus;
    }

    public void setProliticsStatus(String proliticsStatus) {
        this.proliticsStatus = proliticsStatus;
    }

    public String getStandardOfCulture() {
        return standardOfCulture;
    }

    public void setStandardOfCulture(String standardOfCulture) {
        this.standardOfCulture = standardOfCulture;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getCensusRegister() {
        return censusRegister;
    }

    public void setCensusRegister(String censusRegister) {
        this.censusRegister = censusRegister;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getMarrigerAddress() {
        return marrigerAddress;
    }

    public void setMarrigerAddress(String marrigerAddress) {
        this.marrigerAddress = marrigerAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSupRankId() {
        return supRankId;
    }

    public void setSupRankId(Integer supRankId) {
        this.supRankId = supRankId;
    }

    public String getSupRankName() {
        return supRankName;
    }

    public void setSupRankName(String supRankName) {
        this.supRankName = supRankName;
    }

    public Integer getCorPerStateId() {
        return corPerStateId;
    }

    public void setCorPerStateId(Integer corPerStateId) {
        this.corPerStateId = corPerStateId;
    }

    public String getCorPerState() {
        return corPerState;
    }

    public void setCorPerState(String corPerState) {
        this.corPerState = corPerState;
    }

    public String getAccusation() {
        return accusation;
    }

    public void setAccusation(String accusation) {
        this.accusation = accusation;
    }

    public Integer getPerCatId() {
        return perCatId;
    }

    public void setPerCatId(Integer perCatId) {
        this.perCatId = perCatId;
    }

    public String getPerformCategory() {
        return performCategory;
    }

    public void setPerformCategory(String performCategory) {
        this.performCategory = performCategory;
    }

    public String getJudgmentNum() {
        return judgmentNum;
    }

    public void setJudgmentNum(String judgmentNum) {
        this.judgmentNum = judgmentNum;
    }

    public Date getJudgmentTime() {
        return judgmentTime;
    }

    public void setJudgmentTime(Date judgmentTime) {
        this.judgmentTime = judgmentTime;
    }

    public Integer getJudgmentOrgId() {
        return judgmentOrgId;
    }

    public void setJudgmentOrgId(Integer judgmentOrgId) {
        this.judgmentOrgId = judgmentOrgId;
    }

    public Organization getJudgmentOrg() {
        return judgmentOrg;
    }

    public void setJudgmentOrg(Organization judgmentOrg) {
        this.judgmentOrg = judgmentOrg;
    }

    public String getJudgmentDeadline() {
        return judgmentDeadline;
    }

    public void setJudgmentDeadline(String judgmentDeadline) {
        this.judgmentDeadline = judgmentDeadline;
    }

    public String getAdditionPenal() {
        return additionPenal;
    }

    public void setAdditionPenal(String additionPenal) {
        this.additionPenal = additionPenal;
    }

    public String getPenalDeadline() {
        return penalDeadline;
    }

    public void setPenalDeadline(String penalDeadline) {
        this.penalDeadline = penalDeadline;
    }

    public String getCorrectDeadline() {
        return correctDeadline;
    }

    public void setCorrectDeadline(String correctDeadline) {
        this.correctDeadline = correctDeadline;
    }

    public String getCorrectBeginTime() {
        return correctBeginTime;
    }

    public void setCorrectBeginTime(String correctBeginTime) {
        this.correctBeginTime = correctBeginTime;
    }

    public String getCorrectEndTime() {
        return correctEndTime;
    }

    public void setCorrectEndTime(String correctEndTime) {
        this.correctEndTime = correctEndTime;
    }

    public Organization getCorOrg() {
        return corOrg;
    }

    public void setCorOrg(Organization corOrg) {
        this.corOrg = corOrg;
    }

    public Manager getManManger() {
        return manManger;
    }

    public void setManManger(Manager manManger) {
        this.manManger = manManger;
    }


}
