package com.nbaligabackend.dto;

import java.io.Serializable;

import com.nbaligabackend.entities.Transactions;

public class TransactionsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer league;
	private Integer season;
	private Integer day;
	private String team;
	private String action;

	public TransactionsDTO() {
	}

	public TransactionsDTO(Long id, Integer league, Integer season, Integer day, String team, String action) {
		this.id = id;
		this.league = league;
		this.season = season;
		this.day = day;
		this.team = team;
		this.action = action;
	}

	public TransactionsDTO(Transactions entity) {
		id = entity.getId();
		league = entity.getSeason();
		season = entity.getSeason();
		day = entity.getDay();
		team = entity.getTeam();
		action = entity.getAction();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLeague() {
		return league;
	}

	public void setLeague(Integer league) {
		this.league = league;
	}

	public Integer getSeason() {
		return season;
	}

	public void setSeason(Integer season) {
		this.season = season;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
