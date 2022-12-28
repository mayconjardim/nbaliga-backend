package com.nbaligabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nbaligabackend.entities.DraftPicks;

public interface DraftPicksRepository extends JpaRepository<DraftPicks, Long> {

}
