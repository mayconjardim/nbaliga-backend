package com.nbaligabackend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.TransactionsDTO;
import com.nbaligabackend.entities.Transactions;
import com.nbaligabackend.repositories.TransactionsRepository;

@Service
public class TransactionsService {

	@Autowired
	private TransactionsRepository transactionsRepository;

	@Transactional(readOnly = true)
	public List<TransactionsDTO> listAll() {
		List<Transactions> transactionss = transactionsRepository.listAll();
		return transactionss.stream().map(x -> new TransactionsDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public List<TransactionsDTO> findByTeam(String team) {
		List<Transactions> transactionss = transactionsRepository.findByTeam(team);
		return transactionss.stream().map(x -> new TransactionsDTO(x)).collect(Collectors.toList());
	}

}