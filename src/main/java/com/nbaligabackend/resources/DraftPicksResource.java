package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.DraftPicksDTO;
import com.nbaligabackend.services.DraftPicksService;

@RestController
@RequestMapping(value = "/picks")
public class DraftPicksResource {

	@Autowired
	private DraftPicksService draftPicksService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<DraftPicksDTO> findById(@PathVariable long id) {
		DraftPicksDTO dto = draftPicksService.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping
	public ResponseEntity<List<DraftPicksDTO>> findAll() {
		List<DraftPicksDTO> picks = draftPicksService.findAll();		
		return ResponseEntity.ok().body(picks);
	}
}