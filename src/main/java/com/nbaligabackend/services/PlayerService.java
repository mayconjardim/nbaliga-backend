package com.nbaligabackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.PlayerDTO;
import com.nbaligabackend.entities.Player;
import com.nbaligabackend.repositories.PlayerRepository;
import com.nbaligabackend.services.exceptions.ResourceNotFoundException;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository teamRepository;
	
	@Transactional(readOnly = true)
	public PlayerDTO findById(Long id) {
		Optional<Player> obj = teamRepository.findById(id);
		Player entity = obj.orElseThrow( () -> new ResourceNotFoundException("Jogador não encontrado!") );
		return new PlayerDTO(entity, entity.getSeasonStats(), entity.getPlayoffStats());
	} 
	
	@Transactional(readOnly = true)
	public Page<PlayerDTO> findAllPaged(Pageable pageable) {
		Page<Player> teams = teamRepository.findAll(pageable);
		return teams.map(x -> new PlayerDTO(x));
	}
	
}