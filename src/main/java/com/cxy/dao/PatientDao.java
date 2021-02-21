package com.cxy.dao;

import com.cxy.pojo.Doctor;
import com.cxy.pojo.Patient;
import com.cxy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 患者表(Patient)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-21 19:36:18
 */
@Mapper
public interface PatientDao {

    /**
     * 通过ID查询单条数据
     *
     * @param patientid 主键
     * @return 实例对象
     */
    Patient queryById(Integer patientid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Patient> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param patient 实例对象
     * @return 对象列表
     */
    List<Patient> queryAll(Patient patient);

    /**
     * 新增数据
     *
     * @param patient 实例对象
     * @return 影响行数
     */
    int insert(Patient patient);

    /**
     * 修改数据
     *
     * @param patient 实例对象
     * @return 影响行数
     */
    int update(Patient patient);

    /**
     * 通过主键删除数据
     *
     * @param patientid 主键
     * @return 影响行数
     */
    int deleteById(Integer patientid);

    // 查找所有患者
    List<Patient> selectAllUsers();
    // 精准查询一个患者

    /**
     * 根据时间段进行查询
     * @param patientName 姓名
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @return 多个医生列表数据
     */
    List<Patient> selectOneUser(@Param("patientName") String patientName ,@Param("startDate") String startDate ,@Param("endDate") String endDate);
    // 删除单个患者
    boolean deleteOneUsers(Integer id);
    // 删除多个医生
    boolean deleteMoreUsers(List list);

}