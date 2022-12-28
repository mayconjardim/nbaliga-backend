package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.PlayoffStatsDTO;
import com.nbaligabackend.services.PlayoffStatsService;

@RestController
@RequestMapping(value = "/offstats")
public class PlayoffStatsResource {
	
	@Autowired
	private PlayoffStatsService playoffStatsService;
		
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PlayoffStatsDTO> findById(@PathVariable long id) throws Exception {
		PlayoffStatsDTO dto = playoffStatsService.findById(id);
		return ResponseEntity.ok().body(dto);
	}

	@GetMapping
	public ResponseEntity<List<PlayoffStatsDTO>> findAll() {
		List<PlayoffStatsDTO> stats = playoffStatsService.findAll();
		return ResponseEntity.ok().body(stats);
	}

	
	

}