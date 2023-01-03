package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.HeadToHeadDTO;
import com.nbaligabackend.services.HeadToHeadService;

@RestController
@RequestMapping(value = "/headtohead")
public class HeadToHeadResource {

	@Autowired
	private HeadToHeadService headtoheadService;

	@GetMapping(value = "/{teamid}")
	public ResponseEntity<List<HeadToHeadDTO>> findByTeam(@PathVariable Integer teamid) {
		List<HeadToHeadDTO> team = headtoheadService.findByTeam(teamid);
		return ResponseEntity.ok().body(team);
	}

}