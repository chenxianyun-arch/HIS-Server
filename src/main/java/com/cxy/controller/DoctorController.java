package com.cxy.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cxy.dao.DoctorDao;
import com.cxy.pojo.Doctor;
import com.cxy.pojo.User;
import com.cxy.utils.Message1;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 */
@Controller
@ResponseBody
public class DoctorController {

  @Autowired
  private DoctorDao userDao;

  /**
   * 1 根据id删除所勾选的数据
   *
   * @param userArray 每条数据id组成的Int数组
   */
  @PostMapping("/deleteAllDoctor")
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
  @PostMapping("/deletSingalDoctor")
  public void deleteSingalUser(@RequestBody JSONObject userId) {
    // 转换成工具对象
    Integer id = userId.getInteger("deleteId");
    System.out.println(id);
    boolean isDeleteSuccess = userDao.deleteOneUsers(id);
    System.out.println(isDeleteSuccess);
  }



  /**
   * 根据关键字查询数据
   *
   * @param keywords
   * @return 返回到查询的对象，然后前端进行赋值
   */
  @PostMapping("/getOneDoctorInfo")
  public List<User> getOneUserInfo(@RequestBody JSONObject keywords) {
    // 前端获取的关键字信息参数
    String keyName = keywords.getString("keyName");
    String keyKeshi = keywords.getString("keyKeshi");
    String keyZhiCeng = keywords.getString("keyZhiCeng");
    Doctor user1 = new Doctor();
    user1.setDoctorName(keyName);
    user1.setDoctorKeshi(keyKeshi);
    user1.setDoctorZhiceng(keyZhiCeng);
    List userList = userDao.selectOneUser(user1);
    System.out.println(user1);
    // 用数组来将对象转起来
    return userList;
  }

  /**
   * 根据分页条数和第第几页返回数据进行显示
   * @param requestParm 请求的页数，一页展示的数据量
   * @return 返回需要的数据信息，然后展示在前端
   */
  @PostMapping("/getAllDoctorInfo")
  public Message1 getAllUserInfo(@RequestBody JSONObject requestParm) {
    // 装信息的工具类
    Message1 message = new Message1();
    // 当前页码 每页显示页数
    Integer currentPage = requestParm.getInteger("currentPage");
    Integer pageSize = requestParm.getInteger("pageSize");
    // 利用插件进行分页
    PageHelper.startPage(currentPage,pageSize);
    List<Doctor> userList = userDao.selectAllUsers();
    for(Doctor doctor: userList){
      System.out.println(doctor);
    }
    PageInfo<Doctor> pageInfo = new PageInfo<>(userList);
    System.out.println(pageInfo);
    int pages = pageInfo.getPages();
    int total = (int) pageInfo.getTotal();
    message.setPageLength(total);
    message.setUserList(userList);
    return message;
  }

}
