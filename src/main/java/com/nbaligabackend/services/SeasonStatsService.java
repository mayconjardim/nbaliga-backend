package com.nbaligabackend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.SeasonStatsDTO;
import com.nbaligabackend.entities.SeasonStats;
import com.nbaligabackend.repositories.SeasonStatsRepository;
import com.nbaligabackend.services.exceptions.ResourceNotFoundException;

@Service
public class SeasonStatsService {

	@Autowired
	private SeasonStatsRepository seasonStatsRepository;

	@Transactional(readOnly = true)
	public SeasonStatsDTO findById(Long id) throws Exception {
		Optional<SeasonStats> obj = seasonStatsRepository.findById(id);
		SeasonStats entity = obj.orElseThrow(() -> new ResourceNotFoundException("Stats não encontrada"));
		return new SeasonStatsDTO(entity);
	}

	@Transactional(readOnly = true)
	public List<SeasonStatsDTO> findAll() {
		List<SeasonStats> stats = seasonStatsRepository.findAll();
		return stats.stream().map(x -> new SeasonStatsDTO(x)).collect(Collectors.toList());
	}

}