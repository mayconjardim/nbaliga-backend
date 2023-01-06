package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.TeamDTO;
import com.nbaligabackend.dto.TeamTradeDTO;
import com.nbaligabackend.services.TeamService;

@RestController
@RequestMapping(value = "/teams")
public class TeamResource {

	@Autowired
	private TeamService teamService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<TeamDTO> findById(@PathVariable long id) throws Exception {
		TeamDTO dto = teamService.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping(value = "/basic/{id}")
	public ResponseEntity<TeamTradeDTO> findByBasicId(@PathVariable long id) throws Exception {
		TeamTradeDTO dto = teamService.findByBasicId(id);
		return ResponseEntity.ok().body(dto);
	}

	@GetMapping
	public ResponseEntity<List<TeamDTO>> listAll() {
		List<TeamDTO> team = teamService.listAll();
		return ResponseEntity.ok().body(team);
	}

}
