package com.cxy.utils;

import com.cxy.pojo.Orders;
import com.cxy.pojo.PrecriptionReverse;
import lombok.Data;

import java.util.List;

@Data
public class Message6 {

  // 装userlist的列表
  private List<PrecriptionReverse> userList;

  // 装有多少页数
  Integer pageLength;
}
