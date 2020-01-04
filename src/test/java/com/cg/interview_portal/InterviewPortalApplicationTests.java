package com.cg.interview_portal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.interview_portal.controller.AuthController;

@SpringBootTest
class InterviewPortalApplicationTests {
	
	@Autowired AuthController controller;

	@Test
	void contextLoads() {
		assertNotNull(controller);
	}

}
