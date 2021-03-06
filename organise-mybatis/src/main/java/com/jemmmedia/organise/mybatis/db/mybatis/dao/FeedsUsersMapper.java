package com.jemmmedia.organise.mybatis.db.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jemmmedia.organise.mybatis.db.mybatis.model.FeedEntryBean;
import com.jemmmedia.organise.mybatis.db.mybatis.model.FeedsUsersExample;
import com.jemmmedia.organise.mybatis.db.mybatis.model.FeedsUsersKey;

public interface FeedsUsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_users
     *
     * @mbggenerated Fri Nov 16 12:27:20 GMT 2012
     */
    int countByExample(FeedsUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_users
     *
     * @mbggenerated Fri Nov 16 12:27:20 GMT 2012
     */
    int deleteByExample(FeedsUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_users
     *
     * @mbggenerated Fri Nov 16 12:27:20 GMT 2012
     */
    int deleteByPrimaryKey(FeedsUsersKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_users
     *
     * @mbggenerated Fri Nov 16 12:27:20 GMT 2012
     */
    int insert(FeedsUsersKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_users
     *
     * @mbggenerated Fri Nov 16 12:27:20 GMT 2012
     */
    int insertSelective(FeedsUsersKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_users
     *
     * @mbggenerated Fri Nov 16 12:27:20 GMT 2012
     */
    List<FeedsUsersKey> selectByExample(FeedsUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_users
     *
     * @mbggenerated Fri Nov 16 12:27:20 GMT 2012
     */
    int updateByExampleSelective(@Param("record") FeedsUsersKey record, @Param("example") FeedsUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feeds_users
     *
     * @mbggenerated Fri Nov 16 12:27:20 GMT 2012
     */
    int updateByExample(@Param("record") FeedsUsersKey record, @Param("example") FeedsUsersExample example);
    
    List<Long> selectFeedSourceIds(int userId);
    
    void deleteSourcesUsers(Long id);
    
    
    List<FeedEntryBean>multiSourceFilterFeeds(@Param("userId") int userId, @Param("pageStart") int pageStart);
}