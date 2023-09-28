package com.cg.cla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Match;
import com.cg.cla.entity.Player;
import com.cg.cla.entity.Team;
import com.cg.cla.entity.Ticket;
import com.cg.cla.service.IAudienceService;
import com.cg.cla.service.ITeamService;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cla-team")
public class TeamController {
	
	@Autowired
	ITeamService iTeamService;
	
	
	@GetMapping("/getTeam/{teamId}")
	public Team getTeam(@PathVariable int teamId) throws Exception{
		return iTeamService.getTeam(teamId);
	}

	@GetMapping("/getAllTeams")
	public List<Team> getAllTeams() throws Exception{
		return iTeamService.getAllTeams();
	}

	@PostMapping("/insertTeam")
	public Team insertTeam(@RequestBody Team team) throws Exception{
		return iTeamService.insertTeam(team);
	}

	@PutMapping("/updateTeam")
	public Team updateTeam(@RequestBody Team team) throws Exception{
		return iTeamService.updateTeam(team);
	}

	@DeleteMapping("/deleteTeam/{teamId}")
	public Team deleteTeam(@PathVariable int teamId) throws Exception{
		return iTeamService.deleteTeam(teamId);
	}

	@GetMapping("/getAllPlayers")
	public List<Player> getAllPlayers() throws Exception{
		return iTeamService.getAllPlayers();
	}

	@GetMapping("/getPlayer/{teamId}/{playerId}")
	public Player getPlayer(@PathVariable int teamId,@PathVariable  int playerId) throws Exception{
		return iTeamService.getPlayer(teamId, playerId);
	}

	@GetMapping("/getTeam")
	public Team getTeam(@RequestBody Player player) throws Exception{
		return iTeamService.getTeam(player);
	}

}
