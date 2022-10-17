package com.nbaligabackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.TeamDTO;
import com.nbaligabackend.entities.Team;
import com.nbaligabackend.repositories.TeamRepository;
import com.nbaligabackend.services.exceptions.ResourceNotFoundException;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	@Transactional(readOnly = true)
	public TeamDTO findById(Long id) throws Exception {
		Optional<Team> obj = teamRepository.findById(id);
		Team entity = obj.orElseThrow( () -> new ResourceNotFoundException("Time não encontrado"));
		return new TeamDTO(entity, entity.getPlayers());
	} 
	
	@Transactional(readOnly = true)
	public Page<TeamDTO> findAllPaged(Pageable pageable) {
		Page<Team> teams = teamRepository.findAll(pageable);
		return teams.map(x -> new TeamDTO(x));
	}
	
}
