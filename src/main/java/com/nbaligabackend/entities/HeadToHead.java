package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recordbyopponent")
public class HeadToHead implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer teamId;
	private Integer oppId;
	private Integer totalWins;
	private Integer totalLosses;
	private Integer points;
	private Integer seasonWins;
	private Integer seasonLosses;
	private Integer playoffWins;
	private Integer playoffLosses;
	private Integer playoffSeriesWins;
	private Integer playoffSeriesLosses;

	public HeadToHead() {
	}

	public HeadToHead(Integer teamId, Integer oppId, Integer totalWins, Integer totalLosses, Integer points,
			Integer seasonWins, Integer seasonLosses, Integer playoffWins, Integer playoffLosses,
			Integer playoffSeriesWins, Integer playoffSeriesLosses) {
		super();
		this.teamId = teamId;
		this.oppId = oppId;
		this.totalWins = totalWins;
		this.totalLosses = totalLosses;
		this.points = points;
		this.seasonWins = seasonWins;
		this.seasonLosses = seasonLosses;
		this.playoffWins = playoffWins;
		this.playoffLosses = playoffLosses;
		this.playoffSeriesWins = playoffSeriesWins;
		this.playoffSeriesLosses = playoffSeriesLosses;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public Integer getOppId() {
		return oppId;
	}

	public void setOppId(Integer oppId) {
		this.oppId = oppId;
	}

	public Integer getTotalWins() {
		return totalWins;
	}

	public void setTotalWins(Integer totalWins) {
		this.totalWins = totalWins;
	}

	public Integer getTotalLosses() {
		return totalLosses;
	}

	public void setTotalLosses(Integer totalLosses) {
		this.totalLosses = totalLosses;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getSeasonWins() {
		return seasonWins;
	}

	public void setSeasonWins(Integer seasonWins) {
		this.seasonWins = seasonWins;
	}

	public Integer getSeasonLosses() {
		return seasonLosses;
	}

	public void setSeasonLosses(Integer seasonLosses) {
		this.seasonLosses = seasonLosses;
	}

	public Integer getPlayoffWins() {
		return playoffWins;
	}

	public void setPlayoffWins(Integer playoffWins) {
		this.playoffWins = playoffWins;
	}

	public Integer getPlayoffLosses() {
		return playoffLosses;
	}

	public void setPlayoffLosses(Integer playoffLosses) {
		this.playoffLosses = playoffLosses;
	}

	public Integer getPlayoffSeriesWins() {
		return playoffSeriesWins;
	}

	public void setPlayoffSeriesWins(Integer playoffSeriesWins) {
		this.playoffSeriesWins = playoffSeriesWins;
	}

	public Integer getPlayoffSeriesLosses() {
		return playoffSeriesLosses;
	}

	public void setPlayoffSeriesLosses(Integer playoffSeriesLosses) {
		this.playoffSeriesLosses = playoffSeriesLosses;
	}

	@Override
	public int hashCode() {
		return Objects.hash(oppId, seasonLosses, seasonWins, teamId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadToHead other = (HeadToHead) obj;
		return Objects.equals(oppId, other.oppId) && Objects.equals(seasonLosses, other.seasonLosses)
				&& Objects.equals(seasonWins, other.seasonWins) && Objects.equals(teamId, other.teamId);
	}

}
