package com.nbaligabackend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.SeasonInfoDTO;
import com.nbaligabackend.entities.SeasonInfo;
import com.nbaligabackend.repositories.SeasonInfoRepository;
import com.nbaligabackend.services.exceptions.ResourceNotFoundException;

@Service
public class SeasonInfoService {

	@Autowired
	private SeasonInfoRepository seasonStatsRepository;

	@Transactional(readOnly = true)
	public SeasonInfoDTO findById(Integer id) throws Exception {
		Optional<SeasonInfo> obj = seasonStatsRepository.findById(id);
		SeasonInfo entity = obj.orElseThrow(() -> new ResourceNotFoundException("Season não encontrada"));
		return new SeasonInfoDTO(entity);
	}

	@Transactional(readOnly = true)
	public List<SeasonInfoDTO> findAll() {
		List<SeasonInfo> stats = seasonStatsRepository.findAll();
		return stats.stream().map(x -> new SeasonInfoDTO(x)).collect(Collectors.toList());
	}

}