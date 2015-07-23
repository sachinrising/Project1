package com.sachin.dao;

import org.springframework.stereotype.Component;

@Component("loginCredentials")
public class LoginCredentials {

	private String userName;
	private String password;

	public LoginCredentials() {
		System.out.println("Login Credentials also loaded");
	}

	public LoginCredentials(String userName, String password) {
		super();
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
