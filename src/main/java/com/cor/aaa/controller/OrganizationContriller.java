package com.cor.aaa.controller;

import com.cor.aaa.entity.DataTableJson;
import com.cor.aaa.entity.Manager;
import com.cor.aaa.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/org")
/**
 * 工作人员管理控制层
 * @Author: 范博源
 * @Date: 2018-10-16 14:23
 */
public class OrganizationContriller {

    @Autowired
    OrganizationService service;

    /**
     * 显示部门管理页面
     *
     * @return
     */
    @RequestMapping("/showOrgHtml")
    public String showOrgHtml() {

        return "Main/orgManager.html";
    }

    /**
     * 查看全部部门信息
     *
     * @return
     */
    @RequestMapping("/queryAllOrg")
    @ResponseBody
    public DataTableJson queryAllOrg() {
        return service.queryAllOrg();
    }

    /**
     * 查看可管理的部门信息
     *
     * @param request
     * @return
     */
    @RequestMapping("/queryManAllOrg")
    @ResponseBody
    public DataTableJson queryManAllOrg(HttpServletRequest request) {
        Manager man = (Manager) request.getSession().getAttribute("manager");
        return service.queryAllOrg(man.getOrgId());
    }
}
