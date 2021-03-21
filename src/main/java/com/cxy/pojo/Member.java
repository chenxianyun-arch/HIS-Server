package com.cxy.pojo;

import java.io.Serializable;

/**
 * (Member)实体类
 *
 * @author makejava
 * @since 2021-03-21 23:20:18
 */
public class Member implements Serializable {
    private static final long serialVersionUID = -75135497779515773L;
    
    private Integer memberId;
    
    private String memberName;
    
    private String memberPhone;
    
    private String memberRole;
    
    private Object memberState;
    
    private Object memberTime;


    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole;
    }

    public Object getMemberState() {
        return memberState;
    }

    public void setMemberState(Object memberState) {
        this.memberState = memberState;
    }

    public Object getMemberTime() {
        return memberTime;
    }

    public void setMemberTime(Object memberTime) {
        this.memberTime = memberTime;
    }

}