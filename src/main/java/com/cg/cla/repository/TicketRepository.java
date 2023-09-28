package com.cg.cla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cla.entity.Audience;
import com.cg.cla.entity.Match;
import com.cg.cla.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {


}
