package com.nbaligabackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Page<ScheduleDTO> listAll(Pageable pageable) {
		Page<Schedule> schedules = scheduleRepository.listAll(pageable);
		return schedules.map(x -> new ScheduleDTO(x));
	}
	
	

	
}