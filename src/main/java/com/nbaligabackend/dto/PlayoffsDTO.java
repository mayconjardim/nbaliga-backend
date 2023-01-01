package com.nbaligabackend.dto;

import java.io.Serializable;

import com.nbaligabackend.entities.Playoffs;

public class PlayoffsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long seriesId;
	private Integer league;
	private Boolean complete;
	private String team1;
	private String team2;
	private Integer wins1;
	private Integer wins2;

	public PlayoffsDTO() {
	}

	public PlayoffsDTO(Long seriesId, Integer league, Boolean complete, String team1, String team2, Integer wins1,
			Integer wins2) {
		super();
		this.seriesId = seriesId;
		this.league = league;
		this.complete = complete;
		this.team1 = team1;
		this.team2 = team2;
		this.wins1 = wins1;
		this.wins2 = wins2;
	}

	public PlayoffsDTO(Playoffs entity) {
		this.seriesId = entity.getSeriesId();
		this.league = entity.getLeague();
		this.complete = entity.getComplete();
		this.team1 = entity.getTeam1();
		this.team2 = entity.getTeam2();
		this.wins1 = entity.getWins1();
		this.wins2 = entity.getWins2();
	}

	public Long getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Long seriesId) {
		this.seriesId = seriesId;
	}

	public Integer getLeague() {
		return league;
	}

	public void setLeague(Integer league) {
		this.league = league;
	}

	public Boolean getComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public Integer getWins1() {
		return wins1;
	}

	public void setWins1(Integer wins1) {
		this.wins1 = wins1;
	}

	public Integer getWins2() {
		return wins2;
	}

	public void setWins2(Integer wins2) {
		this.wins2 = wins2;
	}

}
