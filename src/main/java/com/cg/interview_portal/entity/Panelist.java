package com.cg.interview_portal.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "panel_seq", sequenceName = "panelist_sequence")
public class Panelist {

	@Id
	@GeneratedValue(generator = "panel_seq")
	@Column(name = "panelist_id")
	private int panelistId;
	
	@Column(length = 100, nullable = false)
	private String panelistName;
	
	@Column(length = 50, nullable = false)
	private String email;
	
	@Column(length = 2, nullable = false)
	private String grade;
	
	@Column(length = 15, nullable = false)
	private String contactDetail;
	
	@Column(length = 30, nullable = false)
	private String account;
	
	@Column(length = 30, nullable = false)
	private String baseLocation;

	@OneToMany(mappedBy = "panelist")
	private Set<AskPanelistMapper> mapper;

	public Panelist() {
	}
	
	public Panelist(int panelistId, String panelistName, String email, String grade, String contactDetail,
			String account, String baseLocation, Set<AskPanelistMapper> mapper) {
		super();
		this.panelistId = panelistId;
		this.panelistName = panelistName;
		this.email = email;
		this.grade = grade;
		this.contactDetail = contactDetail;
		this.account = account;
		this.baseLocation = baseLocation;
		this.mapper = mapper;
	}

	public int getPanelistId() {
		return panelistId;
	}

	public void setPanelistId(int panelistId) {
		this.panelistId = panelistId;
	}

	public String getPanelistName() {
		return panelistName;
	}

	public void setPanelistName(String panelistName) {
		this.panelistName = panelistName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(String contactDetail) {
		this.contactDetail = contactDetail;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public Set<AskPanelistMapper> getMapper() {
		return mapper;
	}

	public void setMapper(Set<AskPanelistMapper> mapper) {
		this.mapper = mapper;
	}
	
}
