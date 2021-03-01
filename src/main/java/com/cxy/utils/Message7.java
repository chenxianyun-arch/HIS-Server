package com.cxy.utils;

import com.cxy.pojo.PrecriptionReverse;
import com.cxy.pojo.Refund;
import lombok.Data;

import java.util.List;

@Data
public class Message7 {

  // 装userlist的列表
  private List<Refund> userList;

  // 装有多少页数
  Integer pageLength;
}
