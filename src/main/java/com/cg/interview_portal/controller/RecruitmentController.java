package com.cg.interview_portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.interview_portal.entity.Ask;
import com.cg.interview_portal.service.RecruitmentService;

@RestController
@PreAuthorize("hasRole('ROLE_RECRUITER')")
@RequestMapping("recruit-api")
public class RecruitmentController {
	
	@Autowired private RecruitmentService service;

	/**
	 * The following end-point is used to raise a new ask on the system.
	 * Sample JSON input - 
	 * {
			"skill": {
				"skillName": "JAVA"
			},
			"slotsL1": 2,
			"slotsL2": 4,
			"interviewDate": "2020-01-15",
			"numGradePersonnel": "C1-2 C2-2"
		}
	 * @param raisedAsk The new ask that is to be raised.
	 * @return A flag stating whether the ask was raised or not.
	 */
	@PostMapping(value = "/raise-ask", consumes = "application/json")
	public boolean raiseAnAsk(@RequestBody Ask raisedAsk) {
		return service.raiseAnAsk(raisedAsk);
	}
	
}
