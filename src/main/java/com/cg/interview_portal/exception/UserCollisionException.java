package com.cg.interview_portal.exception;

import org.springframework.http.HttpStatus;

public class UserCollisionException extends Exception {

	private HttpStatus status;

	public UserCollisionException() {
		super();
	}

	public UserCollisionException(String message, HttpStatus status) {
		super(message);
		this.status = status;
	}
	
	public HttpStatus getStatus() {
		return this.status;
	}
	
}
