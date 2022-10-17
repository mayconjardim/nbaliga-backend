package com.nbaligabackend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.TeamDTO;
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

	@GetMapping
	public ResponseEntity<Page<TeamDTO>> findAll(Pageable pageable) {
		Page<TeamDTO> team = teamService.findAllPaged(pageable);
		return ResponseEntity.ok().body(team);
	}

}
