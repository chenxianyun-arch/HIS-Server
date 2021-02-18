package com.cxy.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cxy.dao.UserDao;
import com.cxy.pojo.User;
import com.cxy.utils.ConvertToArray;
import com.cxy.utils.ConvertToInt;
import com.cxy.utils.Message;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@RestController
public class UserController {

  @Autowired
  private UserDao userDao;

  /**
   * 1 根据id删除所勾选的数据
   *
   * @param userArray 每条数据id组成的Int数组
   */
  @PostMapping("/deleteAll")
  public boolean deletePage(@RequestBody JSONObject userArray) {
    System.out.println("获取到的数组的id" + userArray);
    // 转化成JSON数组
    JSONArray array = userArray.getJSONArray("config");
    // 赋值成List集合
    List idLists =  array;
    // 循环将id打印出来
    for (Object id : idLists) {
      System.out.println(id);
    }
    boolean isDeletes = userDao.deleteMoreUsers(idLists);
    System.out.println(isDeletes);
    return isDeletes;
  }

  /**
   * 2 删除单条数据
   *
   * @param userId 单条数据的id
   */
  @PostMapping("/deleteSingalPage")
  public void deleteSingalUser(@RequestBody JSONObject userId) {
    // 转换成工具对象
    Integer id = userId.getInteger("deleteId");
    boolean isDeleteSuccess = userDao.deleteOneUsers(id);
    System.out.println(isDeleteSuccess);

  }

  /**
   * 3 每次审核数据发生变化都会来到这个方法，
   * 将最新的审核状态赋值给前端
   *
   * @param userJson 将前端传递过来的数据转化成字符串
   */
  @PostMapping("/openOrClose")
  public Boolean openOrClose(@RequestBody JSONObject userJson) {
    System.out.println(userJson);
    User user = userJson.toJavaObject(User.class);
    Boolean isUpdate = userDao.updateUserInfo(user);
    System.out.println(isUpdate);
    return isUpdate;
  }


  /**
   * 根据关键字查询数据
   *
   * @param keywords
   * @return 返回到查询的对象，然后前端进行赋值
   */
  @PostMapping("/getOneUserInfo")
  public List<User> getOneUserInfo(@RequestBody JSONObject keywords) {
    Date keyDate = keywords.getDate("keyDate");
    // 前端获取的关键字信息参数
    String keyName = keywords.getString("keyName");
    // 将时间参数进行格式化转换
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
    String format = simpleDateFormat.format(keyDate);
    User user1 = new User();
    user1.setName(keyName);
    user1.setDate(format);
    List userList = userDao.selectOneUser(user1);
    // 用数组来将对象转起来
    return userList;
  }

  /**
   * 根据分页条数和第第几页返回数据进行显示
   * @param requestParm 请求的页数，一页展示的数据量
   * @return 返回需要的数据信息，然后展示在前端
   */
  @PostMapping("/getAllUserInfo")
  public Message getAllUserInfo(@RequestBody JSONObject requestParm) {
    // 装信息的工具类
    Message message = new Message();
    // 当前页码 每页显示页数
    Integer currentPage = requestParm.getInteger("currentPage");
    Integer pageSize = requestParm.getInteger("pageSize");
    // 利用插件进行分页
    PageHelper.startPage(currentPage,pageSize);
    List<User> userList = userDao.selectAllUsers();
    PageInfo<User> pageInfo = new PageInfo<>(userList);
    System.out.println(pageInfo);
    int pages = pageInfo.getPages();
    int total = (int) pageInfo.getTotal();
    message.setPageLength(total);
    message.setUserList(userList);

    return message;
  }


}
