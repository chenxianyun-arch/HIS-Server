package com.cxy.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 患者表(Patient)实体类
 *
 * @author makejava
 * @since 2021-02-21 19:33:33
 */
@Data
public class Patient {
    /**
    * 患者ID
    */
    private Integer patientId;
    /**
    * 患者姓名
    */
    private String patientName;
    /**
    * 患者科室
    */
    private String patientKeshi;
    /**
    * 患者所属医生
    */
    private String patientDoctor;
    /**
    * 所用费用价格
    */
    private Double patientPrice;
    /**
    * 审核是否通过
    */
    private String patientState;

    /**
     * 就诊时间
     */
    private String patientTime;


}