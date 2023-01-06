package com.nbaligabackend.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.nbaligabackend.entities.DraftPicks;
import com.nbaligabackend.entities.Player;
import com.nbaligabackend.entities.Team;

public class TeamTradeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;

	private Set<PlayerTradeDTO> players = new HashSet<>();

	private Set<DraftPicksTradeDTO> picks = new HashSet<>();

	public TeamTradeDTO() {
	}

	public TeamTradeDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public TeamTradeDTO(Team entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public TeamTradeDTO(Team entity, Set<Player> players, Set<DraftPicks> picks) {
		this(entity);
		players.forEach(play -> this.players.add(new PlayerTradeDTO(play)));
		picks.forEach(pick -> this.picks.add(new DraftPicksTradeDTO(pick)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<PlayerTradeDTO> getPlayers() {
		return players;
	}

	public void setPlayers(Set<PlayerTradeDTO> players) {
		this.players = players;
	}

	public Set<DraftPicksTradeDTO> getPicks() {
		return picks;
	}

	public void setPicks(Set<DraftPicksTradeDTO> picks) {
		this.picks = picks;
	}

}
