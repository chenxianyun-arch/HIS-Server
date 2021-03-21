package com.cxy.utils;

import com.cxy.pojo.Medecine;
import com.cxy.pojo.Yaopin;
import lombok.Data;

import java.util.List;

@Data
public class Message12 {

  // 装userlist的列表
  private List<Yaopin> userList;

  // 装有多少页数
  Integer pageLength;
}
