package com.cg.cla.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cla.entity.Organiser;
import com.cg.cla.entity.Owner;
import com.cg.cla.entity.Tournament;

@Repository
public interface OrganiserRepository extends JpaRepository<Organiser, Integer> {

}
