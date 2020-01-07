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

	/**
	 * The following end-point is used to fetch all the panelists stored in the database.
	 * @return The list of panelists.
	 */
	@GetMapping(value = "/fetch-asks", produces = "application/json")
	public List<Ask> fetchAsks() {
		return service.fetchAsks();
	}
	
	/**
	 * The following end-point is used to fetch all the asks stored in the database.
	 * @return The list of asks.
	 */
	@GetMapping(value = "/fetch-panelists", produces = "application/json")
	public List<Panelist> fetchPanelists() {
		return service.fetchPanelists();
	}
	
	/**
	 * The following end-point is used to add panelists to
	 * a raised ask.
	 * Sample JSON input - 
	 * [
			{
				"ask": {
			        "askId": 2,
			        "skill": {
			            "skillId": 1,
			            "skillName": "JAVA"
			        },
			        "slotsL1": 2,
			        "slotsL2": 4,
			        "interviewDate": "2020-01-15",
			        "numGradePersonnel": "C1-2 C2-2",
			        "mapper": []
			    },
			    "panelist": {
			        "panelistId": 1,
			        "panelistName": "ABC",
			        "email": "hi@panel.com",
			        "grade": "C1",
			        "contactDetail": "+919876543210",
			        "account": "Daimler",
			        "baseLocation": "Mumbai",
			        "skills": [
			            {
			                "skillId": 1,
			                "skillName": "JAVA"
			            },
			            {
			                "skillId": 52,
			                "skillName": "SPRING"
			            }
			        ],
			        "mapper": []
			    },
			    "interviewLocation": "Bangalore",
			    "mode": "TELE",
			    "level": "L1",
			    "slotStartTiming": "10:30",
			    "slotEndTiming": "11:30",
			    "numSlots": 2,
			    "comment": ""
			}
		]
	 * @param mappers
	 * @return
	 */
	@PostMapping(value = "/fulfill-ask", consumes = "application/json")
	public boolean addPanelistsToAsk(@RequestBody List<AskPanelistMapper> mappers) {
		return service.addPanelistsToAsk(mappers);
	}
	
	/**
	 * The following end-point is used to upload the list of panelists
	 * to the database.
	 * Sample JSON input - 
	 * [
			{
				"panelistName": "ABC",
				"email": "hi@panel.com",
				"grade": "C1",
				"contactDetail": "+919876543210",
				"account": "Daimler",
				"baseLocation": "Mumbai",
				"skills": [
					{
						"skillId": 1,
		            	"skillName": "JAVA"		
					},
					{
						"skillName": "SPRING"
					}
				],
				"mapper": []
			},
			{
				"panelistName": "BCD",
				"email": "hello@panel.in",
				"grade": "C2",
				"contactDetail": "+910123456789",
				"account": "Volkswagan",
				"baseLocation": "Bangalore",
				"skills": [
					{
		            	"skillName": ".NET"		
					}
				],
				"mapper": []
			}
		]
	 * @param panelists
	 * @return
	 */
	@PostMapping(value = "/upload-panelist", consumes = "application/json")
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
