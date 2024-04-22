package com.springmvc.model;

public class Login {

	private String loginId;
	private String password;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}

	public Login() {
		super();
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", password=" + password + "]";
	}

}
