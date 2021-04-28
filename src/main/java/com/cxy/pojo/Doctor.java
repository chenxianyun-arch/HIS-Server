package com.cxy.pojo;

import java.io.Serializable;

import lombok.*;

/**
 * 医生实体类
 *
 * doctor
 * @author chenxianyun
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Doctor implements Serializable {

    public Doctor(String doctorName, String doctorPassword, String doctorTel, String doctorHospital, String doctorKeshi, String doctorZhiceng, String doctorAddtime, String doctorStatus, String doctorServiceStatus, Integer doctorFansnumber) {
        this.doctorName = doctorName;
        this.doctorPassword = doctorPassword;
        this.doctorTel = doctorTel;
        this.doctorHospital = doctorHospital;
        this.doctorKeshi = doctorKeshi;
        this.doctorZhiceng = doctorZhiceng;
        this.doctorAddtime = doctorAddtime;
        this.doctorStatus = doctorStatus;
        this.doctorServiceStatus = doctorServiceStatus;
        this.doctorFansnumber = doctorFansnumber;
    }

    /**
     * 医生id
     */
    private Integer doctorId;

    /**
     * 医生姓名
     */
    private String doctorName;

    /**
     * 医生密码
     */
    private String doctorPassword;

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