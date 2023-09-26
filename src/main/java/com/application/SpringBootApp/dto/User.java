package com.application.SpringBootApp.dto;

import java.util.Date;

public class User {
	
	private Integer pkUserId;
    private String title;
    private String firstName;
    private String lastName;
    private String username;
    private String fullName;
    private String password;
    private String email;
    private String phonenumber;
    private String phonenumberExtension;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;
    
	public Integer getPkUserId() {
		return pkUserId;
	}
	public void setPkUserId(Integer pkUserId) {
		this.pkUserId = pkUserId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPhonenumberExtension() {
		return phonenumberExtension;
	}
	public void setPhonenumberExtension(String phonenumberExtension) {
		this.phonenumberExtension = phonenumberExtension;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
