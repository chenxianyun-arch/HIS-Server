package com.cxy.pojo;

import java.io.Serializable;

/**
 * 患者表(Patient)实体类
 *
 * @author makejava
 * @since 2021-02-21 19:33:33
 */
public class Patient implements Serializable {
    private static final long serialVersionUID = -45752590831172763L;
    /**
    * 患者ID
    */
    private Integer patientid;
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


    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientKeshi() {
        return patientKeshi;
    }

    public void setPatientKeshi(String patientKeshi) {
        this.patientKeshi = patientKeshi;
    }

    public String getPatientDoctor() {
        return patientDoctor;
    }

    public void setPatientDoctor(String patientDoctor) {
        this.patientDoctor = patientDoctor;
    }

    public Double getPatientPrice() {
        return patientPrice;
    }

    public void setPatientPrice(Double patientPrice) {
        this.patientPrice = patientPrice;
    }

    public String getPatientState() {
        return patientState;
    }

    public void setPatientState(String patientState) {
        this.patientState = patientState;
    }

}