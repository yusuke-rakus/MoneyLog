package com.example.domain;

public class MonthlyTransaction {

	private Long monthlyTransactionId;
	private Long userNo;
	private String monthlyTransactionName;
	private Integer monthlyTransactionAmount;
	private Integer monthlyTransactionDate;
	private Long categoryId;
	private Long subCategoryId;
	private boolean includeFlg;

	private String categoryName;
	private String subCategoryName;

	public Long getMonthlyTransactionId() {
		return monthlyTransactionId;
	}

	public void setMonthlyTransactionId(Long monthlyTransactionId) {
		this.monthlyTransactionId = monthlyTransactionId;
	}

	public Long getUserNo() {
		return userNo;
	}

	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}

	public String getMonthlyTransactionName() {
		return monthlyTransactionName;
	}

	public void setMonthlyTransactionName(String monthlyTransactionName) {
		this.monthlyTransactionName = monthlyTransactionName;
	}

	public Integer getMonthlyTransactionAmount() {
		return monthlyTransactionAmount;
	}

	public void setMonthlyTransactionAmount(Integer monthlyTransactionAmount) {
		this.monthlyTransactionAmount = monthlyTransactionAmount;
	}

	public Integer getMonthlyTransactionDate() {
		return monthlyTransactionDate;
	}

	public void setMonthlyTransactionDate(Integer monthlyTransactionDate) {
		this.monthlyTransactionDate = monthlyTransactionDate;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public boolean isIncludeFlg() {
		return includeFlg;
	}

	public void setIncludeFlg(boolean includeFlg) {
		this.includeFlg = includeFlg;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

}
