package com.cg.cla.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Ground;
import com.cg.cla.entity.Match;
import com.cg.cla.repository.GroundRepository;
import com.cg.cla.repository.MatchRepository;

@Service("IGroundService")
public class IGroundServiceImpl implements IGroundService{
	
	@Autowired
	GroundRepository groundRepository;
	
	@Autowired
	MatchRepository matchRepository;

	@Override
	public List<Match> getAllmatchesGround(int groungId) throws Exception {
		Ground bean = null;
		try {
			bean = groundRepository.findById(groungId).get();
		}
		catch(Exception e) {
			throw new Exception("Match details not found!");
		}
		return bean.getMatches();
	}

	@Override
	public Match getmatche(int groungId, int matchId) throws Exception {
		Ground bean = null;
		Match match = null;
		try {
			bean = groundRepository.findById(groungId).get();
			for(Match i : bean.getMatches()) {
				if(i.getMatchId()==matchId) {
					match = i;
				}
			}
		}
		catch(Exception e) {
			throw new Exception("Match details not found!");
		}
		
		return match;
	}

	@Override
	public Ground insertGround(Ground ground) throws Exception {
		groundRepository.saveAndFlush(ground);
		return ground;
	}

	@Override
	public Ground updateGround(Ground ground) throws Exception {
		Ground bean = null;
		try {
			bean = groundRepository.findById(ground.getGroundId()).get();
		}
		catch(Exception e) {
			throw new Exception("Ground details not found!");
		}
		groundRepository.saveAndFlush(ground);
		return bean;
	}

	@Override
	public Ground deleteGround(int groungId) throws Exception {
		Ground bean = null;
		try {
			bean = groundRepository.findById(groungId).get();
		}
		catch(Exception e) {
			throw new Exception("Ground details not found!");
		}
		groundRepository.deleteById(groungId);
		return bean;
	}

	@Override
	public List<Match> getAllMatches() throws Exception {
		return matchRepository.findAll();
	}

	@Override
	public Match getMatch(int matchId) throws Exception {
		Match bean = null;
		try {
			bean = matchRepository.findById((long)matchId).get();
		}
		catch(Exception e) {
			throw new Exception("Match details not found!");
		}
		return bean;
	}

}
