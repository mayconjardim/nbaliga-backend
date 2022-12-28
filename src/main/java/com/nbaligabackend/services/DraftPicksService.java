package com.nbaligabackend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.DraftPicksDTO;
import com.nbaligabackend.entities.DraftPicks;
import com.nbaligabackend.repositories.DraftPicksRepository;
import com.nbaligabackend.services.exceptions.ResourceNotFoundException;

@Service
public class DraftPicksService {

	@Autowired
	private DraftPicksRepository draftPicksRepository;
	
	@Transactional(readOnly = true)
	public DraftPicksDTO findById(Long id) {
		Optional<DraftPicks> obj = draftPicksRepository.findById(id);
		DraftPicks entity = obj.orElseThrow( () -> new ResourceNotFoundException("Time não encontrado!") );
		return new DraftPicksDTO(entity);
	} 
	
	@Transactional(readOnly = true)
	public List<DraftPicksDTO> findAll( ) {
		List<DraftPicks> teams = draftPicksRepository.findAll();
		return teams.stream().map(x -> new DraftPicksDTO(x)).collect(Collectors.toList());
	}
	
}