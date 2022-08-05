package com.nt.training.formbinding.model;

public class LoginModel {

	private String username;
	private String password;

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

	public LoginModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public LoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginModel [username=" + username + ", password=" + password + "]";
	}

}
