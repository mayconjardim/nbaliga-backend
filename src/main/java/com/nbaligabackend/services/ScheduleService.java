package com.nbaligabackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.ScheduleDTO;
import com.nbaligabackend.entities.Schedule;
import com.nbaligabackend.repositories.ScheduleRepository;

@Service
public class ScheduleService {

	@Autowired
	private ScheduleRepository scheduleRepository;

	@Transactional(readOnly = true)
	public List<ScheduleDTO> findAll() {
	    List<Schedule> schedules = scheduleRepository.findAllSchedule();
	    return schedules.stream().map(x -> new ScheduleDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public List<ScheduleDTO> findSchedulesByTeam(String team) {
		List<Schedule> schedules = scheduleRepository.findSchedulesByTeam(team);
		return schedules.stream().map(x -> new ScheduleDTO(x)).collect(Collectors.toList());
	}

}