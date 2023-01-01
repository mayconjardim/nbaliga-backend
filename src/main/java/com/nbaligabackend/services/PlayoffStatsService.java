package com.nbaligabackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.PlayoffStatsDTO;
import com.nbaligabackend.entities.PlayoffStats;
import com.nbaligabackend.repositories.PlayoffStatsRepository;

@Service
public class PlayoffStatsService {

	@Autowired
	private PlayoffStatsRepository playoffStatsRepository;

	@Transactional(readOnly = true)
	public List<PlayoffStatsDTO> findAll(Integer season) {
		List<PlayoffStats> stats = playoffStatsRepository.findAllStats(season);
		return stats.stream().map(x -> new PlayoffStatsDTO(x)).collect(Collectors.toList());
	}

}