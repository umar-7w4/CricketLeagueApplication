package com.cg.cla.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cla.entity.Ground;
import com.cg.cla.entity.Match;

@Repository
public interface GroundRepository extends JpaRepository<Ground, Integer> {

}
