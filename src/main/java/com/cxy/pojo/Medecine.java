package com.cxy.pojo;

import java.io.Serializable;

/**
 * (Medecine)实体类
 *
 * @author makejava
 * @since 2021-03-20 17:02:01
 */
public class Medecine implements Serializable {
    private static final long serialVersionUID = -84123560080239721L;
    
    private Integer medecineId;
    
    private String medecineName;
    
    private String medecinePicture;
    
    private Double medecinePrice;
    
    private boolean medecineShangjia;
    
    private String medecineState;
    
    private Object medecineTime;
    
    private Object medecineSize;


    public Integer getMedecineId() {
        return medecineId;
    }

    public void setMedecineId(Integer medecineId) {
        this.medecineId = medecineId;
    }

    public String getMedecineName() {
        return medecineName;
    }

    public void setMedecineName(String medecineName) {
        this.medecineName = medecineName;
    }

    public String getMedecinePicture() {
        return medecinePicture;
    }

    public void setMedecinePicture(String medecinePicture) {
        this.medecinePicture = medecinePicture;
    }

    public Double getMedecinePrice() {
        return medecinePrice;
    }

    public void setMedecinePrice(Double medecinePrice) {
        this.medecinePrice = medecinePrice;
    }

    public boolean getMedecineShangjia() {
        return medecineShangjia;
    }

    public void setMedecineShangjia(boolean medecineShangjia) {
        this.medecineShangjia = medecineShangjia;
    }

    public String getMedecineState() {
        return medecineState;
    }

    public void setMedecineState(String medecineState) {
        this.medecineState = medecineState;
    }

    public Object getMedecineTime() {
        return medecineTime;
    }

    public void setMedecineTime(Object medecineTime) {
        this.medecineTime = medecineTime;
    }

    public Object getMedecineSize() {
        return medecineSize;
    }

    public void setMedecineSize(Object medecineSize) {
        this.medecineSize = medecineSize;
    }

}