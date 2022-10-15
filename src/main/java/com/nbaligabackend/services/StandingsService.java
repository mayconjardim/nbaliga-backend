package com.nbaligabackend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.StandingsDTO;
import com.nbaligabackend.entities.Team;
import com.nbaligabackend.repositories.TeamRepository;

@Service
public class StandingsService {

	@Autowired
	private TeamRepository teamRepository;
	
	@Transactional(readOnly = true)
	public StandingsDTO findById(Long id) throws Exception {
		Optional<Team> obj = teamRepository.findById(id);
		Team entity = obj.orElseThrow( () -> new Exception("Time não encontrado"));;
		return new StandingsDTO(entity);
	} 
	
	@Transactional(readOnly = true)
	public List<StandingsDTO> findbyConference(String conference) {
		List<Team> teams = teamRepository.findByConference(conference);
		return teams.stream().map(x -> new StandingsDTO(x)).collect(Collectors.toList());
	}
	
	
}