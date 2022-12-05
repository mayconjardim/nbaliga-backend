package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.ChampsDTO;
import com.nbaligabackend.services.ChampsService;

@RestController
@RequestMapping(value = "/champs")
public class ChampsResource {
	
	@Autowired
	private ChampsService champsService;
		
	
	@GetMapping
	public ResponseEntity<List<ChampsDTO>> listAll() {
		List<ChampsDTO> team = champsService.listAll();		
		return ResponseEntity.ok().body(team);
	}
	

	
	

}