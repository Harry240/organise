package com.jemmmedia.organise.mybatis.db.mybatis.model;

import java.util.Date;

public class Orders extends BaseModel {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.transection_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String transectionId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.amount
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String amount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.item_name
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String itemName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.item_number
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String itemNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.first_name
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String firstName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.last_name
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String lastName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.payer_email
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String payerEmail;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.payer_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String payerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.payer_status
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String payerStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.period
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String period;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.subscr_date
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private Date subscrDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.subscr_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String subscrId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.txn_type
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String txnType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.auth
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private String auth;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column orders.group_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	private Long groupId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.transection_id
	 * @return  the value of orders.transection_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getTransectionId() {
		return transectionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.transection_id
	 * @param transectionId  the value for orders.transection_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setTransectionId(String transectionId) {
		this.transectionId = transectionId == null ? null : transectionId
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.amount
	 * @return  the value of orders.amount
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.amount
	 * @param amount  the value for orders.amount
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setAmount(String amount) {
		this.amount = amount == null ? null : amount.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.item_name
	 * @return  the value of orders.item_name
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.item_name
	 * @param itemName  the value for orders.item_name
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName == null ? null : itemName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.item_number
	 * @return  the value of orders.item_number
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getItemNumber() {
		return itemNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.item_number
	 * @param itemNumber  the value for orders.item_number
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber == null ? null : itemNumber.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.first_name
	 * @return  the value of orders.first_name
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.first_name
	 * @param firstName  the value for orders.first_name
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName == null ? null : firstName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.last_name
	 * @return  the value of orders.last_name
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.last_name
	 * @param lastName  the value for orders.last_name
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName == null ? null : lastName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.payer_email
	 * @return  the value of orders.payer_email
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getPayerEmail() {
		return payerEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.payer_email
	 * @param payerEmail  the value for orders.payer_email
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setPayerEmail(String payerEmail) {
		this.payerEmail = payerEmail == null ? null : payerEmail.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.payer_id
	 * @return  the value of orders.payer_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getPayerId() {
		return payerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.payer_id
	 * @param payerId  the value for orders.payer_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setPayerId(String payerId) {
		this.payerId = payerId == null ? null : payerId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.payer_status
	 * @return  the value of orders.payer_status
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getPayerStatus() {
		return payerStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.payer_status
	 * @param payerStatus  the value for orders.payer_status
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setPayerStatus(String payerStatus) {
		this.payerStatus = payerStatus == null ? null : payerStatus.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.period
	 * @return  the value of orders.period
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getPeriod() {
		return period;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.period
	 * @param period  the value for orders.period
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setPeriod(String period) {
		this.period = period == null ? null : period.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.subscr_date
	 * @return  the value of orders.subscr_date
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public Date getSubscrDate() {
		return subscrDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.subscr_date
	 * @param subscrDate  the value for orders.subscr_date
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setSubscrDate(Date subscrDate) {
		this.subscrDate = subscrDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.subscr_id
	 * @return  the value of orders.subscr_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getSubscrId() {
		return subscrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.subscr_id
	 * @param subscrId  the value for orders.subscr_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setSubscrId(String subscrId) {
		this.subscrId = subscrId == null ? null : subscrId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.txn_type
	 * @return  the value of orders.txn_type
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getTxnType() {
		return txnType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.txn_type
	 * @param txnType  the value for orders.txn_type
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setTxnType(String txnType) {
		this.txnType = txnType == null ? null : txnType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.auth
	 * @return  the value of orders.auth
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public String getAuth() {
		return auth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.auth
	 * @param auth  the value for orders.auth
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setAuth(String auth) {
		this.auth = auth == null ? null : auth.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column orders.group_id
	 * @return  the value of orders.group_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public Long getGroupId() {
		return groupId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column orders.group_id
	 * @param groupId  the value for orders.group_id
	 * @mbggenerated  Thu May 30 11:43:05 BST 2013
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
}