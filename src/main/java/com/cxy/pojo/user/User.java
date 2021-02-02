package com.cxy.pojo.user;

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

  // 用户ID
  private Integer userId;
  // 时间
  private String date;
  // 用户姓名
  private String name;

  //时间 time
  private String time;

  // 是否开启账号
  private boolean value;
}
