package com.naver.jihyunboard.user.dto;

import lombok.Data;


public class UserDTO {
	
	private int userId;
	private String userPw;
	private String userName;
	private String userMajor;
	private String userPhoneNum;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMajor() {
		return userMajor;
	}
	public void setUserMajor(String userMajor) {
		this.userMajor = userMajor;
	}
	public String getUserPhoneNum() {
		return userPhoneNum;
	}
	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}
	
	
	
}
