package com.nbaligabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nbaligabackend.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
