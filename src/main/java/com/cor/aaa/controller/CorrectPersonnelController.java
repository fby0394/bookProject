package com.cor.aaa.controller;

import com.cor.aaa.entity.DataTableJson;
import com.cor.aaa.service.CorrectPersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:范博源
 * @Date:2018-10-30 09:38
 */
@Controller
@RequestMapping("/CorPer")
public class CorrectPersonnelController {

    @Autowired
    CorrectPersonnelService service;


    /**
     * 查看人员信息
     * @return
     */
    @RequestMapping("/queryAllCorPer")
    @ResponseBody
    public DataTableJson queryAll() {
        return service.queryAllCorPer();
    }

    /**
     * 显示矫正人员页面
     * @return
     */
    @RequestMapping("/showCorPer")
    public String showCorPer() {
        return "Main/CorPerManager.html";
    }

    /**
     * 显示添加矫正人员页面
     * @return
     */
    @RequestMapping("/showAddCorPer")
    public String showAddCorPer() {
        return "Main/addCorPer.html";
    }

}
