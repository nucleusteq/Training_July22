package com.nt.training;

public class SignUp {
	private String userName;
	private String UserPassword;

	public SignUp(String userName, String userPassword) {
		super();
		this.userName = userName;
		UserPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SignUp [userName=" + userName + ", UserPassword=" + UserPassword + "]";
	}

}