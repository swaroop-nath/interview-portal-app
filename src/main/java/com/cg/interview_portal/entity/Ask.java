package com.cg.interview_portal.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@SequenceGenerator(name = "ask_seq", sequenceName = "ask_sequence", allocationSize = 1)
public class Ask {

	@Id
	@GeneratedValue(generator = "ask_seq")
	@Column(name = "ask_id")
	private int askId;
	
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private Skill skill;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Interview> interviewDetails;
	
	@Column(nullable = false)
	private LocalDate interviewDate;
	
	@OneToMany(mappedBy = "ask")
	private Set<AskPanelistMapper> mapper;

	public Ask() {
	}

	public Ask(int askId, Skill skill, Set<Interview> interviewDetails, LocalDate interviewDate,
			Set<AskPanelistMapper> mapper) {
		super();
		this.askId = askId;
		this.skill = skill;
		this.interviewDetails = interviewDetails;
		this.interviewDate = interviewDate;
		this.mapper = mapper;
	}

	public int getAskId() {
		return askId;
	}

	public void setAskId(int askId) {
		this.askId = askId;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public LocalDate getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(LocalDate interviewDate) {
		this.interviewDate = interviewDate;
	}
	
	public Set<Interview> getInterviewDetails() {
		return interviewDetails;
	}

	public void setInterviewDetails(Set<Interview> interviewDetails) {
		this.interviewDetails = interviewDetails;
	}

	public Set<AskPanelistMapper> getMapper() {
		return mapper;
	}

	public void setMapper(Set<AskPanelistMapper> mapper) {
		this.mapper = mapper;
	}
	
}
