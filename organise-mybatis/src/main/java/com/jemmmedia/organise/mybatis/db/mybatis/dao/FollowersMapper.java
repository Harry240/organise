package com.jemmmedia.organise.mybatis.db.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jemmmedia.organise.mybatis.db.mybatis.model.Followers;
import com.jemmmedia.organise.mybatis.db.mybatis.model.FollowersExample;
import com.jemmmedia.organise.mybatis.db.mybatis.model.FollowersKey;

public interface FollowersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	int countByExample(FollowersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	int deleteByExample(FollowersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	int deleteByPrimaryKey(FollowersKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	int insert(Followers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	int insertSelective(Followers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	List<Followers> selectByExample(FollowersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	Followers selectByPrimaryKey(FollowersKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	int updateByExampleSelective(@Param("record") Followers record,
			@Param("example") FollowersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	int updateByExample(@Param("record") Followers record,
			@Param("example") FollowersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	int updateByPrimaryKeySelective(Followers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table followers
	 * @mbggenerated  Mon Jul 29 13:57:53 BST 2013
	 */
	int updateByPrimaryKey(Followers record);
}