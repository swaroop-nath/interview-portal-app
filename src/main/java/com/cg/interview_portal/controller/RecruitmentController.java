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
@RequestMapping("recruit-api")
public class RecruitmentController {
	
	@Autowired private RecruitmentService service;

	@PreAuthorize("hasRole('ROLE_RECRUITER')")
	@PostMapping(value = "/raise-ask", consumes = "application/json")
	public boolean raiseAnAsk(@RequestBody Ask raisedAsk) {
		return service.raiseAnAsk(raisedAsk);
	}
	
}
