package com.cxy.dao;

import com.cxy.pojo.Shenhe;
import com.cxy.pojo.Yaopin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Shenhe)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-21 22:35:50
 */
@Mapper
public interface ShenheMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param shenheId 主键
     * @return 实例对象
     */
    Shenhe queryById(Integer shenheId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Shenhe> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param shenhe 实例对象
     * @return 对象列表
     */
    List<Shenhe> queryAll(Shenhe shenhe);

    /**
     * 新增数据
     *
     * @param shenhe 实例对象
     * @return 影响行数
     */
    int insert(Shenhe shenhe);

    /**
     * 修改数据
     *
     * @param shenhe 实例对象
     * @return 影响行数
     */
    int update(Shenhe shenhe);

    /**
     * 通过主键删除数据
     *
     * @param shenheId 主键
     * @return 影响行数
     */
    int deleteById(Integer shenheId);


    List<Shenhe> selectAllUsers();

    /**
     * 根据时间段进行查询
     * @param patientName 姓名
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @return 多个医生列表数据
     */
    List<Shenhe> selectOneUser(@Param("patientName") String patientName ,@Param("startDate") String startDate ,@Param("endDate") String endDate);

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