package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		
	
	@GetMapping
	public ResponseEntity<List<ScheduleDTO>> listAll() {
		List<ScheduleDTO> schedule = scheduleService.listAll();		
		return ResponseEntity.ok().body(schedule);
	}
	

	
	

}