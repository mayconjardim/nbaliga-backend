package com.nbaligabackend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.PlayerDTO;
import com.nbaligabackend.services.PlayerService;

@RestController
@RequestMapping(value = "/players")
public class PlayerResource {

	@Autowired
	private PlayerService playerService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PlayerDTO> findById(@PathVariable long id) {
		PlayerDTO dto = playerService.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping
	public ResponseEntity<Page<PlayerDTO>> findAll(Pageable pageable) {
		Page<PlayerDTO> players = playerService.findAllPaged(pageable);		
		return ResponseEntity.ok().body(players);
	}
}