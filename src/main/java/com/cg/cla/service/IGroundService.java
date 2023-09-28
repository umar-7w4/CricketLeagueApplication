package com.cg.cla.service;

import java.util.List;

import com.cg.cla.entity.Ground;
import com.cg.cla.entity.Match;
import com.cg.cla.exception.MatchNotFoundException;

public interface IGroundService {

	public List<Match> getAllmatchesGround(int groungId) throws Exception;

	public Match getmatche(int groungId, int matchId) throws Exception;

	public Ground insertGround(Ground ground) throws Exception;

	public Ground updateGround(Ground ground) throws Exception;

	public Ground deleteGround(int groungId) throws Exception;

	public List<Match> getAllMatches() throws Exception;

	public Match getMatch(int matchId) throws Exception;

}
