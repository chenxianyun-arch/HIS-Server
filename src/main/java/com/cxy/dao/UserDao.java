package com.cxy.dao;

import com.cxy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

  // 查找所有用户
  List<User> selectAllUsers();
  // 精准查询一个用户
  List<User> selectOneUser(User user);
  // 删除多个用户
  boolean deleteMoreUsers();

}