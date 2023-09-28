package com.cg.cla.service;

import java.util.List;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Match;
import com.cg.cla.entity.Ticket;
import com.cg.cla.exception.MatchNotFoundException;

public interface IAudienceService {

	public Audience getAudience(int audienceId) throws Exception;

	public Audience insertAudience(Audience audience) throws Exception;

	public Match getMatch(int audienceId) throws Exception;

	public List<Match> getAllMatches() throws Exception;

	public List<Ticket> getAllTickets() throws Exception;

	public Ticket getTicket(int ticketId) throws Exception;

	public double getPaidAmountForAllTickects() throws Exception;

}
