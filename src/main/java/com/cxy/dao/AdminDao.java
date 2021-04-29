package com.cxy.dao;

import com.cxy.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface AdminDao {

    // 注册功能
    Boolean insertAdminLoginInfo(Admin admin);

    // 更新管理员密码
    Boolean updateAdminPwdInfo(Admin admin);
}