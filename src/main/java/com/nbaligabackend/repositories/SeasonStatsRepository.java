package com.nbaligabackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nbaligabackend.entities.SeasonStats;

public interface SeasonStatsRepository extends JpaRepository<SeasonStats, Long> {

	@Query("SELECT obj FROM SeasonStats obj  WHERE obj.season = :season ORDER BY obj.id ASC")
	List<SeasonStats> findAllStats(Integer season);

}
