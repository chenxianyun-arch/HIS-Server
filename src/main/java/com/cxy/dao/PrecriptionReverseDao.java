package com.cxy.dao;



import com.cxy.pojo.PrecriptionReverse;
import com.cxy.pojo.Questionnaire;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PrecriptionReverse)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-28 22:55:43
 */
@Mapper
public interface PrecriptionReverseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param reverseId 主键
     * @return 实例对象
     */
    PrecriptionReverse queryById(Integer reverseId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PrecriptionReverse> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param precriptionReverse 实例对象
     * @return 对象列表
     */
    List<PrecriptionReverse> queryAll(PrecriptionReverse precriptionReverse);

    /**
     * 新增数据
     *
     * @param precriptionReverse 实例对象
     * @return 影响行数
     */
    int insert(PrecriptionReverse precriptionReverse);

    /**
     * 修改数据
     *
     * @param precriptionReverse 实例对象
     * @return 影响行数
     */
    int update(PrecriptionReverse precriptionReverse);

    /**
     * 通过主键删除数据
     *
     * @param reverseId 主键
     * @return 影响行数
     */
    int deleteById(Integer reverseId);


    // 查找所有患者
    List<PrecriptionReverse> selectAllUsers();
    // 精准查询一个患者

    /**
     * 根据时间段进行查询
     * @param patientName 姓名
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @return 多个医生列表数据
     */
    List<PrecriptionReverse> selectOneUser(@Param("patientName") String patientName ,@Param("startDate") String startDate ,@Param("endDate") String endDate);
    // 删除单个患者
    boolean deleteOneUsers(Integer id);
    // 删除多个医生
    boolean deleteMoreUsers(List list);

}