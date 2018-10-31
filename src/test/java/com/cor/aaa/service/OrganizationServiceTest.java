package com.cor.aaa.service;

import com.cor.aaa.entity.Organization;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class OrganizationServiceTest {

    @Autowired
    OrganizationService orgService;
    @Autowired
    ManagerService manService;

    @Test
    public void queryAllOrg() {
        /*for (int i=0;i<list.size();i++){
            Manager man=new Manager();
            man.setPwd("123456");
            if(list.get(i).getOrgType()==0)
            man.setManagerName(list.get(i).getOrgName().substring(0,2) +"_司法_"+list.get(i).getOrgId());
            else man.setManagerName(list.get(i).getOrgName().substring(0,2)+"_法院_"+list.get(i).getOrgId());
            man.setOrgId(list.get(i).getOrgId());
            man.setRoleId(1);
            man.setPhone("181"+"15"+(185120+list.get(i).getOrgId()));
            manService.addMan(man);

            man.setRoleId(2);
            man.setPhone("181"+"17"+(185120+list.get(i).getOrgId()));
            man.setManagerName(man.getManagerName()+"_工作");

            manService.addMan(man);
        }*/
    }

    public void forQuery(List<Organization> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            if (null != list.get(i).getSupOrg()) {
                System.out.println(list.get(i).getSupOrg().toString());
            }
            if (null != list.get(i).getSubOrgs() && list.get(i).getSubOrgs().size() > 0) {
                forQuery(list.get(i).getSubOrgs());
            }

        }
    }
    public void forQuery(Organization org) {

        if(null!=org.getSupOrg()){
            System.out.println(org.getSupOrg().toString());
            forQuery(org.getSupOrg());
        }
    }

}