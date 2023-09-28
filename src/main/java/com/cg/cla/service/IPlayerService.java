package com.cg.cla.service;

import java.util.List;

import com.cg.cla.entity.Player;

import com.cg.cla.entity.Team;

public interface IPlayerService {

	public Player getPlayer(int playerId) throws Exception;

	public List<Player> getAllPlayers() throws Exception;

	public Player insertPlayer(Player player) throws Exception;

	public Player updatePlayer(Player player) throws Exception;

	public Player deletePlayer(int playerId) throws Exception;

	public double getSalary(int id) throws Exception;
}
