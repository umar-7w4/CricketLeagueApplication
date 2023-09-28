package com.cg.cla.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cla.entity.Organiser;
import com.cg.cla.entity.Owner;
import com.cg.cla.entity.Player;
import com.cg.cla.entity.Team;
import com.cg.cla.repository.OrganiserRepository;
import com.cg.cla.repository.OwnerRepository;
import com.cg.cla.repository.PlayerRepository;

@Service("IOwnerService")
public class IOwnerServiceImpl implements IOwnerService{
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Autowired
	OwnerRepository ownerRepository;
	
	@Autowired
	OrganiserRepository organiserRepository;

	@Override
	public Owner getOwner(int ownerId) throws Exception {
		Owner bean = null;
		try {
			bean = ownerRepository.findById(ownerId).get();
		}
		catch(Exception e) {
			throw new Exception("Owner details not found!");
		}
		return bean;
	}

	@Override
	public List<Owner> getAllOwners() throws Exception {
		return 	ownerRepository.findAll();
	}

	@Override
	public Owner insertOwner(Owner owner) throws Exception {
		ownerRepository.saveAndFlush(owner);
		return owner;
	}

	@Override
	public Owner updateOwner(Owner owner) throws Exception {
		Owner bean = null;
		try {
			bean = ownerRepository.findById(owner.getOwnerId()).get();
		}
		catch(Exception e) {
			throw new Exception("Owner details not found!");
		}
		ownerRepository.saveAndFlush(owner);
		return bean;
	}

	@Override
	public Team getTeam(int id) throws Exception {
		Owner bean = null;
		try {
			bean = ownerRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new Exception("Owner details not found!");
		}
		return bean.getTeam();
	}

	@Override
	public double paySalary(Player player, double salary) throws Exception {
		double ans = 0;
		Player bean = null;
		try {
			bean = playerRepository.findById(player.getPlayerId()).get();
		}
		catch(Exception e) {
			throw new Exception("Player details not found!");
		}
		bean.setSalary(bean.getSalary()+salary);
		ans+=bean.getSalary()+salary;
		return ans;
	}

	@Override
	public double getBudget(int id) throws Exception {
		Organiser bean = null;
		try {
			bean = organiserRepository.findById(id).get();
		}
		catch(Exception e) {
			throw new Exception("Budget details not found!");
		}
		return bean.getBudget();
	}

}
