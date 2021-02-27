package com.cxy.pojo;

import lombok.Data;

import java.util.Date;

@Data
/**
 * (Wenzhen)实体类
 *
 * @author makejava
 * @since 2021-02-27 21:43:16
 */
public class Wenzhen {
    /**
    * 问诊ID
    */
    private Integer wenzhenId;
    /**
    * 问诊时间
    */
    private String wenzhenTime;
    /**
    * 问诊人
    */
    private String wenzhenUsername;
    /**
    * 问诊医生
    */
    private String wenzhenDoctor;
    /**
    * 问诊科室
    */
    private String wenzhenKeshi;
    /**
    * 问诊价格
    */
    private Double wenzhenPrice;
    /**
    * 问诊状态
    */
    private String wenzhenState;

}