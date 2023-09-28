package com.cg.cla.service;

import java.util.List;

import com.cg.cla.entity.Match;
import com.cg.cla.entity.Tournament;

public interface ITournamentService {

	public Tournament getTournament(int tournamentId) throws Exception;

	public List<Tournament> getAllTournaments() throws Exception;

	public Tournament insertTournament(Tournament tournament) throws Exception;

	public Tournament updateTournament(Tournament tournament) throws Exception;

	public Tournament deleteTournament(int tournamentId) throws Exception;

	public List<Match> getAllMatches() throws Exception;

	public Match getMatch(int tournamentId, int matchId) throws Exception;

	public Tournament getTournament(Match match) throws Exception;
}
