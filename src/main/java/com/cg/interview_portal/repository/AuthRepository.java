package com.cg.interview_portal.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.interview_portal.entity.User;


public interface AuthRepository extends JpaRepository<User, Integer> {
	
	@Autowired static EntityManager ENTITY_MANAGER = null;
	
	@Query(value = "from User where emailId = :email")
	User findUserByEmailID(String email);
	
}
