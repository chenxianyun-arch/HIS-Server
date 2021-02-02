package com.cxy.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.cxy.pojo.user.User;
import com.cxy.utils.ConvertToArray;
import com.cxy.utils.ConvertToInt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {

  /**
   * 1 根据id删除所勾选的数据
   * @param userArray 每条数据id组成的Int数组
   */
  @PostMapping("/deleteAll")
  public void deletePage(@RequestBody JSONObject userArray) {
    System.out.println("获取到的数组的id"+userArray);
    ConvertToArray convertToArray = userArray.toJavaObject(ConvertToArray.class);
    Object[] ids = convertToArray.getConfig().toArray();
    // 2 循环将id打印出来
    for(Object id: ids){
      System.out.println(id);
    }
    // 2.调用service层将数据进行删除
    // 3.返回数据后进行查询数据进行重新赋值
  }
  /**
   * 2 删除单条数据
   * @param userId 单条数据的id
   */
  @PostMapping("/deleteSingalPage")
  public void deleteSingalUser(@RequestBody JSONObject userId) {
    // 转换成工具对象
    ConvertToInt convertToInt = userId.toJavaObject(ConvertToInt.class);
    System.out.println(convertToInt.getDeleteId());
    System.out.println(userId);
  }

  /**
   * 3 每次审核数据发生变化都会来到这个方法，
   *   将最新的审核状态赋值给前端
   * @param userJson 将前端传递过来的数据转化成字符串
   */
  @PostMapping("/openOrClose")
  public void openOrClose(@RequestBody JSONObject userJson) {
    System.out.println(userJson);
    User user = userJson.toJavaObject(User.class);
    System.out.println(user);
  }


  /**
   * 根据关键字查询数据
   * @param keywords
   * @return 返回到查询的对象，然后前端进行赋值
   */
  @PostMapping("/getOneUserInfo")
  public List<User> getOneUserInfo(@RequestBody Object keywords) {
    System.out.println(keywords.toString());
    List<User> list = new ArrayList<User>();
    User newUser = new User(1,"1122","hahah","sfsfsf",false,"123333");
    list.add(newUser);
    return list;
  }


}
