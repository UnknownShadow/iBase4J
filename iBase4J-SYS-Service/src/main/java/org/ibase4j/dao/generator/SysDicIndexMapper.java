package org.ibase4j.dao.generator;

import java.util.List;
import org.ibase4j.core.base.BaseMapper;
import org.ibase4j.model.generator.SysDicIndex;

public interface SysDicIndexMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic_index
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic_index
     *
     * @mbggenerated
     */
    int insert(SysDicIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic_index
     *
     * @mbggenerated
     */
    SysDicIndex selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic_index
     *
     * @mbggenerated
     */
    List<SysDicIndex> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic_index
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysDicIndex record);
}