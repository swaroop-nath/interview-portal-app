package com.cg.interview_portal.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.interview_portal.entity.Ask;
import com.cg.interview_portal.entity.AskPanelistMapper;
import com.cg.interview_portal.entity.Panelist;
import com.cg.interview_portal.repository.AskPanelistRepository;
import com.cg.interview_portal.repository.AskRepository;
import com.cg.interview_portal.repository.PanelistRepository;

@Service
@Transactional
public class EmpanelmentServiceImpl implements EmpanelmentService {

	@Autowired private AskRepository askRepository;
	@Autowired private PanelistRepository panelRepository;
	@Autowired private AskPanelistRepository askPanelRepository;
	@PersistenceContext private EntityManager ENTITY_MANAGER;
	
	@Override
	public List<Ask> fetchAsks() {
		return askRepository.findAll();
	}

	@Override
	public List<Panelist> fetchPanelists() {
		return panelRepository.findAll();
	}

	@Override
	public boolean addPanelistsToAsk(List<AskPanelistMapper> mappers) {
		for (AskPanelistMapper mapper: mappers) {
			ENTITY_MANAGER.merge(mapper);
			askPanelRepository.flush();
		}
		return true;
	}

	@Override
	public boolean uploadPanelists(List<Panelist> panelists) {
		for (Panelist panelist: panelists)
			panelRepository.save(panelist);
		return true;
	}

}
