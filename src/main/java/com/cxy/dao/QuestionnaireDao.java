package com.cxy.dao;

import com.cxy.pojo.Patient;
import com.cxy.pojo.Questionnaire;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Questionnaire)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-24 21:45:05
 */
@Mapper
public interface QuestionnaireDao {

    /**
     * 通过ID查询单条数据
     *
     * @param questionnaireId 主键
     * @return 实例对象
     */
    Questionnaire queryById(Integer questionnaireId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Questionnaire> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param questionnaire 实例对象
     * @return 对象列表
     */
    List<Questionnaire> queryAll(Questionnaire questionnaire);

    /**
     * 新增数据
     *
     * @param questionnaire 实例对象
     * @return 影响行数
     */
    int insert(Questionnaire questionnaire);

    /**
     * 修改数据
     *
     * @param questionnaire 实例对象
     * @return 影响行数
     */
    int update(Questionnaire questionnaire);

    /**
     * 通过主键删除数据
     *
     * @param questionnaireId 主键
     * @return 影响行数
     */
    int deleteById(Integer questionnaireId);

    // 查找所有患者
    List<Questionnaire> selectAllUsers();
    // 精准查询一个患者

    /**
     * 根据时间段进行查询
     * @param patientName 姓名
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @return 多个医生列表数据
     */
    List<Questionnaire> selectOneUser(@Param("patientName") String patientName ,@Param("startDate") String startDate ,@Param("endDate") String endDate);
    // 删除单个患者
    boolean deleteOneUsers(Integer id);
    // 删除多个医生
    boolean deleteMoreUsers(List list);

}