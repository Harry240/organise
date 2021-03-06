package com.jemmmedia.organise.mybatis.db.mybatis.model;

import java.util.Date;

public class FileAttachment extends BaseModel {
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_attachments.name
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_attachments.file_extension
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	private String fileExtension;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_attachments.attachable_id
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	private Long attachableId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_attachments.attachable_type
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	private String attachableType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_attachments.attachment_file_name
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	private String attachmentFileName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_attachments.attachment_content_type
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	private String attachmentContentType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_attachments.attachment_file_size
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	private Integer attachmentFileSize;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_attachments.attachment_updated_at
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	private Date attachmentUpdatedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_attachments.creator_id
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	private Long creatorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_attachments.updater_id
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	private Long updaterId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_attachments.name
	 * @return  the value of file_attachments.name
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_attachments.name
	 * @param name  the value for file_attachments.name
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_attachments.file_extension
	 * @return  the value of file_attachments.file_extension
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public String getFileExtension() {
		return fileExtension;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_attachments.file_extension
	 * @param fileExtension  the value for file_attachments.file_extension
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension == null ? null : fileExtension
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_attachments.attachable_id
	 * @return  the value of file_attachments.attachable_id
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public Long getAttachableId() {
		return attachableId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_attachments.attachable_id
	 * @param attachableId  the value for file_attachments.attachable_id
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public void setAttachableId(Long attachableId) {
		this.attachableId = attachableId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_attachments.attachable_type
	 * @return  the value of file_attachments.attachable_type
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public String getAttachableType() {
		return attachableType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_attachments.attachable_type
	 * @param attachableType  the value for file_attachments.attachable_type
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public void setAttachableType(String attachableType) {
		this.attachableType = attachableType == null ? null : attachableType
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_attachments.attachment_file_name
	 * @return  the value of file_attachments.attachment_file_name
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public String getAttachmentFileName() {
		return attachmentFileName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_attachments.attachment_file_name
	 * @param attachmentFileName  the value for file_attachments.attachment_file_name
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public void setAttachmentFileName(String attachmentFileName) {
		this.attachmentFileName = attachmentFileName == null ? null
				: attachmentFileName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_attachments.attachment_content_type
	 * @return  the value of file_attachments.attachment_content_type
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public String getAttachmentContentType() {
		return attachmentContentType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_attachments.attachment_content_type
	 * @param attachmentContentType  the value for file_attachments.attachment_content_type
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public void setAttachmentContentType(String attachmentContentType) {
		this.attachmentContentType = attachmentContentType == null ? null
				: attachmentContentType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_attachments.attachment_file_size
	 * @return  the value of file_attachments.attachment_file_size
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public Integer getAttachmentFileSize() {
		return attachmentFileSize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_attachments.attachment_file_size
	 * @param attachmentFileSize  the value for file_attachments.attachment_file_size
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public void setAttachmentFileSize(Integer attachmentFileSize) {
		this.attachmentFileSize = attachmentFileSize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_attachments.attachment_updated_at
	 * @return  the value of file_attachments.attachment_updated_at
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public Date getAttachmentUpdatedAt() {
		return attachmentUpdatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_attachments.attachment_updated_at
	 * @param attachmentUpdatedAt  the value for file_attachments.attachment_updated_at
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public void setAttachmentUpdatedAt(Date attachmentUpdatedAt) {
		this.attachmentUpdatedAt = attachmentUpdatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_attachments.creator_id
	 * @return  the value of file_attachments.creator_id
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public Long getCreatorId() {
		return creatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_attachments.creator_id
	 * @param creatorId  the value for file_attachments.creator_id
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_attachments.updater_id
	 * @return  the value of file_attachments.updater_id
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public Long getUpdaterId() {
		return updaterId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_attachments.updater_id
	 * @param updaterId  the value for file_attachments.updater_id
	 * @mbggenerated  Fri Sep 14 06:32:16 BST 2012
	 */
	public void setUpdaterId(Long updaterId) {
		this.updaterId = updaterId;
	}

	public FileAttachment(){
		
	}
	
    public FileAttachment(String name,Integer attachmentFileSize,  String attachmentFileName, String attachmentContentType) {
		super();
		this.name = name;
		this.attachmentFileName = attachmentFileName;
		this.attachmentContentType = attachmentContentType;
		this.attachmentFileSize = attachmentFileSize;		
	}

	
}