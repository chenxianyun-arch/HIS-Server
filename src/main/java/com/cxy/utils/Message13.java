package com.cxy.utils;

import com.cxy.pojo.Shenhe;
import lombok.Data;

import java.util.List;

@Data
public class Message13 {

  // 装userlist的列表
  private List<Shenhe> userList;

  // 装有多少页数
  Integer pageLength;
}
