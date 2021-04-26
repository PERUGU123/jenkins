package com.cg.vms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VotingSession extends CandidateBase {
	@Id
	private long candidateId;
	
	
	public long getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(long candidateId) {
		this.candidateId = candidateId;
	}

	public VotingSession(long candidateId, String Name, String constituency, String party) {
		// TODO Auto-generated constructor stub
		this.candidateId=candidateId;
		this.name=Name;
		this.constituency=constituency;
		this.party=party;
		}
	
	public VotingSession() {}

	
}
