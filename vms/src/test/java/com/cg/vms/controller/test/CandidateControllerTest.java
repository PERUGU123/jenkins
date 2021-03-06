package com.cg.vms.controller.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import com.cg.vms.VmsApplication;
import com.cg.vms.model.Candidate;


@SpringBootTest(classes=VmsApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class CandidateControllerTest {
	
			@Autowired
			private TestRestTemplate restTemplate;
			
			@LocalServerPort
			private int port;
			private String getRootUrl()
			{
				return "http://localhost:"+port;
			}
			
			@Test
			void testCreateCandidate() {
				Candidate candidate=new Candidate();
				candidate.setCandidateId((long) 3);
				candidate.setFirstName("kane");
				candidate.setLastName("Ravi");
				candidate.setAge(24);
				candidate.setGender("M");
				candidate.setPhoneNumber("9876543210");
				candidate.setEmailId("kane@gmail.com");
				candidate.setPassword("kane1234");
				candidate.setConstituency("Chennai");
				ResponseEntity<Candidate> postResponse=restTemplate.postForEntity(getRootUrl()+"/candidate/all",candidate,Candidate.class);
				assertNotNull(postResponse);
				assertNotNull(postResponse.getBody());
			}
			
			
			@Test
			void testGetAllCandidates() {
				HttpHeaders header=new HttpHeaders();
				HttpEntity<String> entity=new HttpEntity<String>(null,header);
				ResponseEntity<String> response=restTemplate.exchange(getRootUrl()+"/api/v1/candidate/all",HttpMethod.GET,entity,String.class);
				assertNotNull(response.getBody());
			}
			
			@Test
			void testGetCandidateById() {
				Candidate candidate=new Candidate();
				candidate.setCandidateId((long) 3);
				candidate.setFirstName("kane");
				candidate.setLastName("Ravi");
				candidate.setAge(24);
				candidate.setGender("M");
				candidate.setPhoneNumber("9876543210");
				candidate.setEmailId("kane@gmail.com");
				candidate.setPassword("kane1234");
				candidate.setConstituency("Chennai");
				restTemplate.postForEntity(getRootUrl()+"/api/v1/candidate/all", candidate,Candidate.class);
				Candidate can = restTemplate.getForObject(getRootUrl()+"/api/v1/candidate/3",Candidate.class);
				assertNotNull(can);
			}
			  
			
			@Test
			void testDeleteCandidate() {
				Candidate candidate=new Candidate();
				candidate.setCandidateId((long) 3);
				candidate.setFirstName("kane");
				candidate.setLastName("Ravi");
				candidate.setAge(24);
				candidate.setGender("M");
				candidate.setPhoneNumber("9876543210");
				candidate.setEmailId("kane@gmail.com");
				candidate.setPassword("kane1234");
				candidate.setConstituency("Chennai");
				ResponseEntity<Candidate> postResponse=restTemplate.postForEntity(getRootUrl()+"/api/v1/saveVoter", candidate,Candidate.class);
				assertNotNull(postResponse);
				restTemplate.delete(getRootUrl()+"/api/v1/candidate/3");
					Candidate can1=restTemplate.getForObject(getRootUrl()+"/candidate/3",Candidate.class);
					assertNotEquals(candidate,can1);
			}
	

}
