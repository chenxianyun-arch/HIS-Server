package com.cxy.pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
/**
 * 用户实体类
 */
public class User {

  public User(String date, String name, String time, Boolean value, String phone, String password) {
    this.date = date;
    this.name = name;
    this.time = time;
    this.value = value;
    this.phone = phone;
    this.password = password;
  }

  // 用户ID
  private Integer userId;

  // 时间
  private String date;

  // 用户姓名
  private String name;

  //时间 time
  private String time;

  // 是否开启账号
  private Boolean value;

  // 电话
  private String phone;

  // 用户密码
  private String password;
}
