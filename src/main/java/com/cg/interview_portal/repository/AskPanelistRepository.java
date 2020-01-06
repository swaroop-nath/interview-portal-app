package com.cg.interview_portal.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.interview_portal.entity.AskPanelistMapper;

public interface AskPanelistRepository extends JpaRepository<AskPanelistMapper, Integer> {

}
