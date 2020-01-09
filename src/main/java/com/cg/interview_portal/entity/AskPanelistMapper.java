package com.cg.interview_portal.entity;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@IdClass(AskPanelistMapperId.class)
public class AskPanelistMapper {

	@Id
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "ask_id", referencedColumnName = "ask_id")
	private Ask ask;
	
	@Id
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "panelist_id", referencedColumnName = "panelist_id")
	private Panelist panelist;
	
	@Column(length = 30, nullable = false)
	private String interviewLocation;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 4, nullable = false)
	private Mode mode;
	
	@Column(length = 2, nullable = false)
	private String level;
	
	@Column(length = 10, nullable = false)
	private LocalTime slotStartTiming;
	
	@Column(length = 10, nullable = false)
	private LocalTime slotEndTiming;
	
	@Column(length = 2, nullable = false)
	private int numSlots;
	
	@Column(length = 256)
	private String comment;

	public AskPanelistMapper() {
	}
	
	public AskPanelistMapper(Ask ask, Panelist panelist, String interviewLocation, Mode mode, String level,
			LocalTime slotStartTiming, LocalTime slotEndTiming, int numSlots, String comment) {
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

	public LocalTime getSlotStartTiming() {
		return slotStartTiming;
	}

	public void setSlotStartTiming(LocalTime slotStartTiming) {
		this.slotStartTiming = slotStartTiming;
	}

	public LocalTime getSlotEndTiming() {
		return slotEndTiming;
	}

	public void setSlotEndTiming(LocalTime slotEndTiming) {
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
