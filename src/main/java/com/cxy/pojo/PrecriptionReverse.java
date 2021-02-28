package com.cxy.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (PrecriptionReverse)实体类
 *
 * @author makejava
 * @since 2021-02-28 22:55:41
 */
@Data
public class PrecriptionReverse implements Serializable {
    private static final long serialVersionUID = -70067651774602950L;
    /**
    * 扭转订单id
    */
    private Integer reverseId;
    /**
    * 订单编号
    */
    private Integer reverseNumber;
    /**
    * 处方编号
    */
    private Integer prescriptionNumber;
    /**
    * 患者
    */
    private String patient;
    /**
    * 科室
    */
    private String keshi;
    /**
    * 医生
    */
    private String doctor;
    /**
    * 费用
    */
    private Double price;
    /**
    * 订单状态
    */
    private String orderState;
    /**
    * 处方单状态
    */
    private String chufangState;
    /**
    * 购药方式
    */
    private String payWay;
    /**
    * 发药状态
    */
    private String fayaoState;



}