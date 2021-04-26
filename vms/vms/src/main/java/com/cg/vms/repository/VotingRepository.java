package com.cg.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.vms.model.VotingSession;

public interface VotingRepository extends JpaRepository <VotingSession, Long>{
	
}
