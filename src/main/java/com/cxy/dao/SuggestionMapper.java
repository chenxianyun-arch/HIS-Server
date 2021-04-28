package com.cxy.dao;

import com.cxy.pojo.Member;
import com.cxy.pojo.Suggestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Suggestion)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-22 11:21:54
 */
@Mapper
public interface SuggestionMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param suggestionId 主键
     * @return 实例对象
     */
    Suggestion queryById(Integer suggestionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Suggestion> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param suggestion 实例对象
     * @return 对象列表
     */
    List<Suggestion> queryAll(Suggestion suggestion);

    /**
     * 新增数据
     *
     * @param suggestion 实例对象
     * @return 影响行数
     */
    int insert(Suggestion suggestion);

    /**
     * 修改数据
     *
     * @param suggestion 实例对象
     * @return 影响行数
     */
    int update(Suggestion suggestion);

    /**
     * 通过主键删除数据
     *
     * @param suggestionId 主键
     * @return 影响行数
     */
    int deleteById(Integer suggestionId);


    List<Suggestion> selectAllUsers();

    /**
     * 根据时间段进行查询
     * @param patientName 姓名
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @return 多个医生列表数据
     */
    List<Suggestion> selectOneUser(@Param("patientName") String patientName ,@Param("startDate") String startDate ,@Param("endDate") String endDate);

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