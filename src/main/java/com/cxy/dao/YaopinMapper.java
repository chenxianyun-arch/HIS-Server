package com.cxy.dao;

import com.cxy.pojo.Jiesuan;
import com.cxy.pojo.Yaopin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Yaopin)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-20 23:53:43
 */
@Mapper
public interface YaopinMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param yaopinId 主键
     * @return 实例对象
     */
    Yaopin queryById(Integer yaopinId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Yaopin> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param yaopin 实例对象
     * @return 对象列表
     */
    List<Yaopin> queryAll(Yaopin yaopin);

    /**
     * 新增数据
     *
     * @param yaopin 实例对象
     * @return 影响行数
     */
    int insert(Yaopin yaopin);

    /**
     * 修改数据
     *
     * @param yaopin 实例对象
     * @return 影响行数
     */
    int update(Yaopin yaopin);

    /**
     * 通过主键删除数据
     *
     * @param yaopinId 主键
     * @return 影响行数
     */
    int deleteById(Integer yaopinId);

    List<Yaopin> selectAllUsers();

    /**
     * 根据时间段进行查询
     * @param patientName 姓名
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @return 多个医生列表数据
     */
    List<Yaopin> selectOneUser(@Param("patientName") String patientName ,@Param("startDate") String startDate ,@Param("endDate") String endDate);

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