package com.jemmmedia.organise.mybatis.db.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jemmmedia.organise.mybatis.db.mybatis.model.ViewType;
import com.jemmmedia.organise.mybatis.db.mybatis.model.ViewTypeExample;

public interface ViewTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    int countByExample(ViewTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    int deleteByExample(ViewTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    int insert(ViewType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    int insertSelective(ViewType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    List<ViewType> selectByExample(ViewTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    ViewType selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    int updateByExampleSelective(@Param("record") ViewType record, @Param("example") ViewTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    int updateByExample(@Param("record") ViewType record, @Param("example") ViewTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    int updateByPrimaryKeySelective(ViewType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_type
     *
     * @mbggenerated Mon Jul 29 15:10:25 BST 2013
     */
    int updateByPrimaryKey(ViewType record);
}