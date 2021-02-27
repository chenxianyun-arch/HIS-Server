package com.cxy.utils;

import com.cxy.pojo.Wenzhen;
import lombok.Data;

import java.util.List;

@Data
public class Message4 {

  // 装userlist的列表
  private List<Wenzhen> userList;

  // 装有多少页数
  Integer pageLength;
}
