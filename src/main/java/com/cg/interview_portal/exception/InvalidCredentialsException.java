package com.cg.interview_portal.exception;

import org.springframework.http.HttpStatus;

public class InvalidCredentialsException extends Exception {
	
	private HttpStatus status;

	public InvalidCredentialsException() {
		super();
	}
	
	public InvalidCredentialsException(String message, HttpStatus status) {
		super(message);
		this.status = status;
	}
	
	public HttpStatus getStatus() {
		return this.status;
	}
}
