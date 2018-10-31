package com.cor.aaa.service;

import com.cor.aaa.dao.OrganizationDao;
import com.cor.aaa.entity.DataTableJson;
import com.cor.aaa.entity.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 机构信息Service
 */
@Service
public class OrganizationService {

    @Autowired
    public OrganizationDao orgDao;

    /**
     * 查询全部机构
     *
     * @return
     */
    public DataTableJson queryAllOrg() {
        List<Organization> organizationList = orgDao.queryAllOrg();
        return new DataTableJson(organizationList.size(), organizationList);
    }

    /**
     * 根据部门编号获取指定部门的信息
     *
     * @param orgId 部门编号
     * @return
     */
    public Organization queryAllOrg(Integer orgId) {
        return orgDao.queryAllOrg(orgId);
    }

    /**
     * 添加机构信息
     *
     * @param org 机构信息
     * @return
     */
    public boolean addOrg(Organization org) {
        if (orgDao.addOrg(org) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 修改修改机构信息
     *
     * @param org 机构信息
     * @return
     */
    public boolean updateOrg(Organization org) {
        if (orgDao.updateOrg(org) > 0) {
            return true;
        }
        return false;
    }

}
