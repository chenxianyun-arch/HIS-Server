package com.cxy.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (Shenhe)实体类
 *
 * @author makejava
 * @since 2021-03-21 22:35:50
 */
public class Shenhe implements Serializable {
    private static final long serialVersionUID = 817628094836120544L;
    
    private Integer shenheId;
    
    private String shenheName;
    
    private String shenhePicture;
    
    private Double shenhePrice;
    
    private String shenheState;
    
    private String shenheZhuangtai;
    
    private String shenheKucun;
    
    private String shenheTime;


    public Integer getShenheId() {
        return shenheId;
    }

    public void setShenheId(Integer shenheId) {
        this.shenheId = shenheId;
    }

    public String getShenheName() {
        return shenheName;
    }

    public void setShenheName(String shenheName) {
        this.shenheName = shenheName;
    }

    public String getShenhePicture() {
        return shenhePicture;
    }

    public void setShenhePicture(String shenhePicture) {
        this.shenhePicture = shenhePicture;
    }

    public Double getShenhePrice() {
        return shenhePrice;
    }

    public void setShenhePrice(Double shenhePrice) {
        this.shenhePrice = shenhePrice;
    }

    public String getShenheState() {
        return shenheState;
    }

    public void setShenheState(String shenheState) {
        this.shenheState = shenheState;
    }

    public String getShenheZhuangtai() {
        return shenheZhuangtai;
    }

    public void setShenheZhuangtai(String shenheZhuangtai) {
        this.shenheZhuangtai = shenheZhuangtai;
    }

    public String getShenheKucun() {
        return shenheKucun;
    }

    public void setShenheKucun(String shenheKucun) {
        this.shenheKucun = shenheKucun;
    }

    public String getShenheTime() {
        return shenheTime;
    }

    public void setShenheTime(String shenheTime) {
        this.shenheTime = shenheTime;
    }

}