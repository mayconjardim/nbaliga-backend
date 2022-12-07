package com.nbaligabackend.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nbaligabackend.entities.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, String> {

	
	@Query("SELECT distinct obj FROM Schedule obj WHERE "
			+ "obj.homeScore > 0 ORDER BY obj.day DESC" )
	Page<Schedule> listAll(Pageable pageable);

}
