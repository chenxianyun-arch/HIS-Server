package com.cxy.utils;

import com.cxy.pojo.Jiesuan;
import com.cxy.pojo.Received;
import lombok.Data;

import java.util.List;

@Data
public class Message10 {

  // 装userlist的列表
  private List<Received> userList;

  // 装有多少页数
  Integer pageLength;
}
