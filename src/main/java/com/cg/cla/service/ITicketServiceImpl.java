package com.cg.cla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Match;
import com.cg.cla.entity.Team;
import com.cg.cla.entity.Ticket;
import com.cg.cla.repository.TicketRepository;

@Service("ITicketService")
public class ITicketServiceImpl implements ITicketService {
	
	@Autowired
	TicketRepository ticketRepository;

	@Override
	public Ticket getTicket(int ticketId) throws Exception {
		Ticket bean = null;
		try {
			bean = ticketRepository.findById(ticketId).get();
		}
		catch(Exception e) {
			throw new Exception("Ticket details not found!");
		}
		return bean;
	}

	@Override
	public Ticket insertTicket(Ticket ticket) throws Exception {
		ticketRepository.saveAndFlush(ticket);
		return ticket;
	}

	@Override
	public Ticket cancelTicket(int ticketId) throws Exception {
		Ticket bean = null;
		try {
			bean = ticketRepository.findById(ticketId).get();
		}
		catch(Exception e) {
			throw new Exception("Ticket details not found!");
		}
		ticketRepository.deleteById(ticketId);
		return bean;
	}

	@Override
	public Audience getSchedule(int ticketId) throws Exception {
		Ticket bean = null;
		try {
			bean = ticketRepository.findById(ticketId).get();
		}
		catch(Exception e) {
			throw new Exception("Ticket details not found!");
		}
		return bean.getAudience();
	}

	@Override
	public double getBill(int id) throws Exception {
		Ticket bean = null;
		try {
			bean = ticketRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new Exception("Ticket details not found!");
		}
		return bean.getTotalAmount();
	}


}
