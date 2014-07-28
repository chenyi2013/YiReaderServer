package com.yireader.bean;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -3938966104268692407L;

	private String username;
	private String password;
	private boolean sex;
	private int age;
	private String Email;
	private String QQ;
	private int userId;

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", sex=" + sex + ", age=" + age + ", Email=" + Email
				+ ", QQ=" + QQ + ", userId=" + userId + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getQQ() {
		return QQ;
	}

	public void setQQ(String qQ) {
		QQ = qQ;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
