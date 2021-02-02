package com.cxy;

import com.alibaba.fastjson.JSON;
import com.cxy.pojo.user.User;

public class Test {
  public static void main(String[] args) {
    User user = new User(1,"1122","hahah","sfsfsf",false,"123333");
    String userString = JSON.toJSONString(user);
    System.out.println(userString);
  }
}
