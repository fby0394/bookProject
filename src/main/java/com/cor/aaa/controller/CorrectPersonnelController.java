package com.cor.aaa.controller;

import com.cor.aaa.entity.CorrectPersonnel;
import com.cor.aaa.entity.DataTableJson;
import com.cor.aaa.service.CorrectPersonnelService;
import com.cor.aaa.util.flieUploadSpringMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
     *
     * @return
     */
    @RequestMapping("/queryAllCorPer")
    @ResponseBody
    public DataTableJson queryAll() {
        return service.queryAllCorPer();
    }

    /**
     * 显示矫正人员页面
     *
     * @return
     */
    @RequestMapping("/showCorPer")
    public String showCorPer() {
        return "Main/CorPerManager.html";
    }

    /**
     * 显示添加矫正人员页面
     *
     * @return
     */
    @RequestMapping("/showAddCorPer")
    public String showAddCorPer() {
        return "Main/addCorPer.html";
    }

    /**
     * 添加矫正人员
     *
     * @return
     */
    @RequestMapping(value = "/addCorPer", method = RequestMethod.POST)
    @ResponseBody
    public boolean addCorPer(CorrectPersonnel corPer, MultipartFile corPerPicFlie) {
        corPer.setCorPerPic(flieUploadSpringMvc.fileUpload(corPerPicFlie, "src/main/resources/static/images/CorPerPic"));
        return service.addCorPer(corPer);
    }

    /**
     * 显示矫正人员详细信息
     *
     * @param corPerId
     * @return
     */
    @RequestMapping("/showCorPerInfo")
    public ModelAndView showCorPerInfo(Integer corPerId) {
        ModelAndView mav = new ModelAndView("Main/showCorPerInfo.html");
        CorrectPersonnel corPer = service.queryAllCorPer(corPerId);
        mav.addObject("corPer", corPer);
        return mav;
    }

}
