package com.cxy.dao;

import com.cxy.pojo.Doctor;
import com.cxy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface UserDao {

  // 查找所有用户
  List<User> selectAllUsers();
  // 精准查询一个用户
  List<User> selectOneUser(User user);
  // 删除单个用户
  boolean deleteOneUsers(Integer id);

  // 删除多个用户
  boolean deleteMoreUsers(List list);
  // 更改用户数据
  Boolean updateUserInfo(User user);

  // 注册用户
  Boolean insertUserLoginInfo(User user);

  // 更改用户名密码
  Boolean updateUserPwdInfo(User user);

}
