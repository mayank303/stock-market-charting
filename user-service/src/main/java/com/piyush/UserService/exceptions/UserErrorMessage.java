package com.piyush.UserService.exceptions;

public class UserErrorMessage {
	
	private String errorMessage;
	private int code;
	private long exceptionTime;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public long getExceptionTime() {
		return exceptionTime;
	}
	public void setExceptionTime(long exceptionTime) {
		this.exceptionTime = exceptionTime;
	}
	public UserErrorMessage(String errorMessage, int code, long exceptionTime) {
		super();
		this.errorMessage = errorMessage;
		this.code = code;
		this.exceptionTime = exceptionTime;
	}
	public UserErrorMessage() {
		super();
	}
	
	

}
