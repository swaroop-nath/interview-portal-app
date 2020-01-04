package com.cg.interview_portal.service;

import com.cg.interview_portal.entity.Login;
import com.cg.interview_portal.entity.User;
import com.cg.interview_portal.exception.InvalidCredentialsException;
import com.cg.interview_portal.exception.SessionTimedOutException;
import com.cg.interview_portal.exception.UserCollisionException;

public interface AuthService {

	String authenticateUser(Login credentials) throws InvalidCredentialsException;

	String createNewAccount(User newUser) throws UserCollisionException;

	User updateProfile(User modifiedUser);

	User loadUserFromToken(String authorizationToken) throws SessionTimedOutException;
	
	boolean isValidUser(String authenticationToken);

}
