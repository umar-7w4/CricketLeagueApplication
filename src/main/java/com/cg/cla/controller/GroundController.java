package com.cg.cla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Ground;
import com.cg.cla.entity.Match;
import com.cg.cla.entity.Ticket;
import com.cg.cla.service.IAudienceService;
import com.cg.cla.service.IGroundService;

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
@RequestMapping("/cla-ground")
public class GroundController {
	
	@Autowired
	IGroundService iGroundService;
	

	@GetMapping("/getAllmatchesGround/{groungId}")
	public List<Match> getAllmatchesGround(@PathVariable int groungId) throws Exception{
		return iGroundService.getAllMatches();
	}

	@GetMapping("/getmatche/{groungId}/{matchId}")
	public Match getmatche(@PathVariable int groungId,@PathVariable  int matchId) throws Exception{
		return iGroundService.getmatche(groungId, matchId);
	}

	@PostMapping("/insertGround")
	public Ground insertGround(@RequestBody Ground ground) throws Exception{
		return iGroundService.insertGround(ground);
	}

	@PutMapping("/updateGround")
	public Ground updateGround(@RequestBody Ground ground) throws Exception{
		return iGroundService.updateGround(ground);
	}

	@DeleteMapping("/deleteGround/{groungId}")
	public Ground deleteGround(@PathVariable int groungId) throws Exception{
		return iGroundService.deleteGround(groungId);
	}

	@GetMapping("/getAllMatches")
	public List<Match> getAllMatches() throws Exception{
		return iGroundService.getAllMatches();
	}

	@GetMapping("/getMatch/{matchId}")
	public Match getMatch(@PathVariable int matchId) throws Exception{
		return iGroundService.getMatch(matchId);
	}

}
