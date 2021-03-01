package com.cxy.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (Refund)实体类
 *
 * @author makejava
 * @since 2021-03-01 22:49:23
 */
@Data
public class Refund implements Serializable {
    private static final long serialVersionUID = -83431274280164074L;
    /**
    * 退款Id
    */
    private Integer refundId;
    /**
    * 服务编号
    */
    private Integer refundNumber;
    /**
    * 申请时间
    */
    private Object refundDate;
    /**
    * 用户
    */
    private String refundUsername;
    /**
    * 退款价格
    */
    private Double refundPrice;
    /**
    * 来源
    */
    private String refundSource;
    /**
    * 状态
    */
    private String refundState;
    /**
    * 处理时间
    */
    private Object refundTime;



}