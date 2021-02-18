package com.cxy.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * doctor
 * @author chenxianyun
 */
@Data
public class Doctor implements Serializable {
    /**
     * 医生id
     */
    private Integer doctorId;

    /**
     * 医生姓名
     */
    private String doctorName;

    /**
     * 医生电话
     */
    private String doctorTel;

    /**
     * 医生所属医院
     */
    private String doctorHospital;

    /**
     * 医生科室
     */
    private String doctorKeshi;

    /**
     * 医生职称
     */
    private String doctorZhiceng;

    /**
     * 医生添加时间
     */
    private String doctorAddtime;

    /**
     * 审核通过与否
     */
    private String doctorStatus;

    /**
     * 服务审核通过与否
     */
    private String doctorServiceStatus;

    /**
     * 医生拥有的粉丝数量
     */
    private Integer doctorFansnumber;

    private static final long serialVersionUID = 1L;
}