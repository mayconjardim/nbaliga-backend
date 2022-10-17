package com.nbaligabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nbaligabackend.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {


}
