package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.PlayoffsDTO;
import com.nbaligabackend.services.PlayoffsService;

@RestController
@RequestMapping(value = "/playoffs")
public class PlayoffsResource {

	@Autowired
	private PlayoffsService seasonStatsService;

	@GetMapping
	public ResponseEntity<List<PlayoffsDTO>> findAll() {
		List<PlayoffsDTO> offs = seasonStatsService.findAll();
		return ResponseEntity.ok().body(offs);
	}

}