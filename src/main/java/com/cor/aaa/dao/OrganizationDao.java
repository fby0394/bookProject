package com.cor.aaa.dao;

import com.cor.aaa.entity.Organization;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 机构信息Dao接口
 */
@Mapper
@Repository
public interface OrganizationDao {

    /**
     * 查询全部机构
     *
     * @return
     */
    public List<Organization> queryAllOrg();

    /**
     * 根据部门编号获取指定部门的信息
     * @param orgId 部门编号
     * @return
     */
    public Organization queryAllOrg(@Param("orgId") Integer orgId);

    /**
     * 添加机构信息
     *
     * @param org 机构信息
     * @return
     */
    public int addOrg(Organization org);

    /**
     * 修改修改机构信息
     *
     * @param org 机构信息
     * @return
     */
    public int updateOrg(Organization org);

}
