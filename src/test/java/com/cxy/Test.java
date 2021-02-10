package com.cxy;

import com.alibaba.fastjson.JSON;
import com.cxy.dao.UserDao;
import com.cxy.pojo.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

public class Test {
  public static void main(String[] args) {

    UserDao userDao = new UserDao() {
      @Override
      public List<User> selectAllUsers() {
        return null;
      }

      @Override
      public List<User> selectOneUser(User user) {
        return null;
      }

      @Override
      public boolean deleteMoreUsers() {
        return false;
      }
    };


    PageHelper.startPage(1,5);
    List<User> list = userDao.selectAllUsers();
    PageInfo<User> pageInfo = new PageInfo<>();
    List<User> users = pageInfo.getList();
//    System.out.println(users);
    for(User user: users) {
      System.out.println(user);
    }
  }
}
