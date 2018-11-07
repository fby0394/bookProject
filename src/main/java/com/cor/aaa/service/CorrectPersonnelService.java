package com.cor.aaa.service;

import com.cor.aaa.dao.CorrectPersonnelDao;
import com.cor.aaa.entity.CorrectPersonnel;
import com.cor.aaa.entity.DataTableJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 矫正人员信息service
 *
 * @Author:范博源
 * @Date:2018-10-30 09:35
 */
@Service
@Transactional
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

    /**
     * 看指定矫正人员的详细信息
     *
     * @param corPerId
     * @return
     */
    public CorrectPersonnel queryAllCorPer(Integer corPerId) {
        return corPerDao.queryAllCorPer(corPerId);
    }

    /**
     * 添加入矫人员信息
     *
     * @param corPer
     * @return
     */
    public Boolean addCorPer(CorrectPersonnel corPer) {
        if (corPerDao.addCorPer(corPer) > 0 && corPerDao.addCorPerRel(corPer) > 0) {
            return true;
        }
        return false;
    }
}
