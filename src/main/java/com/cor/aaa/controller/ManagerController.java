package com.cor.aaa.controller;

import com.cor.aaa.entity.DataTableJson;
import com.cor.aaa.entity.Manager;
import com.cor.aaa.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 管理人员信息Controller
 *
 * @Author:范博源
 * @Date:2018-10-12 18:26
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    ManagerService service;

    /**
     * 用户登录
     *
     * @param man
     * @param request
     * @return
     */
    @RequestMapping("/Login")
    public String Login(Manager man, HttpServletRequest request) {
        Manager manager = service.queryAllMan(man);
        if (null != manager) {
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(30 * 60);
            session.setAttribute("manager", manager);
            return "Main/index.html";
        }

        return "Login.html";
    }

    /**
     * 显示首页
     *
     * @return
     */
    @RequestMapping("/showMain")
    public String showMain() {
        return "Main/main.html";
    }

    /**
     * 查看全部人员信息，并返回json字符串至前台页面
     *
     * @return
     */
    @RequestMapping("/queryAllMan")
    @ResponseBody
    public DataTableJson queryData() {
        return service.queryAllMan();
    }

    /**
     * 显示人员管理页面
     *
     * @return
     */
    @RequestMapping("/showManHtml")
    public String showManHtml() {

        return "Main/adminManager.html";
    }

    /**
     * 添加工作人员
     *
     * @param man
     * @return
     */
    @RequestMapping("/addMan")
    @ResponseBody
    public boolean addMan(Manager man) {
        System.out.println(man.toString());
        return service.addMan(man);
    }

    @RequestMapping("/Logins")
    public String Logins(Manager man, HttpServletRequest request) {

        return "Main/AaaTetsHtml.html";
    }
}
