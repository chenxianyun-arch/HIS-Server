package com.cxy.pojo;

import java.io.Serializable;

/**
 * (Received)实体类
 *
 * @author makejava
 * @since 2021-03-20 15:50:35
 */
public class Received implements Serializable {
    private static final long serialVersionUID = 354387622333443983L;
    /**
    * 接受id
    */
    private Integer receivedId;
    /**
    * 转账金额（税后）
    */
    private Double receivedPrice;
    /**
    * 银行卡号
    */
    private String receivedCard;
    /**
    * 状态
    */
    private String receivedState;
    /**
    * 说明
    */
    private String receivedDesc;
    /**
    * 发起人
    */
    private String receivedStartman;
    /**
    * 转账时间
    */
    private Object receivedTime;
    /**
    * 接受者
    */
    private String receivedName;


    public Integer getReceivedId() {
        return receivedId;
    }

    public void setReceivedId(Integer receivedId) {
        this.receivedId = receivedId;
    }

    public Double getReceivedPrice() {
        return receivedPrice;
    }

    public void setReceivedPrice(Double receivedPrice) {
        this.receivedPrice = receivedPrice;
    }

    public String getReceivedCard() {
        return receivedCard;
    }

    public void setReceivedCard(String receivedCard) {
        this.receivedCard = receivedCard;
    }

    public String getReceivedState() {
        return receivedState;
    }

    public void setReceivedState(String receivedState) {
        this.receivedState = receivedState;
    }

    public String getReceivedDesc() {
        return receivedDesc;
    }

    public void setReceivedDesc(String receivedDesc) {
        this.receivedDesc = receivedDesc;
    }

    public String getReceivedStartman() {
        return receivedStartman;
    }

    public void setReceivedStartman(String receivedStartman) {
        this.receivedStartman = receivedStartman;
    }

    public Object getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Object receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getReceivedName() {
        return receivedName;
    }

    public void setReceivedName(String receivedName) {
        this.receivedName = receivedName;
    }

}