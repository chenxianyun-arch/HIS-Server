package com.cxy.pojo;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2021-03-21 23:40:02
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -87407752341344356L;
    
    private Integer roleId;
    
    private String roleName;
    
    private String roleDesc;
    
    private String roleState;
    
    private Object roleTime;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleState() {
        return roleState;
    }

    public void setRoleState(String roleState) {
        this.roleState = roleState;
    }

    public Object getRoleTime() {
        return roleTime;
    }

    public void setRoleTime(Object roleTime) {
        this.roleTime = roleTime;
    }

}