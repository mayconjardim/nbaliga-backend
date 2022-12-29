package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.SeasonInfoDTO;
import com.nbaligabackend.services.SeasonInfoService;

@RestController
@RequestMapping(value = "/seasoninfo")
public class SeasonInfoResource {
	
	@Autowired
	private SeasonInfoService seasonStatsService;
		
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<SeasonInfoDTO> findById(@PathVariable Integer id) throws Exception {
		SeasonInfoDTO dto = seasonStatsService.findById(id);
		return ResponseEntity.ok().body(dto);
	}

	@GetMapping
	public ResponseEntity<List<SeasonInfoDTO>> findAll() {
		List<SeasonInfoDTO> info = seasonStatsService.findAll();
		return ResponseEntity.ok().body(info);
	}

	
	

}