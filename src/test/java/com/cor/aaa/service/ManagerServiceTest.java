package com.cor.aaa.service;

import com.cor.aaa.entity.CorrectPersonnel;
import com.cor.aaa.entity.DataTableJson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:范博源
 * @Date:2018-10-12 16:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ManagerServiceTest {

    @Autowired
    ManagerService manService;

    @Autowired
    CorrectPersonnelService corPerService;

    @Test
    public void queryAllMan() {
        CorrectPersonnel corPer = corPerService.queryAllCorPer(1);
        System.out.println(corPer);
        DataTableJson dataTableJson = corPerService.queryAllCorPer();
        System.out.println(dataTableJson.getiTotalRecords());
    }
}