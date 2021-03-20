package com.cxy.pojo;

import java.io.Serializable;

/**
 * (Jiesuan)实体类
 *
 * @author makejava
 * @since 2021-03-20 14:49:36
 */
public class Jiesuan implements Serializable {
    private static final long serialVersionUID = 233065366381782910L;
    /**
    * 结算id
    */
    private Integer jiesuanId;
    /**
    * 结算医生
    */
    private String jiesuanDoctor;
    /**
    * 结算金额
    */
    private Double jiesuanPrice;
    /**
    * 银行卡号
    */
    private String jiesuanCard;
    /**
    * 结算状态
    */
    private String jiesuanState;
    /**
    * 结算时间
    */
    private Object jiesuanDate;


    public Integer getJiesuanId() {
        return jiesuanId;
    }

    public void setJiesuanId(Integer jiesuanId) {
        this.jiesuanId = jiesuanId;
    }

    public String getJiesuanDoctor() {
        return jiesuanDoctor;
    }

    public void setJiesuanDoctor(String jiesuanDoctor) {
        this.jiesuanDoctor = jiesuanDoctor;
    }

    public Double getJiesuanPrice() {
        return jiesuanPrice;
    }

    public void setJiesuanPrice(Double jiesuanPrice) {
        this.jiesuanPrice = jiesuanPrice;
    }

    public String getJiesuanCard() {
        return jiesuanCard;
    }

    public void setJiesuanCard(String jiesuanCard) {
        this.jiesuanCard = jiesuanCard;
    }

    public String getJiesuanState() {
        return jiesuanState;
    }

    public void setJiesuanState(String jiesuanState) {
        this.jiesuanState = jiesuanState;
    }

    public Object getJiesuanDate() {
        return jiesuanDate;
    }

    public void setJiesuanDate(Object jiesuanDate) {
        this.jiesuanDate = jiesuanDate;
    }

}