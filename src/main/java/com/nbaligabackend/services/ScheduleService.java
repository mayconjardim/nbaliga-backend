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
	public List<ScheduleDTO> listAll() {
		List<Schedule> schedules = scheduleRepository.findAll();
		return schedules.stream().map(x -> new ScheduleDTO(x)).collect(Collectors.toList());
	}
	
	

	
}