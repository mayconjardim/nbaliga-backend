package com.nbaligabackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nbaligabackend.entities.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, String> {

	
	@Query("SELECT obj FROM Schedule obj ORDER BY obj.day ASC")
	List<Schedule> findAllSchedule();
	
	@Query("SELECT DISTINCT obj FROM Schedule obj WHERE obj.home = :team OR obj.away = :team"
			+ "  ORDER BY obj.day ASC")
	List<Schedule> findSchedulesByTeam(String team);
	
}
