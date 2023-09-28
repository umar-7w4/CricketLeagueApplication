package com.cg.cla.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int ownerId;
	private String ownerName;
	private double budget;

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "team_id", referencedColumnName = "teamId")
	private Team team;

	public Owner() {
		
	}

	public Owner(int ownerId, String ownerName, double budget, Team team) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.budget = budget;
		this.team = team;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	

}
