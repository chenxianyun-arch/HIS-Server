package com.cxy.utils;

import com.cxy.pojo.Doctor;
import com.cxy.pojo.Patient;
import lombok.Data;

import java.util.List;

@Data
public class Message2 {

  // 装userlist的列表
  private List<Patient> userList;

  // 装有多少页数
  Integer pageLength;
}
