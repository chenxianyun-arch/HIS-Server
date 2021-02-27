package com.cxy.utils;

import com.cxy.pojo.Orders;
import lombok.Data;

import java.util.List;

@Data
public class Message5 {

  // 装userlist的列表
  private List<Orders> userList;

  // 装有多少页数
  Integer pageLength;
}
