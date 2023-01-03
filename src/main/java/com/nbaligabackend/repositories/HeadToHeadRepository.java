package com.nbaligabackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nbaligabackend.entities.HeadToHead;

public interface HeadToHeadRepository extends JpaRepository<HeadToHead, Integer> {

	@Query("SELECT distinct obj FROM HeadToHead obj WHERE obj.teamId = :teamId")
	List<HeadToHead> findByTeam(Integer teamId);

}
