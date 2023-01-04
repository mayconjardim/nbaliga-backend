package com.nbaligabackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nbaligabackend.entities.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Long> {

	
	@Query("SELECT distinct obj FROM Transactions obj WHERE "
			+ "obj.league = 1 ORDER BY obj.id DESC")
	List<Transactions> listAll();
	
	List<Transactions> findByTeam(String team);
}
