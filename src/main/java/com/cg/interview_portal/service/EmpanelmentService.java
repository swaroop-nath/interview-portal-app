package com.cg.interview_portal.service;

import java.util.List;

import com.cg.interview_portal.entity.Ask;
import com.cg.interview_portal.entity.AskPanelistMapper;
import com.cg.interview_portal.entity.Panelist;

public interface EmpanelmentService {

	List<Ask> fetchAsks();

	List<Panelist> fetchPanelists();

	boolean addPanelistsToAsk(List<AskPanelistMapper> mapper);

	boolean uploadPanelists(List<Panelist> panelists);

}
