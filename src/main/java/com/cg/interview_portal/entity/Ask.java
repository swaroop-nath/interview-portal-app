package com.cg.interview_portal.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@SequenceGenerator(name = "ask_seq", sequenceName = "ask_sequence", allocationSize = 1)
public class Ask {

	@Id
	@GeneratedValue(generator = "ask_seq")
	@Column(name = "ask_id")
	private int askId;
	
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private Skill skill;
	
	@Column(length = 2, nullable = false)
	private int slotsL1;
	
	@Column(length = 2, nullable = false)
	private int slotsL2;
	
	@Column(nullable = false)
	private LocalDate interviewDate;
	
	@Column(length = 50, nullable = false)
	private String numGradePersonnel;
	
	@OneToMany(mappedBy = "ask")
	private Set<AskPanelistMapper> mapper;

	public Ask() {
	}

	public Ask(int askId, Skill skill, int slotsL1, int slotsL2, LocalDate interviewDate, String numGradePersonnel,
			Set<AskPanelistMapper> mapper) {
		super();
		this.askId = askId;
		this.skill = skill;
		this.slotsL1 = slotsL1;
		this.slotsL2 = slotsL2;
		this.interviewDate = interviewDate;
		this.numGradePersonnel = numGradePersonnel;
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

	public int getSlotsL1() {
		return slotsL1;
	}

	public void setSlotsL1(int slotsL1) {
		this.slotsL1 = slotsL1;
	}

	public int getSlotsL2() {
		return slotsL2;
	}

	public void setSlotsL2(int slotsL2) {
		this.slotsL2 = slotsL2;
	}

	public LocalDate getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(LocalDate interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getNumGradePersonnel() {
		return numGradePersonnel;
	}

	public void setNumGradePersonnel(String numGradePersonnel) {
		this.numGradePersonnel = numGradePersonnel;
	}

	public Set<AskPanelistMapper> getMapper() {
		return mapper;
	}

	public void setMapper(Set<AskPanelistMapper> mapper) {
		this.mapper = mapper;
	}
	
}
