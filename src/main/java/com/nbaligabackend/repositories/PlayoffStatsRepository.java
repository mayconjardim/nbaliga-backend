package com.nbaligabackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nbaligabackend.entities.PlayoffStats;

public interface PlayoffStatsRepository extends JpaRepository<PlayoffStats, Long> {

	@Query("SELECT obj FROM PlayoffStats obj WHERE obj.season = :season AND obj.mpg > 5 ORDER BY obj.id ASC")
	List<PlayoffStats> findAllStats(Integer season);
	
}
