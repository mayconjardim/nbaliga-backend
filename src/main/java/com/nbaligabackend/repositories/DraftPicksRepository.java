package com.nbaligabackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nbaligabackend.entities.DraftPicks;

public interface DraftPicksRepository extends JpaRepository<DraftPicks, Long> {
	
	@Query("SELECT distinct obj FROM DraftPicks obj WHERE obj.year > 0 ORDER by obj.ownedby")
	List<DraftPicks> findAll();
	
	
}
