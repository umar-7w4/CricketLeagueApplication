package com.cg.cla.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cla.entity.Player;

import com.cg.cla.entity.Team;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
