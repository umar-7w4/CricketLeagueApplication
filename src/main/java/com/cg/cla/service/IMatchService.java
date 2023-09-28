package com.cg.cla.service;

import java.util.List;
import java.util.Map;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Match;
import com.cg.cla.entity.Schedule;
import com.cg.cla.entity.Team;
import com.cg.cla.entity.Tournament;
import com.cg.cla.exception.MatchNotFoundException;

public interface IMatchService {

	public Match getMatch(int matchId) throws MatchNotFoundException;

	public Match insertMatch(Match match) throws MatchNotFoundException;

	public Match updateMatch(Match match) throws MatchNotFoundException;

	public List<Team> getTeam() throws MatchNotFoundException;

	public Schedule getSchedule(int matchId) throws MatchNotFoundException;

	public Tournament getTournament(int matchId) throws MatchNotFoundException;
	
	public List<Audience> getAllAudience() throws MatchNotFoundException;
	
	public Audience getAudience(int audienceId) throws MatchNotFoundException;

}
