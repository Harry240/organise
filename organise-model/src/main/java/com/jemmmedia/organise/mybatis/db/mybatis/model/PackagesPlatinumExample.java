package com.jemmmedia.organise.mybatis.db.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PackagesPlatinumExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public PackagesPlatinumExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andGroupIdIsNull() {
			addCriterion("group_id is null");
			return (Criteria) this;
		}

		public Criteria andGroupIdIsNotNull() {
			addCriterion("group_id is not null");
			return (Criteria) this;
		}

		public Criteria andGroupIdEqualTo(Long value) {
			addCriterion("group_id =", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotEqualTo(Long value) {
			addCriterion("group_id <>", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdGreaterThan(Long value) {
			addCriterion("group_id >", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
			addCriterion("group_id >=", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdLessThan(Long value) {
			addCriterion("group_id <", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdLessThanOrEqualTo(Long value) {
			addCriterion("group_id <=", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdIn(List<Long> values) {
			addCriterion("group_id in", values, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotIn(List<Long> values) {
			addCriterion("group_id not in", values, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdBetween(Long value1, Long value2) {
			addCriterion("group_id between", value1, value2, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotBetween(Long value1, Long value2) {
			addCriterion("group_id not between", value1, value2, "groupId");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedIsNull() {
			addCriterion("users_allowed is null");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedIsNotNull() {
			addCriterion("users_allowed is not null");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedEqualTo(Integer value) {
			addCriterion("users_allowed =", value, "usersAllowed");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedNotEqualTo(Integer value) {
			addCriterion("users_allowed <>", value, "usersAllowed");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedGreaterThan(Integer value) {
			addCriterion("users_allowed >", value, "usersAllowed");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedGreaterThanOrEqualTo(Integer value) {
			addCriterion("users_allowed >=", value, "usersAllowed");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedLessThan(Integer value) {
			addCriterion("users_allowed <", value, "usersAllowed");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedLessThanOrEqualTo(Integer value) {
			addCriterion("users_allowed <=", value, "usersAllowed");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedIn(List<Integer> values) {
			addCriterion("users_allowed in", values, "usersAllowed");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedNotIn(List<Integer> values) {
			addCriterion("users_allowed not in", values, "usersAllowed");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedBetween(Integer value1, Integer value2) {
			addCriterion("users_allowed between", value1, value2,
					"usersAllowed");
			return (Criteria) this;
		}

		public Criteria andUsersAllowedNotBetween(Integer value1, Integer value2) {
			addCriterion("users_allowed not between", value1, value2,
					"usersAllowed");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedIsNull() {
			addCriterion("storage_allowed is null");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedIsNotNull() {
			addCriterion("storage_allowed is not null");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedEqualTo(Integer value) {
			addCriterion("storage_allowed =", value, "storageAllowed");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedNotEqualTo(Integer value) {
			addCriterion("storage_allowed <>", value, "storageAllowed");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedGreaterThan(Integer value) {
			addCriterion("storage_allowed >", value, "storageAllowed");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedGreaterThanOrEqualTo(Integer value) {
			addCriterion("storage_allowed >=", value, "storageAllowed");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedLessThan(Integer value) {
			addCriterion("storage_allowed <", value, "storageAllowed");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedLessThanOrEqualTo(Integer value) {
			addCriterion("storage_allowed <=", value, "storageAllowed");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedIn(List<Integer> values) {
			addCriterion("storage_allowed in", values, "storageAllowed");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedNotIn(List<Integer> values) {
			addCriterion("storage_allowed not in", values, "storageAllowed");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedBetween(Integer value1, Integer value2) {
			addCriterion("storage_allowed between", value1, value2,
					"storageAllowed");
			return (Criteria) this;
		}

		public Criteria andStorageAllowedNotBetween(Integer value1,
				Integer value2) {
			addCriterion("storage_allowed not between", value1, value2,
					"storageAllowed");
			return (Criteria) this;
		}

		public Criteria andSupportTypeIsNull() {
			addCriterion("support_type is null");
			return (Criteria) this;
		}

		public Criteria andSupportTypeIsNotNull() {
			addCriterion("support_type is not null");
			return (Criteria) this;
		}

		public Criteria andSupportTypeEqualTo(Integer value) {
			addCriterion("support_type =", value, "supportType");
			return (Criteria) this;
		}

		public Criteria andSupportTypeNotEqualTo(Integer value) {
			addCriterion("support_type <>", value, "supportType");
			return (Criteria) this;
		}

		public Criteria andSupportTypeGreaterThan(Integer value) {
			addCriterion("support_type >", value, "supportType");
			return (Criteria) this;
		}

		public Criteria andSupportTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("support_type >=", value, "supportType");
			return (Criteria) this;
		}

		public Criteria andSupportTypeLessThan(Integer value) {
			addCriterion("support_type <", value, "supportType");
			return (Criteria) this;
		}

		public Criteria andSupportTypeLessThanOrEqualTo(Integer value) {
			addCriterion("support_type <=", value, "supportType");
			return (Criteria) this;
		}

		public Criteria andSupportTypeIn(List<Integer> values) {
			addCriterion("support_type in", values, "supportType");
			return (Criteria) this;
		}

		public Criteria andSupportTypeNotIn(List<Integer> values) {
			addCriterion("support_type not in", values, "supportType");
			return (Criteria) this;
		}

		public Criteria andSupportTypeBetween(Integer value1, Integer value2) {
			addCriterion("support_type between", value1, value2, "supportType");
			return (Criteria) this;
		}

		public Criteria andSupportTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("support_type not between", value1, value2,
					"supportType");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNull() {
			addCriterion("created_at is null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNotNull() {
			addCriterion("created_at is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtEqualTo(Date value) {
			addCriterion("created_at =", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotEqualTo(Date value) {
			addCriterion("created_at <>", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThan(Date value) {
			addCriterion("created_at >", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("created_at >=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThan(Date value) {
			addCriterion("created_at <", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
			addCriterion("created_at <=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIn(List<Date> values) {
			addCriterion("created_at in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotIn(List<Date> values) {
			addCriterion("created_at not in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtBetween(Date value1, Date value2) {
			addCriterion("created_at between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
			addCriterion("created_at not between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNull() {
			addCriterion("updated_at is null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIsNotNull() {
			addCriterion("updated_at is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtEqualTo(Date value) {
			addCriterion("updated_at =", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotEqualTo(Date value) {
			addCriterion("updated_at <>", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThan(Date value) {
			addCriterion("updated_at >", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("updated_at >=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThan(Date value) {
			addCriterion("updated_at <", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
			addCriterion("updated_at <=", value, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtIn(List<Date> values) {
			addCriterion("updated_at in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotIn(List<Date> values) {
			addCriterion("updated_at not in", values, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtBetween(Date value1, Date value2) {
			addCriterion("updated_at between", value1, value2, "updatedAt");
			return (Criteria) this;
		}

		public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
			addCriterion("updated_at not between", value1, value2, "updatedAt");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table packages_platinum
	 * @mbggenerated  Tue Mar 12 14:20:31 GMT 2013
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table packages_platinum
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 12 12:59:39 GMT 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}