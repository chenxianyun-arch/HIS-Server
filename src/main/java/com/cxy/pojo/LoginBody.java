package com.cxy.pojo;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class LoginBody {
  // 用户id
  private String id;
  // 用户名
  private String username;
  // 用户密码
  private String password;

}
