package com.cg.interview_portal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "skill_seq", sequenceName = "skill_sequence", allocationSize = 1)
public class Skill {

	@Id
	@GeneratedValue(generator = "skill_seq")
	@Column(name = "skill_id")
	private int skillId;
	
	@Column(length = 20, nullable = false)
	private String skillName;

	public Skill() {
	}
	
	public Skill(int skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
}
