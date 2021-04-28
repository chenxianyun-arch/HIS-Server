package com.cxy.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * (Admin)实体类
 *
 * @author makejava
 * @since 2021-04-28 14:40:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Admin implements Serializable {
    public Admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    /**
    * 管理员id
    */
    private Integer adminId;
    /**
    * 管理员姓名
    */
    private String adminName;
    /**
    * 管理员密码
    */
    private String adminPassword;


}