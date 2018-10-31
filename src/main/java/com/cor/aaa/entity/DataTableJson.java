package com.cor.aaa.entity;

/**
 * 用于返回datatable插件能接收的数据
 * @Author:范博源
 * @Date:2018-10-24 13:47
 */
public class DataTableJson {
    /**
     * 实际的行数
     */
    private int iTotalRecords;
    /**
     * 过滤后实际的行数
     */
    private int iTotalDisplayRecords;

    /**
     * 来自客户端 sEcho 的没有变化的复制品，
     */
    private String sEcho;

    /**
     * 可选，以逗号分隔的列名，
     */
    private String sColumns;

    /**
     * 数组的数组，表格中的实际数据。
     */
    private Object aaData;

    public DataTableJson() {
    }

    /**
     * 创建要返回数据对象 保存行数和数据
     * @param iTotalRecords  实际行数
     * @param aaData 要返回的数据
     */
    public DataTableJson(int iTotalRecords, Object aaData) {
        this.iTotalRecords = iTotalRecords;
        this.aaData = aaData;
    }

    public int getiTotalRecords() {
        return iTotalRecords;
    }

    public void setiTotalRecords(int iTotalRecords) {
        this.iTotalRecords = iTotalRecords;
    }

    public int getiTotalDisplayRecords() {
        return iTotalDisplayRecords;
    }

    public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
        this.iTotalDisplayRecords = iTotalDisplayRecords;
    }

    public String getsEcho() {
        return sEcho;
    }

    public void setsEcho(String sEcho) {
        this.sEcho = sEcho;
    }

    public String getsColumns() {
        return sColumns;
    }

    public void setsColumns(String sColumns) {
        this.sColumns = sColumns;
    }

    public Object getAaData() {
        return aaData;
    }

    public void setAaData(Object aaData) {
        this.aaData = aaData;
    }
}