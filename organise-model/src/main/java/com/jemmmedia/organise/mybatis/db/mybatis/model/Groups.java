package com.jemmmedia.organise.mybatis.db.mybatis.model;

import java.util.Date;

public class Groups extends BaseModel {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column groups.name
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column groups.created_by
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	private String createdBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column groups.updated_by
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	private String updatedBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column groups.package_id
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	private Long packageId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column groups.subscr_date
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	private Date subscrDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column groups.name
	 * @return  the value of groups.name
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column groups.name
	 * @param name  the value for groups.name
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column groups.created_by
	 * @return  the value of groups.created_by
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column groups.created_by
	 * @param createdBy  the value for groups.created_by
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy == null ? null : createdBy.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column groups.updated_by
	 * @return  the value of groups.updated_by
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column groups.updated_by
	 * @param updatedBy  the value for groups.updated_by
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy == null ? null : updatedBy.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column groups.package_id
	 * @return  the value of groups.package_id
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public Long getPackageId() {
		return packageId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column groups.package_id
	 * @param packageId  the value for groups.package_id
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public void setPackageId(Long packageId) {
		this.packageId = packageId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column groups.subscr_date
	 * @return  the value of groups.subscr_date
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public Date getSubscrDate() {
		return subscrDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column groups.subscr_date
	 * @param subscrDate  the value for groups.subscr_date
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public void setSubscrDate(Date subscrDate) {
		this.subscrDate = subscrDate;
	}
}