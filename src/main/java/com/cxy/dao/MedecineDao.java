package com.cxy.dao;

import com.cxy.pojo.Medecine;
import com.cxy.pojo.Received;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Medecine)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-20 17:02:01
 */
@Mapper
public interface MedecineDao {

    /**
     * 通过ID查询单条数据
     *
     * @param medecineId 主键
     * @return 实例对象
     */
    Medecine queryById(Integer medecineId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Medecine> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param medecine 实例对象
     * @return 对象列表
     */
    List<Medecine> queryAll(Medecine medecine);

    /**
     * 新增数据
     *
     * @param medecine 实例对象
     * @return 影响行数
     */
    int insert(Medecine medecine);

    /**
     * 修改数据
     *
     * @param medecine 实例对象
     * @return 影响行数
     */
    int update(Medecine medecine);

    /**
     * 通过主键删除数据
     *
     * @param medecineId 主键
     * @return 影响行数
     */
    int deleteById(Integer medecineId);


    List<Medecine> selectAllUsers();

    /**
     * 根据时间段进行查询
     * @param patientName 姓名
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @return 多个医生列表数据
     */
    List<Medecine> selectOneUser(@Param("patientName") String patientName ,@Param("startDate") String startDate ,@Param("endDate") String endDate);

    /**
     *
     * @param id 删除id
     * @return 删除成功与否
     */
    boolean deleteOneUsers(Integer id);


    /**
     *
     * @param list 数据列表
     * @return  删除成功与否
     */
    boolean deleteMoreUsers(List list);
}