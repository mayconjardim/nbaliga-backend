package com.nbaliga.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaliga.dto.StandingsDTO;
import com.nbaliga.services.StandingsService;

@RestController
@RequestMapping(value = "/standings")
public class StandingsResource {
	
	@Autowired
	private StandingsService standingsService;
		
	
	@GetMapping(value = "/{conference}")
	public ResponseEntity<List<StandingsDTO>> findbyConference(@PathVariable String conference) {
		List<StandingsDTO> team = standingsService.findbyConference(conference);		
		return ResponseEntity.ok().body(team);
	}
	
	

}
