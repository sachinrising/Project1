package com.sachin.dao;


public class LoginCredentials {

	private String userName;
	private String password;

	public LoginCredentials() {
	}

	public LoginCredentials(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "LoginCredentials [userName=" + userName + ", password="
				+ password + "]";
	}
}
