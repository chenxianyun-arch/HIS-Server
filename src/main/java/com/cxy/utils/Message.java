package com.cxy.utils;

import com.cxy.pojo.User;
import lombok.*;

import java.util.List;

/**
 * 消息提示成功与否
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Message {

  // 装userlist的列表
  private List<User> userList;

  // 装有多少页数
  Integer pageLength;


}
