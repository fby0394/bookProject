package com.cor.aaa.service;

import com.cor.aaa.dao.ManagerDao;
import com.cor.aaa.entity.DataTableJson;
import com.cor.aaa.entity.Manager;
import com.cor.aaa.util.PwdEncryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author:范博源
 * @Date:2018-10-12 15:09
 */
@Service
public class ManagerService {

    @Autowired
    ManagerDao manDAO;

    /**
     * 查看全部管理人员信息
     *
     * @return
     */
    public DataTableJson queryAllMan() {
        List<Manager> managerList = manDAO.queryAllMan();
        return new DataTableJson(managerList.size(),managerList);
    }

    /**
     * 根据部门编号查询该部门下所有管理人员的信息
     *
     * @param orgId
     * @return
     */
    public List<Manager> queryOrgAllMan(Integer orgId) {

        return null;
    }


    /**
     * 用户登录
     *
     * @param man
     * @return
     */
    public Manager queryAllMan(Manager man) {
        try {
            man.setPwd(PwdEncryption.PwdEncry(man.getPwd()));
        }catch (Exception e){
            man.setPwd("");
        }
        return manDAO.queryAllMan(man);
    }

    /**
     * 添加管理人员
     *
     * @param man
     * @return
     */
    public boolean addMan(Manager man) {
        man.setHireDate(new Date());
        man.setStatus(0);
        man.setPwd(PwdEncryption.PwdEncry(man.getPhone().substring(0,6)));
        if (manDAO.addMan(man) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 修改管理人员信息
     *
     * @param man
     * @return
     */
    public boolean updateMan(Manager man) {
        if (manDAO.updateMan(man) > 0) {
            return true;
        }
        return false;
    }

    /**
     * 删除管理人员（改变状态为离职）
     *
     * @param managerId 要删除的管理人员ID
     * @return
     */
    public boolean delMan(Integer managerId) {
        if (manDAO.delMan(managerId) > 0) {
            return true;
        }
        return false;
    }
}
