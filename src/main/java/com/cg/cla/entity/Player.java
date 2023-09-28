package com.cg.cla.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


/*
 
 {
	"playerName" : "Kiran",
	"salary" : 30000,
	"skill" : "Bastmen",
	"team" :  {
		"teamName" : "Team A"
	 }
}
 */

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int playerId;
	private String playerName;
	private double salary;

	private String skill; //BATSMAN, BOWLER, WICKETKEEPER, ALLROUNDER;

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "team_id", referencedColumnName = "teamId")
	private Team team;

	public Player() {
		
	}

	public Player(int playerId, String playerName, double salary, String skill, Team team) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.salary = salary;
		this.skill = skill;
		this.team = team;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	

}
