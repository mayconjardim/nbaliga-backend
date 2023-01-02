package com.nbaligabackend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.PlayerBasicDTO;
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
		Player entity = obj.orElseThrow(() -> new ResourceNotFoundException("Jogador não encontrado!"));
		return new PlayerDTO(entity, entity.getSeasonStats(), entity.getPlayoffStats());
	}

	@Transactional(readOnly = true)
	public PlayerBasicDTO findByIdBasic(Long id) {
		Optional<Player> obj = teamRepository.findById(id);
		Player entity = obj.orElseThrow(() -> new ResourceNotFoundException("Jogador não encontrado!"));
		return new PlayerBasicDTO(entity, entity.getSeasonStats());
	}

	@Transactional(readOnly = true)
	public List<PlayerBasicDTO> findAllBasic() {
		List<Player> players = teamRepository.findAll();
		return players.stream().map(x -> new PlayerBasicDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public List<PlayerDTO> listDraftClass() {
		List<Player> players = teamRepository.listDraftClass();
		return players.stream().map(x -> new PlayerDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public Page<PlayerDTO> findAllPaged(Pageable pageable) {
		Page<Player> players = teamRepository.findAll(pageable);
		return players.map(x -> new PlayerDTO(x));
	}

}