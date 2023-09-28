package com.cg.cla.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Match;
import com.cg.cla.entity.Schedule;
import com.cg.cla.entity.Team;
import com.cg.cla.entity.Tournament;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {


}
