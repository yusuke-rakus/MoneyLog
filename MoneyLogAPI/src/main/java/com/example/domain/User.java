package com.example.domain;

public class User {

	private Long userNo;
	private String userId;
	private String email;
	private String password;
	private Integer themeColorId;
	private String themeColorCode;
	private String themeColorGradientCode;

	public Long getUserNo() {
		return userNo;
	}

	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getThemeColorId() {
		return themeColorId;
	}

	public void setThemeColorId(Integer themeColorId) {
		this.themeColorId = themeColorId;
	}

	public String getThemeColorCode() {
		return themeColorCode;
	}

	public void setThemeColorCode(String themeColorCode) {
		this.themeColorCode = themeColorCode;
	}

	public String getThemeColorGradientCode() {
		return themeColorGradientCode;
	}

	public void setThemeColorGradientCode(String themeColorGradientCode) {
		this.themeColorGradientCode = themeColorGradientCode;
	}

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", userId=" + userId + ", email=" + email + ", password=" + password
				+ ", themeColorId=" + themeColorId + "]";
	}

}
