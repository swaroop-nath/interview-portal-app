package com.cg.interview_portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Interview {

	@Id
	@GeneratedValue
	private int interviewDetailId;

	@Column(length = 2, nullable = false)
	private int slotsL1;

	@Column(length = 2, nullable = false)
	private int slotsL2;

	@Column(length = 32)
	private String interviewLocation;

	@Column(length = 2)
	private String gradeOneL1;

	private int gradeOneSlotsL1;

	@Column(length = 2)
	private String gradeTwoL1;

	private int gradeTwoSlotsL1;

	@Column(length = 2)
	private String gradeThreeL1;

	private int gradeThreeSlotsL1;

	@Column(length = 2)
	private String gradeOneL2;

	private int gradeOneSlotsL2;

	@Column(length = 2)
	private String gradeTwoL2;

	private int gradeTwoSlotsL2;

	@Column(length = 2)
	private String gradeThreeL2;

	private int gradeThreeSlotsL2;

	public Interview() {
	}

	public Interview(int interviewDetailId, int slotsL1, int slotsL2, String interviewLocation, String gradeOneL1,
			int gradeOneSlotsL1, String gradeTwoL1, int gradeTwoSlotsL1, String gradeThreeL1, int gradeThreeSlotsL1,
			String gradeOneL2, int gradeOneSlotsL2, String gradeTwoL2, int gradeTwoSlotsL2, String gradeThreeL2,
			int gradeThreeSlotsL2) {
		super();
		this.interviewDetailId = interviewDetailId;
		this.slotsL1 = slotsL1;
		this.slotsL2 = slotsL2;
		this.interviewLocation = interviewLocation;
		this.gradeOneL1 = gradeOneL1;
		this.gradeOneSlotsL1 = gradeOneSlotsL1;
		this.gradeTwoL1 = gradeTwoL1;
		this.gradeTwoSlotsL1 = gradeTwoSlotsL1;
		this.gradeThreeL1 = gradeThreeL1;
		this.gradeThreeSlotsL1 = gradeThreeSlotsL1;
		this.gradeOneL2 = gradeOneL2;
		this.gradeOneSlotsL2 = gradeOneSlotsL2;
		this.gradeTwoL2 = gradeTwoL2;
		this.gradeTwoSlotsL2 = gradeTwoSlotsL2;
		this.gradeThreeL2 = gradeThreeL2;
		this.gradeThreeSlotsL2 = gradeThreeSlotsL2;
	}

	public int getInterviewDetailId() {
		return interviewDetailId;
	}

	public void setInterviewDetailId(int interviewDetailId) {
		this.interviewDetailId = interviewDetailId;
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

	public String getInterviewLocation() {
		return interviewLocation;
	}

	public void setInterviewLocation(String interviewLocation) {
		this.interviewLocation = interviewLocation;
	}

	public String getGradeOneL1() {
		return gradeOneL1;
	}

	public void setGradeOneL1(String gradeOneL1) {
		this.gradeOneL1 = gradeOneL1;
	}

	public int getGradeOneSlotsL1() {
		return gradeOneSlotsL1;
	}

	public void setGradeOneSlotsL1(int gradeOneSlotsL1) {
		this.gradeOneSlotsL1 = gradeOneSlotsL1;
	}

	public String getGradeTwoL1() {
		return gradeTwoL1;
	}

	public void setGradeTwoL1(String gradeTwoL1) {
		this.gradeTwoL1 = gradeTwoL1;
	}

	public int getGradeTwoSlotsL1() {
		return gradeTwoSlotsL1;
	}

	public void setGradeTwoSlotsL1(int gradeTwoSlotsL1) {
		this.gradeTwoSlotsL1 = gradeTwoSlotsL1;
	}

	public String getGradeThreeL1() {
		return gradeThreeL1;
	}

	public void setGradeThreeL1(String gradeThreeL1) {
		this.gradeThreeL1 = gradeThreeL1;
	}

	public int getGradeThreeSlotsL1() {
		return gradeThreeSlotsL1;
	}

	public void setGradeThreeSlotsL1(int gradeThreeSlotsL1) {
		this.gradeThreeSlotsL1 = gradeThreeSlotsL1;
	}

	public String getGradeOneL2() {
		return gradeOneL2;
	}

	public void setGradeOneL2(String gradeOneL2) {
		this.gradeOneL2 = gradeOneL2;
	}

	public int getGradeOneSlotsL2() {
		return gradeOneSlotsL2;
	}

	public void setGradeOneSlotsL2(int gradeOneSlotsL2) {
		this.gradeOneSlotsL2 = gradeOneSlotsL2;
	}

	public String getGradeTwoL2() {
		return gradeTwoL2;
	}

	public void setGradeTwoL2(String gradeTwoL2) {
		this.gradeTwoL2 = gradeTwoL2;
	}

	public int getGradeTwoSlotsL2() {
		return gradeTwoSlotsL2;
	}

	public void setGradeTwoSlotsL2(int gradeTwoSlotsL2) {
		this.gradeTwoSlotsL2 = gradeTwoSlotsL2;
	}

	public String getGradeThreeL2() {
		return gradeThreeL2;
	}

	public void setGradeThreeL2(String gradeThreeL2) {
		this.gradeThreeL2 = gradeThreeL2;
	}

	public int getGradeThreeSlotsL2() {
		return gradeThreeSlotsL2;
	}

	public void setGradeThreeSlotsL2(int gradeThreeSlotsL2) {
		this.gradeThreeSlotsL2 = gradeThreeSlotsL2;
	}

}
