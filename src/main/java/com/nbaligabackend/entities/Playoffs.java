package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playoffs")
public class Playoffs implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer seriesId;
	private Integer League;
	private Boolean complete;
	private String team1;
	private String team2;
	private Integer wins1;
	private Integer wins2;

	public Playoffs() {
	}

	public Playoffs(Integer seriesId, Integer league, Boolean complete, String team1, String team2, Integer wins1,
			Integer wins2) {
		super();
		this.seriesId = seriesId;
		League = league;
		this.complete = complete;
		this.team1 = team1;
		this.team2 = team2;
		this.wins1 = wins1;
		this.wins2 = wins2;
	}

	public Integer getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public Integer getLeague() {
		return League;
	}

	public void setLeague(Integer league) {
		League = league;
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

	@Override
	public int hashCode() {
		return Objects.hash(seriesId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Playoffs other = (Playoffs) obj;
		return Objects.equals(seriesId, other.seriesId);
	}

}
