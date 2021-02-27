package com.cxy.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cxy.dao.PatientDao;
import com.cxy.dao.QuestionnaireDao;
import com.cxy.pojo.Patient;
import com.cxy.pojo.Questionnaire;
import com.cxy.utils.Message2;
import com.cxy.utils.Message3;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 问诊单管理controller
 */
@RestController
public class QuestionnaireController {

  @Autowired
  private QuestionnaireDao questionnaireDao;

  /**
   * 1 根据id删除所勾选的数据
   *
   * @param userArray 每条数据id组成的Int数组
   */
  @PostMapping("/deleteAllQuestion")
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
    boolean isDeletes = questionnaireDao.deleteMoreUsers(idLists);
    System.out.println(isDeletes);
    return isDeletes;
  }

  /**
   * 2 删除单条数据
   *
   * @param userId 单条数据的id
   */
  @PostMapping("/deletSingalQuestion")
  public void deleteSingalUser(@RequestBody JSONObject userId) {
    // 转换成工具对象
    Integer id = userId.getInteger("deleteId");
    System.out.println(id);
    boolean isDeleteSuccess = questionnaireDao.deleteOneUsers(id);
    System.out.println(isDeleteSuccess);
  }



  /**
   * 根据关键字查询数据
   *
   * @param keywords
   * @return 返回到查询的对象，然后前端进行赋值
   */
  @PostMapping("/getOneQuestionInfo")
  public List<Questionnaire> getOneUserInfo(@RequestBody JSONObject keywords) {
    // 前端获取的关键字信息参数
    String keyName = keywords.getString("keyName");
    Date startDate = keywords.getDate("startDate");
    Date endDate = keywords.getDate("endDate");
    // 设置日期格式化对象
    SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
    // 将两个参数进行格式化
    String formatStartTime = dateFormat.format(startDate);
    String formatEndTime = dateFormat.format(endDate);
    System.out.println(formatStartTime +"====" +formatEndTime);
    System.out.println(keyName);
    List<Questionnaire> userList = questionnaireDao.selectOneUser(keyName,formatStartTime,formatEndTime);
    // 用数组来将对象转起来
    return userList;
  }

  /**
   * 根据分页条数和第第几页返回数据进行显示
   * @param requestParm 请求的页数，一页展示的数据量
   * @return 返回需要的数据信息，然后展示在前端
   */
  @PostMapping("/getAllQuestionInfo")
  public Message3 getAllUserInfo(@RequestBody JSONObject requestParm) {
    // 装信息的工具类
    Message3 message = new Message3();
    // 当前页码 每页显示页数
    Integer currentPage = requestParm.getInteger("currentPage");
    Integer pageSize = requestParm.getInteger("pageSize");
    // 利用插件进行分页
    PageHelper.startPage(currentPage,pageSize);
    List<Questionnaire> userList = questionnaireDao.selectAllUsers();
    for(Questionnaire questionnaire: userList){
      System.out.println(questionnaire);
    }
    PageInfo<Questionnaire> pageInfo = new PageInfo<>(userList);
    System.out.println(pageInfo);
    int pages = pageInfo.getPages();
    int total = (int) pageInfo.getTotal();
    message.setPageLength(total);
    message.setUserList(userList);
    return message;
  }

}

