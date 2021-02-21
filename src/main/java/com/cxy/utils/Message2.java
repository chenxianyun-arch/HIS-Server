package com.cxy.utils;

import com.cxy.pojo.Doctor;
import lombok.Data;

import java.util.List;
@Data
public class Message1 {

  // 装userlist的列表
  private List<Doctor> userList;

  // 装有多少页数
  Integer pageLength;
}
