package com.jemmmedia.organise.mybatis.db.mybatis.model;

public class Status {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column status.id
	 * @mbggenerated  Tue Nov 27 09:25:37 GMT 2012
	 */
	private Byte id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column status.name
	 * @mbggenerated  Tue Nov 27 09:25:37 GMT 2012
	 */
	private String name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column status.id
	 * @return  the value of status.id
	 * @mbggenerated  Tue Nov 27 09:25:37 GMT 2012
	 */
	public Byte getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column status.id
	 * @param id  the value for status.id
	 * @mbggenerated  Tue Nov 27 09:25:37 GMT 2012
	 */
	public void setId(Byte id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column status.name
	 * @return  the value of status.name
	 * @mbggenerated  Tue Nov 27 09:25:37 GMT 2012
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column status.name
	 * @param name  the value for status.name
	 * @mbggenerated  Tue Nov 27 09:25:37 GMT 2012
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
}