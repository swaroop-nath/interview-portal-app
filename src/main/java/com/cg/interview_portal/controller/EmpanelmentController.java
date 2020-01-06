package com.cg.interview_portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.interview_portal.entity.Ask;
import com.cg.interview_portal.entity.AskPanelistMapper;
import com.cg.interview_portal.entity.Panelist;
import com.cg.interview_portal.service.EmpanelmentService;

@RestController
@PreAuthorize("hasRole('ROLE_EMPANELLER')")
@RequestMapping("empanel-api")
public class EmpanelmentController {
	
	@Autowired private EmpanelmentService service;

	@GetMapping(value = "/fetch-asks", produces = "application/json")
	public List<Ask> fetchAsks() {
		return service.fetchAsks();
	}
	
	@GetMapping(value = "/fetch-panelists", produces = "application/json")
	public List<Panelist> fetchPanelists() {
		return service.fetchPanelists();
	}
	
	@PostMapping(value = "/fulfill-ask", consumes = "application/json")
	public boolean addPanelistsToAsk(@RequestBody List<AskPanelistMapper> mappers) {
		return service.addPanelistsToAsk(mappers);
	}
	
	@PostMapping(value = "upload-panelist", consumes = "application/json")
	public boolean uploadPanelists(@RequestBody List<Panelist> panelists) {
		return service.uploadPanelists(panelists);
	}
	
//	public boolean uploadDemands(@RequestBody List<Demand> demands) {
//		
//	}
//	
//	public List<Demand> fetchDemands() {
//		
//	}
}
