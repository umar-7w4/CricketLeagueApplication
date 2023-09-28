package com.cg.cla.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/*
 
 {
	"teamName" : "Team A"
 }

 */

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int teamId;
	private String teamName;
	

	
	@OneToMany(mappedBy = "team" , fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Match> matches;

	public Team() {
		
	}

	public Team(int teamId, String teamName, List<Player> players, List<Match> matches) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		//this.players = players;
		this.matches = matches;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	
}
