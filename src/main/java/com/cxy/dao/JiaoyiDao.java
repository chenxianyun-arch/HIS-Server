package com.cxy.dao;

import com.cxy.pojo.Jiaoyi;
import com.cxy.pojo.Refund;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Jiaoyi)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-01 23:48:42
 */
@Mapper
public interface JiaoyiDao {

    /**
     * 通过ID查询单条数据
     *
     * @param jiaoyiId 主键
     * @return 实例对象
     */
    Jiaoyi queryById(Integer jiaoyiId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Jiaoyi> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param jiaoyi 实例对象
     * @return 对象列表
     */
    List<Jiaoyi> queryAll(Jiaoyi jiaoyi);

    /**
     * 新增数据
     *
     * @param jiaoyi 实例对象
     * @return 影响行数
     */
    int insert(Jiaoyi jiaoyi);

    /**
     * 修改数据
     *
     * @param jiaoyi 实例对象
     * @return 影响行数
     */
    int update(Jiaoyi jiaoyi);

    /**
     * 通过主键删除数据
     *
     * @param jiaoyiId 主键
     * @return 影响行数
     */
    int deleteById(Integer jiaoyiId);

    /**
     *
     * @return 查询所有问诊单信息
     */
    List<Jiaoyi> selectAllUsers();

    /**
     * 根据时间段进行查询
     * @param patientName 姓名
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @return 多个医生列表数据
     */
    List<Jiaoyi> selectOneUser(@Param("patientName") String patientName ,@Param("startDate") String startDate ,@Param("endDate") String endDate);

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