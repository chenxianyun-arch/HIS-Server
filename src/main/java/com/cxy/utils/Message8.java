package com.cxy.utils;

import com.cxy.pojo.Jiaoyi;
import com.cxy.pojo.Refund;
import lombok.Data;

import java.util.List;

@Data
public class Message8 {

  // 装userlist的列表
  private List<Jiaoyi> userList;

  // 装有多少页数
  Integer pageLength;
}
