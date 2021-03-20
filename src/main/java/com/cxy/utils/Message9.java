package com.cxy.utils;

import com.cxy.pojo.Jiaoyi;
import com.cxy.pojo.Jiesuan;
import lombok.Data;

import java.util.List;

@Data
public class Message9 {

  // 装userlist的列表
  private List<Jiesuan> userList;

  // 装有多少页数
  Integer pageLength;
}
