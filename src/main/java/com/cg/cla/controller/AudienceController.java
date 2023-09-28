package com.cg.cla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Match;
import com.cg.cla.entity.Ticket;
import com.cg.cla.service.IAudienceService;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cla-audience")
public class AudienceController {
	
	@Autowired
	IAudienceService iAudienceService;
	
	@GetMapping("/getAudience/{audienceId}")
	public Audience getAudience(@PathVariable int audienceId) throws Exception{
		return iAudienceService.getAudience(audienceId);
	}

	@PostMapping("/insertAudience")
	public Audience insertAudience(@RequestBody Audience audience) throws Exception{
		return iAudienceService.insertAudience(audience);
	}

	@GetMapping("/getMatch/{audienceId}")
	public Match getMatch(@PathVariable int audienceId) throws Exception{
		return iAudienceService.getMatch(audienceId);
	}

	@GetMapping("/getAllMatches")
	public List<Match> getAllMatches() throws Exception{
		return iAudienceService.getAllMatches();
	}

	@GetMapping("/getAllTickets")
	public List<Ticket> getAllTickets() throws Exception{
		return iAudienceService.getAllTickets();
	}

	@GetMapping("/getTicket/{ticketId}")
	public Ticket getTicket(@PathVariable int ticketId) throws Exception{
		return iAudienceService.getTicket(ticketId);
	}

	@GetMapping("/getPaidAmountForAllTickects")
	public double getPaidAmountForAllTickects() throws Exception{
		return iAudienceService.getPaidAmountForAllTickects();
	}

}
