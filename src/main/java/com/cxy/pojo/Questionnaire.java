package com.cxy.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (Questionnaire)实体类
 *
 * @author makejava2021-02-24 21:42:08
 * @since
 */
@Data

public class Questionnaire implements Serializable {
    private static final long serialVersionUID = 955930899867106882L;
    /**
    * 问诊单ID
    */
    private Integer questionnaireId;
    /**
    * 问诊时间
    */
    private String questionnaireTime;
    /**
    * 问诊单的名字
    */
    private String questionnairePatient;
    /**
    * 科室
    */
    private String questionnaireKeshi;
    /**
    * 医生
    */
    private String questionnaireDoctor;
    /**
    * 问诊方式
    */
    private String questionnaireWay;
    /**
    * 问诊来源
    */
    private String questionnaireSource;
    /**
    * 花费费用
    */
    private Double questionnaireCost;
    /**
    * 订单状态
    */
    private String questionnaireState;



}