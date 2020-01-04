package com.cg.interview_portal.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
	
	ROLE_RECRUITER, ROLE_EMPANELLER;

	@Override
	public String getAuthority() {
		return name();
	}

}
