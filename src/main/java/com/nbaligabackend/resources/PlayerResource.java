package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.PlayerBasicDTO;
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
	
	@GetMapping(value = "/basic/{id}")
	public ResponseEntity<PlayerBasicDTO> findByIdBasic(@PathVariable long id) {
		PlayerBasicDTO dto = playerService.findByIdBasic(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping(value = "/basic")
	public ResponseEntity<List<PlayerBasicDTO>> findAllBasic() {
		List<PlayerBasicDTO> players = playerService.findAllBasic();		
		return ResponseEntity.ok().body(players);
	}
	
	@GetMapping(value = "/draftclass")
	public ResponseEntity<List<PlayerDTO>> listDraftClass() {
		List<PlayerDTO> players = playerService.listDraftClass();		
		return ResponseEntity.ok().body(players);
	}
	
	@GetMapping
	public ResponseEntity<Page<PlayerDTO>> findAll(Pageable pageable) {
		Page<PlayerDTO> players = playerService.findAllPaged(pageable);		
		return ResponseEntity.ok().body(players);
	}
}