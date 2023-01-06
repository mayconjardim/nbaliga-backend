package com.nbaligabackend.dto;

import java.io.Serializable;

import com.nbaligabackend.entities.DraftPicks;

public class DraftPicksTradeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String team;
	private Integer year;
	private Integer round;
	private String ownedby;

	public DraftPicksTradeDTO() {
	}

	public DraftPicksTradeDTO(Long id, String team, Integer year, Integer round, String ownedby) {
		super();
		this.id = id;
		this.team = team;
		this.year = year;
		this.round = round;
		this.ownedby = ownedby;

	}

	public DraftPicksTradeDTO(DraftPicks entity) {
		id = entity.getId();
		team = entity.getTeam();
		year = entity.getYear();
		round = entity.getRound();
		ownedby = entity.getOwnedby();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getRound() {
		return round;
	}

	public void setRound(Integer round) {
		this.round = round;
	}

	public String getOwnedby() {
		return ownedby;
	}

	public void setOwnedby(String ownedby) {
		this.ownedby = ownedby;
	}



	
}