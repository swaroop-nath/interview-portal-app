package com.cg.interview_portal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@IdClass(AskPanelistMapperId.class)
public class AskPanelistMapper {

	@Id
	@ManyToOne
	@JoinColumn(name = "ask_id", referencedColumnName = "ask_id")
	private Ask ask;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "panelist_id", referencedColumnName = "panelist_id")
	private Panelist panelist;
	
	@Column(length = 30, nullable = false)
	private String interviewLocation;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 4, nullable = false)
	private Mode mode;
	
	@Column(length = 2, nullable = false)
	private String level;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "HH:mm", timezone = "IST")
	@Column(nullable = false)
	private Date slotStartTiming;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "HH:mm", timezone = "IST")
	@Column(nullable = false)
	private Date slotEndTiming;
	
	@Column(length = 2, nullable = false)
	private int numSlots;
	
	@Column(length = 256)
	private String comment;

	public AskPanelistMapper(Ask ask, Panelist panelist, String interviewLocation, Mode mode, String level,
			Date slotStartTiming, Date slotEndTiming, int numSlots, String comment) {
		super();
		this.ask = ask;
		this.panelist = panelist;
		this.interviewLocation = interviewLocation;
		this.mode = mode;
		this.level = level;
		this.slotStartTiming = slotStartTiming;
		this.slotEndTiming = slotEndTiming;
		this.numSlots = numSlots;
		this.comment = comment;
	}

	public Ask getAsk() {
		return ask;
	}

	public void setAsk(Ask ask) {
		this.ask = ask;
	}

	public Panelist getPanelist() {
		return panelist;
	}

	public void setPanelist(Panelist panelist) {
		this.panelist = panelist;
	}

	public String getInterviewLocation() {
		return interviewLocation;
	}

	public void setInterviewLocation(String interviewLocation) {
		this.interviewLocation = interviewLocation;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Date getSlotStartTiming() {
		return slotStartTiming;
	}

	public void setSlotStartTiming(Date slotStartTiming) {
		this.slotStartTiming = slotStartTiming;
	}

	public Date getSlotEndTiming() {
		return slotEndTiming;
	}

	public void setSlotEndTiming(Date slotEndTiming) {
		this.slotEndTiming = slotEndTiming;
	}

	public int getNumSlots() {
		return numSlots;
	}

	public void setNumSlots(int numSlots) {
		this.numSlots = numSlots;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
