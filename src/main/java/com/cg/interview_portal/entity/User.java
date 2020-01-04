package com.cg.interview_portal.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd/MM/YYYY", timezone = "IST")
	@Column(nullable = false)
	private Date dateOfBirth;
	
	@ElementCollection
	private List<Role> roles;

	public User(int userId, String emailId, String password, Date dateOfBirth, List<Role> roles) {
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
