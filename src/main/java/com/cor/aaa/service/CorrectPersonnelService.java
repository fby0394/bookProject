package com.cor.aaa.service;

import com.cor.aaa.dao.CorrectPersonnelDao;
import com.cor.aaa.entity.CorrectPersonnel;
import com.cor.aaa.entity.DataTableJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 矫正人员信息service
 *
 * @Author:范博源
 * @Date:2018-10-30 09:35
 */
@Service
public class CorrectPersonnelService {
    @Autowired
    CorrectPersonnelDao corPerDao;

    /**
     * 查看全部矫正人员信息
     *
     * @return
     */
    public DataTableJson queryAllCorPer() {
        List<CorrectPersonnel> corPerlList = corPerDao.queryAllCorPer();
        return new DataTableJson(corPerlList.size(), corPerlList);
    }
}
