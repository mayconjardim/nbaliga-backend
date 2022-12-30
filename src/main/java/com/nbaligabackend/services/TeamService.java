package com.nbaligabackend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
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
		Team entity = obj.orElseThrow(() -> new ResourceNotFoundException("Time não encontrado"));
		return new TeamDTO(entity, entity.getPlayers(), entity.getPicks());
	}

	@Transactional(readOnly = true)
	public List<TeamDTO> listAll() {
		List<Team> teams = teamRepository.listAll();
		return teams.stream().map(x -> new TeamDTO(x)).collect(Collectors.toList());
	}
	
	

}
