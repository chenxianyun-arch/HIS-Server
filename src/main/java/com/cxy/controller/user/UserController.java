package com.cxy.controller.user;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController {

  /**
   * 1 根据id删除所勾选的数据
   * @param lists 每条数据id组成的Int数组
   */
  @PostMapping("/deleteAll")
  public void deletePage(@RequestBody String lists) {
//    System.out.println(JSON.);
    System.out.println(lists);
  }
  /**
   * 2 删除单条数据
   * @param id 单条数据的id
   */
  @PostMapping("/deleteSingalPage")
  public void deleteSingalUser(@RequestBody String id) {
    System.out.println(id);
  }




}
