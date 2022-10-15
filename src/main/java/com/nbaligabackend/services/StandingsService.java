package com.nbaligabackend.services;

import java.util.List;
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
	public List<StandingsDTO> listAll() {
		List<Team> teams = teamRepository.listAll();
		return teams.stream().map(x -> new StandingsDTO(x)).collect(Collectors.toList());
	}
	
	
	@Transactional(readOnly = true)
	public List<StandingsDTO> findbyConference(String conference) {
		List<Team> teams = teamRepository.findByConference(conference);
		return teams.stream().map(x -> new StandingsDTO(x)).collect(Collectors.toList());
	}
	
	
}