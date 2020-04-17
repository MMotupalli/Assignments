package com.cg.web;

public class ErrorInfo {
private String message;
private String error="Bad request";
private int status=400;
public ErrorInfo(String message) {
	super();
	this.message = message;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getError() {
	return error;
}
public void setError(String error) {
	this.error = error;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}


}
