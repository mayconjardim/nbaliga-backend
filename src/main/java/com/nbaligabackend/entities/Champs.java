package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "champs")
public class Champs implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long season;
	private Integer league;
	private String champ;
	private String loser;
	private Integer champWins;
	private Integer loserWins;

	public Champs() {
	}

	public Champs(Long season, Integer league, String champ, String loser, Integer champWins, Integer loserWins) {
		super();
		this.season = season;
		this.league = league;
		this.champ = champ;
		this.loser = loser;
		this.champWins = champWins;
		this.loserWins = loserWins;
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

	@Override
	public int hashCode() {
		return Objects.hash(season);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Champs other = (Champs) obj;
		return Objects.equals(season, other.season);
	}

}
