package com.cg.cla.service;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Match;
import com.cg.cla.entity.Ticket;

public interface ITicketService {

	public Ticket getTicket(int ticketId) throws Exception;
 
	public Ticket insertTicket(Ticket ticket) throws Exception;

	public Ticket cancelTicket(int ticketId) throws Exception;

	public Audience getSchedule(int ticketId) throws Exception;

	public double getBill(int id) throws Exception;

}
