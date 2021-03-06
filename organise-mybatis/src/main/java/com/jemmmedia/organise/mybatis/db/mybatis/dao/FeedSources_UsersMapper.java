package com.jemmmedia.organise.mybatis.db.mybatis.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jemmmedia.organise.mybatis.db.mybatis.model.FeedSources_Users;
import com.jemmmedia.organise.mybatis.db.mybatis.model.FeedSources_UsersExample;
import com.jemmmedia.organise.mybatis.db.mybatis.model.FeedSources_UsersKey;

public interface FeedSources_UsersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	int countByExample(FeedSources_UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	int deleteByExample(FeedSources_UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	int deleteByPrimaryKey(FeedSources_UsersKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	int insert(FeedSources_Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	int insertSelective(FeedSources_Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	List<FeedSources_Users> selectByExample(FeedSources_UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	FeedSources_Users selectByPrimaryKey(FeedSources_UsersKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	int updateByExampleSelective(@Param("record") FeedSources_Users record,
			@Param("example") FeedSources_UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	int updateByExample(@Param("record") FeedSources_Users record,
			@Param("example") FeedSources_UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	int updateByPrimaryKeySelective(FeedSources_Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table feed_sources_users
	 * @mbggenerated  Wed Jul 03 14:38:35 BST 2013
	 */
	int updateByPrimaryKey(FeedSources_Users record);

	public void deleteSourceUserEntry(long feedSourceId);
}