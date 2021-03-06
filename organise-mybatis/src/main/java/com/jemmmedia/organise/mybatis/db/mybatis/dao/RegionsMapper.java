package com.jemmmedia.organise.mybatis.db.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jemmmedia.organise.mybatis.db.mybatis.model.Regions;
import com.jemmmedia.organise.mybatis.db.mybatis.model.RegionsExample;

public interface RegionsMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	int countByExample(RegionsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	int deleteByExample(RegionsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	int insert(Regions record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	int insertSelective(Regions record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	List<Regions> selectByExample(RegionsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	Regions selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	int updateByExampleSelective(@Param("record") Regions record,
			@Param("example") RegionsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	int updateByExample(@Param("record") Regions record,
			@Param("example") RegionsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	int updateByPrimaryKeySelective(Regions record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table regions
	 * @mbggenerated  Fri Jan 25 13:51:48 GMT 2013
	 */
	int updateByPrimaryKey(Regions record);

	/*@Select("SELECT * FROM regions")
    @MapKey("id")*/
    List<Regions> selectAllRegions(long groupId);
 }