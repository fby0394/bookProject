package com.cor.aaa.controller;

import com.cor.aaa.entity.DataTableJson;
import com.cor.aaa.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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
    @RequestMapping("/showOrgHtml")
    public String showOrgHtml(){

        return "Main/orgManager.html";
    }
    @RequestMapping("/queryAllOrg")
    @ResponseBody
    public DataTableJson queryAllOrg() {
        return service.queryAllOrg();
    }
}
