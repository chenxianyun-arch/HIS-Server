package com.cxy.pojo;

import java.io.Serializable;

/**
 * (Yaopin)实体类
 *
 * @author makejava
 * @since 2021-03-20 23:53:43
 */
public class Yaopin implements Serializable {
    private static final long serialVersionUID = -58908050311739405L;
    
    private Integer yaopinId;
    
    private String yaopinName;
    
    private String yaopinJibie;
    
    private String yaopinState;
    
    private String yaopinBeizhu;
    
    private String yaopinShangchuan;
    
    private Object yaopinDate;


    public Integer getYaopinId() {
        return yaopinId;
    }

    public void setYaopinId(Integer yaopinId) {
        this.yaopinId = yaopinId;
    }

    public String getYaopinName() {
        return yaopinName;
    }

    public void setYaopinName(String yaopinName) {
        this.yaopinName = yaopinName;
    }

    public String getYaopinJibie() {
        return yaopinJibie;
    }

    public void setYaopinJibie(String yaopinJibie) {
        this.yaopinJibie = yaopinJibie;
    }

    public String getYaopinState() {
        return yaopinState;
    }

    public void setYaopinState(String yaopinState) {
        this.yaopinState = yaopinState;
    }

    public String getYaopinBeizhu() {
        return yaopinBeizhu;
    }

    public void setYaopinBeizhu(String yaopinBeizhu) {
        this.yaopinBeizhu = yaopinBeizhu;
    }

    public String getYaopinShangchuan() {
        return yaopinShangchuan;
    }

    public void setYaopinShangchuan(String yaopinShangchuan) {
        this.yaopinShangchuan = yaopinShangchuan;
    }

    public Object getYaopinDate() {
        return yaopinDate;
    }

    public void setYaopinDate(Object yaopinDate) {
        this.yaopinDate = yaopinDate;
    }

}