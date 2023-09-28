package com.cg.cla.service;

import java.util.List;

import com.cg.cla.entity.Player;
import com.cg.cla.entity.Team;

public interface ITeamService {

	public Team getTeam(int teamId) throws Exception;

	public List<Team> getAllTeams() throws Exception;

	public Team insertTeam(Team team) throws Exception;

	public Team updateTeam(Team team) throws Exception;

	public Team deleteTeam(int teamId) throws Exception;

	public List<Player> getAllPlayers() throws Exception;

	public Player getPlayer(int teamId, int playerId) throws Exception;

	public Team getTeam(Player player) throws Exception;

}
