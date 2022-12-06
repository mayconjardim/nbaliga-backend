package com.nbaligabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nbaligabackend.entities.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, String> {

	

}
