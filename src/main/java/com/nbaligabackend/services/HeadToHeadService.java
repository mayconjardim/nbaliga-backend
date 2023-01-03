package com.nbaligabackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.HeadToHeadDTO;
import com.nbaligabackend.entities.HeadToHead;
import com.nbaligabackend.repositories.HeadToHeadRepository;

@Service
public class HeadToHeadService {

	@Autowired
	private HeadToHeadRepository headToHeadRepository;
	
	@Transactional(readOnly = true)
	public List<HeadToHeadDTO> findByTeam(Integer teamid) {
		List<HeadToHead> hth = headToHeadRepository.findByTeam(teamid);
		return hth.stream().map(x -> new HeadToHeadDTO(x)).collect(Collectors.toList());
	}

	

	
}