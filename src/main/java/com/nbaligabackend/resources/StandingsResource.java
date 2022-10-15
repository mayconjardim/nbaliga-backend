package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.StandingsDTO;
import com.nbaligabackend.services.StandingsService;

@RestController
@RequestMapping(value = "/standings")
@CrossOrigin(origins = "*")
public class StandingsResource {
	
	@Autowired
	private StandingsService standingsService;
		
	
	@GetMapping(value = "/{conference}")
	public ResponseEntity<List<StandingsDTO>> findbyConference(@PathVariable String conference) {
		List<StandingsDTO> team = standingsService.findbyConference(conference);		
		return ResponseEntity.ok().body(team);
	}
	
	

}