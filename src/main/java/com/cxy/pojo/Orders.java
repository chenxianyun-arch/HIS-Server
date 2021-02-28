package com.cxy.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (Orders)实体类
 * @author makejava
 * @since 2021-02-27 22:58:21
 */
@Data
public class Orders implements Serializable {
    private static final long serialVersionUID = 379690648805926802L;
    /**
    * 订单id
    */
    private Integer orderId;
    /**
     * 订单提交时间
     */
    private Object orderTime;
    /**
    * 订单用户名
    */
    private String orderUsername;
    /**
    * 订单收货人
    */
    private String orderGetname;
    /**
    * 订金价格
    */
    private Double orderPrice;
    /**
     * 订单状态
     */
    private String orderState;


}