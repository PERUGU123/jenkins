package com.cg.vms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Candidate {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long candidateId;
	@NotEmpty(message = "firstName cannot be empty")
	private String firstName;
	@NotEmpty(message = "lastName cannot be empty")
	private String lastName;
	private String gender;
	@NotNull(message = "age cannot be empty")
	@Min(18)
	@Max(60)
	private Long age;
	@Email
	private String emailId;
	@Size(min=10, max = 10, message = "Invalid Phone number")
	private String phoneNumber;
	private String constituency;
	@Size(min=8)
	@NotEmpty(message = "Invalid password")
	private String password;
	public Candidate() {
		super();
	}
	public Long getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public Candidate(Long candidateId, String firstName, String lastName, String gender, Long age, String emailId,
			String phoneNumber, String constituency, String password) {
		super();
		this.candidateId = candidateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.constituency = constituency;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", age=" + age + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", constituency=" + constituency + ", password=" + password + "]";
	}
	
	
	
	
	
	
	

}
