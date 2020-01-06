package com.cg.interview_portal.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence")
public class User {

	@Id
	@GeneratedValue(generator = "user_seq")
	@Column(name = "user_id")
	private int userId;
	
	@Column(length = 50, unique = true)
	private String emailId;
	
	@Column(length = 256, nullable = false)
	private String password;
	
	@Column(nullable = false)
	private LocalDate dateOfBirth;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Role> roles;

	public User() {
	}
	
	public User(int userId, String emailId, String password, LocalDate dateOfBirth, List<Role> roles) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.roles = roles;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
