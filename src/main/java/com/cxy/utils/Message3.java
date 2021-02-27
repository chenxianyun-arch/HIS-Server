package com.cxy.utils;

import com.cxy.pojo.Patient;
import com.cxy.pojo.Questionnaire;
import lombok.Data;

import java.util.List;

@Data
public class Message3 {

  // 装userlist的列表
  private List<Questionnaire> userList;

  // 装有多少页数
  Integer pageLength;
}
