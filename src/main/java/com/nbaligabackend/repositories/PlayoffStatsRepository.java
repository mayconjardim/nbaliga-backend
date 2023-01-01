package com.nbaligabackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nbaligabackend.entities.PlayoffStats;
import com.nbaligabackend.entities.PlayoffStatsKey;

public interface PlayoffStatsRepository extends JpaRepository<PlayoffStats, PlayoffStatsKey> {

	@Query("SELECT obj FROM PlayoffStats obj WHERE obj.season = :season AND obj.minutes > 10 ORDER BY obj.id ASC")
	List<PlayoffStats> findAllStats(Integer season);
	
}
