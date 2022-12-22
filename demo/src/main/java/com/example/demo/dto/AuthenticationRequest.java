package com.example.demo.dto;

public class AuthenticationRequest {

	private String userName;
	private String password;

	public AuthenticationRequest() {

	}

	public AuthenticationRequest(String username, String password) {
		super();
		this.userName = username;
		this.password = password;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
