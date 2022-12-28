package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.SeasonStatsDTO;
import com.nbaligabackend.services.SeasonStatsService;

@RestController
@RequestMapping(value = "/stats")
public class SeasonStatsResource {
	
	@Autowired
	private SeasonStatsService seasonStatsService;
		
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<SeasonStatsDTO> findById(@PathVariable long id) throws Exception {
		SeasonStatsDTO dto = seasonStatsService.findById(id);
		return ResponseEntity.ok().body(dto);
	}

	@GetMapping
	public ResponseEntity<List<SeasonStatsDTO>> findAll() {
		List<SeasonStatsDTO> stats = seasonStatsService.findAll();
		return ResponseEntity.ok().body(stats);
	}

	
	

}