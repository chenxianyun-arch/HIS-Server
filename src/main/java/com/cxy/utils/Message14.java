package com.cxy.utils;

import com.cxy.pojo.Member;
import lombok.Data;

import java.util.List;

@Data
public class Message14 {

  // 装userlist的列表
  private List<Member> userList;

  // 装有多少页数
  Integer pageLength;
}
