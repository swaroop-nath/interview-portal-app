package com.cg.interview_portal.security_config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.cg.interview_portal.exception.InvalidCredentialsException;
import com.cg.interview_portal.exception.SessionTimedOutException;

public class JWTokenFilter extends OncePerRequestFilter {
	
	private JWTokenProvider jwTokenProvider;

	public JWTokenFilter(JWTokenProvider jwTokenProvider) {
		this.jwTokenProvider = jwTokenProvider;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain)
			throws ServletException, IOException {
		String token = jwTokenProvider.resolveToken(httpServletRequest);
	    try {
	      if (token != null && jwTokenProvider.validateToken(token)) {
	        Authentication auth = jwTokenProvider.getAuthentication(token);
	        SecurityContextHolder.getContext().setAuthentication(auth);
	      }
	    } catch (InvalidCredentialsException ex) {
	      //this is very important, since it guarantees the user is not authenticated at all
	      SecurityContextHolder.clearContext();
	      throw new SessionTimedOutException(ex.getMessage(), ex.getStatus());
	    }

	    filterChain.doFilter(httpServletRequest, httpServletResponse);
	}

}
