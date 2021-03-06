package com.cg.vms.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.vms.model.Candidate;


class CandidateTest {
	
	Candidate can;
	
	@BeforeEach
	void setUp() throws Exception {
		can = new Candidate();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		can = null;
	}

	@Test
	void testCanFirstName() {
		can.setFirstName("abcde");
		assertEquals("abcde",can.getFirstName());
	}
	
	@Test
	void testCanFirstNameFalse() {
		can.setFirstName("abcde");
		assertNotEquals("abe",can.getFirstName());
	}
	
	@Test
	void testCanLastName() {
		can.setLastName("abcde");
		assertEquals("abcde",can.getLastName());
	}
	
	@Test
	void testCanLastNameFalse() {
		can.setLastName("abcde");
		assertNotEquals("abe",can.getLastName());
	}
	@Test
	void testCanAge() {
		can.setAge(23);
		assertEquals(23,can.getAge());
	}
	
	@Test
	void testCanAgeFalse() {
		can.setAge(23);
		assertNotEquals(12,can.getAge());
	}
	
	@Test
	void testCanGender() {
		can.setGender("M");
		assertEquals("M",can.getGender());
	}
	
	@Test
	void testCanGenderFalse() {
		can.setGender("M");
		assertNotEquals("F",can.getGender());
	}
	
	@Test
	void testCanPhoneNumber() {
		can.setPhoneNumber("9123445623");
		assertEquals("9123445623",can.getPhoneNumber());
	}
	
	@Test
	void testVotPhoneFalse() {
		can.setPhoneNumber("9123445623");
		assertNotEquals("91234453",can.getPhoneNumber());
	}
	
	@Test
	void testCanEmailId() {
		can.setEmailId("abcd@gmail.com");
		assertEquals("abcd@gmail.com",can.getEmailId());
	}
	
	@Test
	void testCanEmailIdFalse() {
		can.setEmailId("abcd@gmail.com");
		assertNotEquals("abc@gmail.com",can.getEmailId());
	}
	
	@Test
	void testCanPassword() {
		can.setPassword("Abchgf");
		assertEquals("Abchgf",can.getPassword());
	}
	
	@Test
	void testCanPasswordFalse() {
		can.setPassword("Abchgf");
		assertNotEquals("Abchg",can.getPassword());
	}
	
	@Test
	void testCanConstituency() {
		can.setConstituency("Pune");
		assertEquals("Pune",can.getConstituency());
	}
	
	@Test
	void testCanConstituencyFalse() {
		can.setConstituency("Pune");
		assertNotEquals("Delhi",can.getConstituency());
	}
}
