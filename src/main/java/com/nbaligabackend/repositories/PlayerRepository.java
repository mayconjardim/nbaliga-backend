package com.nbaligabackend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nbaligabackend.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

	@Query("SELECT distinct obj FROM Player obj WHERE obj.currentteamid = -2 ORDER BY obj.overallpotential DESC")
	List<Player> listDraftClass();

}
