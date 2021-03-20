package com.cxy.utils;

import com.cxy.pojo.Medecine;
import com.cxy.pojo.Received;
import lombok.Data;

import java.util.List;

@Data
public class Message11 {

  // 装userlist的列表
  private List<Medecine> userList;

  // 装有多少页数
  Integer pageLength;
}
