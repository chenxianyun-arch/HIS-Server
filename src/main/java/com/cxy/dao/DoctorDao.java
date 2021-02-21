package com.cxy.dao;

import com.cxy.pojo.Doctor;
import com.cxy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import javax.print.Doc;
import java.util.List;

@Mapper
public interface DoctorDao {
    int deleteByPrimaryKey(Integer doctorId);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Integer doctorId);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    // 查找所有医生
    List<Doctor> selectAllUsers();
    // 精准查询一个医生
    List<Doctor> selectOneUser(Doctor user);
    // 删除单个医生
    boolean deleteOneUsers(Integer id);
    // 删除多个医生
    boolean deleteMoreUsers(List list);
    // 更改用户数据
    Boolean updateUserInfo(User user);
}