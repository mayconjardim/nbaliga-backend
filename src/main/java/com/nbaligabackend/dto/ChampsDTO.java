package com.nbaligabackend.dto;

import java.io.Serializable;

import com.nbaligabackend.entities.Champs;

public class ChampsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long season;
	private Integer league;
	private String champ;
	private String loser;
	private Integer champWins;
	private Integer loserWins;

	public ChampsDTO() {
	}

	public ChampsDTO(Long season, Integer league, String champ, String loser, Integer champWins, Integer loserWins) {
		super();
		this.season = season;
		this.league = league;
		this.champ = champ;
		this.loser = loser;
		this.champWins = champWins;
		this.loserWins = loserWins;
	}

	public ChampsDTO(Champs entity) {
		this.season = entity.getSeason();
		this.league = entity.getLeague();
		this.champ = entity.getChamp();
		this.loser = entity.getLoser();
		this.champWins = entity.getChampWins();
		this.loserWins = entity.getLoserWins();
	}

	public Long getSeason() {
		return season;
	}

	public void setSeason(Long season) {
		this.season = season;
	}

	public Integer getLeague() {
		return league;
	}

	public void setLeague(Integer league) {
		this.league = league;
	}

	public String getChamp() {
		return champ;
	}

	public void setChamp(String champ) {
		this.champ = champ;
	}

	public String getLoser() {
		return loser;
	}

	public void setLoser(String loser) {
		this.loser = loser;
	}

	public Integer getChampWins() {
		return champWins;
	}

	public void setChampWins(Integer champWins) {
		this.champWins = champWins;
	}

	public Integer getLoserWins() {
		return loserWins;
	}

	public void setLoserWins(Integer loserWins) {
		this.loserWins = loserWins;
	}

}
