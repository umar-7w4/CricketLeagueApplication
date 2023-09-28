package com.cg.cla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Match;
import com.cg.cla.entity.Owner;
import com.cg.cla.entity.Player;
import com.cg.cla.entity.Team;
import com.cg.cla.entity.Ticket;
import com.cg.cla.service.IAudienceService;
import com.cg.cla.service.IOwnerService;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cla-owner")
public class OwnerController {
	
	@Autowired
	IOwnerService iOwnerService;
	

	@GetMapping("/getOwner/{ownerId}")
	public Owner getOwner(@PathVariable int ownerId) throws Exception{
		return iOwnerService.getOwner(ownerId);
	}

	@GetMapping("/getAllOwners")
	public List<Owner> getAllOwners() throws Exception{
		return iOwnerService.getAllOwners();
	}

	@PostMapping("/insertOwner")
	public Owner insertOwner(@RequestBody Owner owner) throws Exception{
		return iOwnerService.insertOwner(owner);
	}

	@PutMapping("/updateOwner")
	public Owner updateOwner(@RequestBody Owner owner) throws Exception{
		return iOwnerService.updateOwner(owner);
	}

	@GetMapping("/getTeam/{id}")
	public Team getTeam(@PathVariable int id) throws Exception{
		return iOwnerService.getTeam(id);
	}

	@PutMapping("/paySalary/{salary}")
	public double paySalary(Player player,@PathVariable  double salary) throws Exception{
		return iOwnerService.paySalary(player, salary);
	}

	@GetMapping("/getBudget/{id}")
	public double getBudget(@PathVariable int id) throws Exception{
		return iOwnerService.getBudget(id);
	}


}
