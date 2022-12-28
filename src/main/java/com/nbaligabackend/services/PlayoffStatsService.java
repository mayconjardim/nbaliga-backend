package com.nbaligabackend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.PlayoffStatsDTO;
import com.nbaligabackend.entities.PlayoffStats;
import com.nbaligabackend.repositories.PlayoffStatsRepository;
import com.nbaligabackend.services.exceptions.ResourceNotFoundException;

@Service
public class PlayoffStatsService {

	@Autowired
	private PlayoffStatsRepository playoffStatsRepository;

	@Transactional(readOnly = true)
	public PlayoffStatsDTO findById(Long id) throws Exception {
		Optional<PlayoffStats> obj = playoffStatsRepository.findById(id);
		PlayoffStats entity = obj.orElseThrow(() -> new ResourceNotFoundException("Stats não encontrada"));
		return new PlayoffStatsDTO(entity);
	}

	@Transactional(readOnly = true)
	public List<PlayoffStatsDTO> findAll() {
		List<PlayoffStats> stats = playoffStatsRepository.findAll();
		return stats.stream().map(x -> new PlayoffStatsDTO(x)).collect(Collectors.toList());
	}

}