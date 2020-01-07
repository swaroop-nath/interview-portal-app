package com.cg.interview_portal.entity;

import java.io.Serializable;
import java.util.Objects;

public class AskPanelistMapperId implements Serializable {

	private int ask;
	
	private int panelist;

	public AskPanelistMapperId() {
	}
	
	public AskPanelistMapperId(int ask, int panelist) {
		super();
		this.ask = ask;
		this.panelist = panelist;
	}

	public int getAsk() {
		return ask;
	}

	public void setAsk(int ask) {
		this.ask = ask;
	}

	public int getPanelist() {
		return panelist;
	}

	public void setPanelist(int panelist) {
		this.panelist = panelist;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ask, panelist);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || obj.getClass() != this.getClass()) return false;
		
		AskPanelistMapperId that = (AskPanelistMapperId) obj;
		
		return (this.ask == that.getAsk() && this.panelist == that.getPanelist());
	}
	
}
