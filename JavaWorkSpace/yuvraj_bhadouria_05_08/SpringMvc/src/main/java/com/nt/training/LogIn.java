package com.nt.training;

public class LogIn {
	private String userName;
	private String userPassword;

	public LogIn() {

	}

	public LogIn(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "LoginModel [userName=" + userName + ", userPassword=" + userPassword + "]";
	}

}
