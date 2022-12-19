package com.nbaligabackend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.ScheduleDTO;
import com.nbaligabackend.services.ScheduleService;

@RestController
@RequestMapping(value = "/schedule")
public class ScheduleResource {
	
	@Autowired
	private ScheduleService scheduleService;
		
	
	@GetMapping(value = "/results")
	public ResponseEntity<Page<ScheduleDTO>> listAll(Pageable pageable) {
		Page<ScheduleDTO> schedule = scheduleService.listAll(pageable);		
		return ResponseEntity.ok().body(schedule);
	}
	

	
	

}