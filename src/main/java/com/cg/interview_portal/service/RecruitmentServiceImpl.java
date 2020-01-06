package com.cg.interview_portal.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.interview_portal.entity.Ask;
import com.cg.interview_portal.repository.AskRepository;

@Service
@Transactional
public class RecruitmentServiceImpl implements RecruitmentService {

	@Autowired private AskRepository repository;
	
	@PersistenceContext private EntityManager ENTITY_MANAGER;
	
	@Override
	public boolean raiseAnAsk(Ask raisedAsk) {
		Ask mergedAsk = ENTITY_MANAGER.merge(raisedAsk);
		repository.flush();
		return true;
	}

}
