package com.cxy.controller;

import com.cxy.pojo.LoginBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录请求
 */
@RestController
public class LoginController {

  @PostMapping("/login")
  public String login(@RequestBody LoginBody loginBody){
    System.out.println(loginBody.toString());
    System.out.println("hello");
    return "登录成功";
  }

  @GetMapping("/test")
  public String test() {
    System.out.println("test");
    return "登录成功";
  }
}
