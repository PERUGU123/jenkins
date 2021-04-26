package com.cg.vms.service.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.vms.model.Voter;
import com.cg.vms.model.VotingSession;
import com.cg.vms.repository.VoterRepository;
import com.cg.vms.repository.VotingRepository;
import com.cg.vms.service.VotingService;

@RunWith(SpringRunner.class)
@SpringBootTest
class VotingSessionServiceTest {
	
	@MockBean
    private VotingRepository votingRepository;
	
	@Autowired
	private VotingService votingService;
	
	@Test
	void testCreateVotingSession() throws Exception{
		VotingSession votingSession = new VotingSession();
	   	votingSession.setCandidateId(1);
	   	votingSession.setName("MARINA");
	   	votingSession.setConstituency("Chennai");
	   	votingSession.setParty("AAA");
	   	 Mockito.when(votingRepository.save(votingSession)).thenReturn(votingSession);
	   	 assertThat(votingService.saveVoting(votingSession)).isEqualTo(votingSession);               
	}

}
