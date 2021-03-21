package com.cxy.utils;

import com.cxy.pojo.Member;
import com.cxy.pojo.Role;
import lombok.Data;

import java.util.List;

@Data
public class Message15 {

  // 装userlist的列表
  private List<Role> userList;

  // 装有多少页数
  Integer pageLength;
}
