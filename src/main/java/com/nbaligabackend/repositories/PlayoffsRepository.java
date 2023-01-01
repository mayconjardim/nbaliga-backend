package com.nbaligabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nbaligabackend.entities.Playoffs;

@Repository
public interface PlayoffsRepository extends JpaRepository<Playoffs, Long> {

	

	
	

	
}
