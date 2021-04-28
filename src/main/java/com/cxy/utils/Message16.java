package com.cxy.utils;

import com.cxy.pojo.Role;
import com.cxy.pojo.Suggestion;
import lombok.Data;

import java.util.List;

@Data
public class Message16 {

  // 装userlist的列表
  private List<Suggestion> userList;

  // 装有多少页数
  Integer pageLength;
}
