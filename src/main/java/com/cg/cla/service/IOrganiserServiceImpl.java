package com.cg.cla.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cla.entity.Match;
import com.cg.cla.entity.Organiser;
import com.cg.cla.entity.Owner;
import com.cg.cla.entity.Tournament;
import com.cg.cla.exception.MatchNotFoundException;
import com.cg.cla.repository.OrganiserRepository;
import com.cg.cla.repository.TournamentRepository;

@Service("IOrganiserService")
public class IOrganiserServiceImpl implements IOrganiserService{
	
	@Autowired
	OrganiserRepository organiserRepository;
	
	@Autowired
	TournamentRepository tournamentRepository;

	@Override
	public Organiser getOrganiser(int organiserId) throws Exception {
		Organiser bean = null;
		try {
			bean = organiserRepository.findById(organiserId).get();
		}
		catch(Exception e) {
			throw new Exception("Organiser details not found!");
		}
		return bean;
	}

	@Override
	public List<Organiser> getAllOrganisers() throws Exception {
		return organiserRepository.findAll();
	}

	@Override
	public Organiser insertOrganiser(Organiser organiser) throws Exception {
		organiserRepository.saveAndFlush(organiser);
		return organiser;
	}

	@Override
	public Organiser updateOrganiser(Organiser organiser) throws Exception {
		Organiser bean = null;
		try {
			bean = organiserRepository.findById(organiser.getOrganiserId()).get();
		}
		catch(Exception e) {
			throw new Exception("Organiser details not found!");
		}
		organiserRepository.saveAndFlush(organiser);
		return organiser;
	}

	@Override
	public List<Tournament> getTournaments() throws Exception {
		return tournamentRepository.findAll();
	}

	@Override
	public Tournament getTournament(int tournamentId) throws Exception {
		Tournament bean = null;
		try {
			bean = tournamentRepository.findById(tournamentId).get();
		}
		catch(Exception e) {
			throw new Exception("Tournament details not found!");
		}
		return bean;
	}
	
	
	@Override
	public double getBudget(int id) throws Exception {
		Organiser bean = null;
		try {
			bean = organiserRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new Exception("Organiser details not found!");
		}
		return bean.getBudget();
	}

}
