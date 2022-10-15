package com.nbaligabackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nbaligabackend.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

	@Query("SELECT distinct obj FROM Team obj WHERE "
			+ "obj.conference = :conference ORDER BY obj.win_")
	List<Team> findByConference(String conference);
	
}
