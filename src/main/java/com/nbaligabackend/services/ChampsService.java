package com.nbaligabackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.ChampsDTO;
import com.nbaligabackend.entities.Champs;
import com.nbaligabackend.repositories.ChampsRepository;

@Service
public class ChampsService {

	@Autowired
	private ChampsRepository champsRepository;
	
	@Transactional(readOnly = true)
	public List<ChampsDTO> listAll() {
		List<Champs> champs = champsRepository.findAll();
		return champs.stream().map(x -> new ChampsDTO(x)).collect(Collectors.toList());
	}
	
	

	
}