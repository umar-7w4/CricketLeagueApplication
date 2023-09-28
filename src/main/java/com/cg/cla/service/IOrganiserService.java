package com.cg.cla.service;

import java.util.List;

import com.cg.cla.entity.Organiser;
import com.cg.cla.entity.Owner;
import com.cg.cla.entity.Tournament;

public interface IOrganiserService {

	public Organiser getOrganiser(int organiserId) throws Exception;

	public List<Organiser> getAllOrganisers() throws Exception;

	public Organiser insertOrganiser(Organiser organiser) throws Exception;

	public Organiser updateOrganiser(Organiser organiser) throws Exception;

	public List<Tournament> getTournaments() throws Exception;

	public Tournament getTournament(int tournamentId) throws Exception;

	public double getBudget(int id) throws Exception;

}
