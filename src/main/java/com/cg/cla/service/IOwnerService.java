package com.cg.cla.service;

import java.util.List;

import com.cg.cla.entity.Owner;
import com.cg.cla.entity.Player;
import com.cg.cla.entity.Team;

public interface IOwnerService {

	public Owner getOwner(int ownerId) throws Exception;

	public List<Owner> getAllOwners() throws Exception;

	public Owner insertOwner(Owner owner) throws Exception;

	public Owner updateOwner(Owner owner) throws Exception;

	public Team getTeam(int id) throws Exception;

	public double paySalary(Player player, double salary) throws Exception;

	public double getBudget(int id) throws Exception;

}
