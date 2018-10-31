package com.cor.aaa.dao;

import com.cor.aaa.entity.CorrectPersonnel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 矫正人员信息DAO
 *
 * @Author:范博源
 * @Date:2018-10-30 08:25
 */
@Repository
@Mapper
public interface CorrectPersonnelDao {
    /**
     * 根据判决机关或矫正机关查看人员信息
     *
     * @return
     */
    public List<CorrectPersonnel> queryAllCorPer();

    /**
     * 添加矫正人员
     *
     * @param corPer
     * @return
     */
    public int addCorPer(CorrectPersonnel corPer);

    /**
     * 修改矫正人员信息
     *
     * @param corPer
     * @return
     */
    public int updateCorPer(CorrectPersonnel corPer);
}
