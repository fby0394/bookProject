package com.cor.aaa.service;

import com.cor.aaa.entity.DataTableJson;
import com.cor.aaa.entity.Manager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author:范博源
 * @Date:2018-10-12 16:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ManagerServiceTest {

    @Autowired
    ManagerService manService;
    @Test
    public void queryAllMan() {
        DataTableJson dataTableJson = manService.queryAllMan();
        List<Manager> list = (List<Manager>) dataTableJson.getAaData();
        /*for ( Manager man:list) {
            System.out.println(man.toString());
        }*/
        Manager manager = manService.queryAllMan(list.get(1));
        System.out.println(manager);
    }
}