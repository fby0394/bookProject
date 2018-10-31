package com.cor.aaa.dao;

import com.cor.aaa.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 范博源
 * 创建时间：2018-10-12
 * 管理人员信息Dao
 */
@Repository
@Mapper
public interface ManagerDao {

    /**
     * 查看全部管理人员信息
     *
     * @return
     */
    public List<Manager> queryAllMan();

    /**
     * 用户登录
     * @param man
     * @return
     */
    public Manager queryAllMan(Manager man);
    /**
     * 添加管理人员
     *
     * @param man
     * @return
     */
    public int addMan(Manager man);

    /**
     * 修改管理人员信息
     *
     * @param man
     * @return
     */
    public int updateMan(Manager man);

    /**
     * 删除管理人员（改变状态为离职）
     *
     * @param managerId 要删除的管理人员ID
     * @return
     */
    public int delMan(Integer managerId);
}
