package com.nbaligabackend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nbaligabackend.dto.TransactionsDTO;
import com.nbaligabackend.services.TransactionsService;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionsResource {
	
	@Autowired
	private TransactionsService transactionsService;
		
	
	@GetMapping
	public ResponseEntity<List<TransactionsDTO>> listAll( ) {
		List<TransactionsDTO> transactions = transactionsService.listAll();		
		return ResponseEntity.ok().body(transactions);
	}
		
	@GetMapping(value = "/{team}")
	public ResponseEntity<List<TransactionsDTO>> findByTeam(@PathVariable String team) {
		List<TransactionsDTO> transactions = transactionsService.findByTeam(team);		
		return ResponseEntity.ok().body(transactions);
	}
	
	

}