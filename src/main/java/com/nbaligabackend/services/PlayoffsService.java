package com.nbaligabackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.PlayoffsDTO;
import com.nbaligabackend.entities.Playoffs;
import com.nbaligabackend.repositories.PlayoffsRepository;

@Service
public class PlayoffsService {

	@Autowired
	private PlayoffsRepository seasonStatsRepository;

	@Transactional(readOnly = true)
	public List<PlayoffsDTO> findAll() {
		List<Playoffs> offs = seasonStatsRepository.findAll();
		return offs.stream().map(x -> new PlayoffsDTO(x)).collect(Collectors.toList());
	}

}