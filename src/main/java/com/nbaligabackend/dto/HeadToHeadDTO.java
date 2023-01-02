package com.nbaligabackend.dto;

import java.io.Serializable;
import java.util.Objects;

import com.nbaligabackend.entities.HeadToHead;

public class HeadToHeadDTO implements Serializable {
	private static final long serialVersionUID = 1L;

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

	public HeadToHeadDTO() {
	}

	public HeadToHeadDTO(Integer teamId, Integer oppId, Integer totalWins, Integer totalLosses, Integer points,
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

	public HeadToHeadDTO(HeadToHead entity) {
		this.teamId = entity.getTeamId();
		this.oppId = entity.getOppId();
		this.totalWins = entity.getTotalWins();
		this.totalLosses = entity.getTotalLosses();
		this.points = entity.getPoints();
		this.seasonWins = entity.getSeasonWins();
		this.seasonLosses = entity.getSeasonLosses();
		this.playoffWins = entity.getPlayoffWins();
		this.playoffLosses = entity.getPlayoffLosses();
		this.playoffSeriesWins = entity.getPlayoffSeriesWins();
		this.playoffSeriesLosses = entity.getPlayoffSeriesLosses();
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
		HeadToHeadDTO other = (HeadToHeadDTO) obj;
		return Objects.equals(oppId, other.oppId) && Objects.equals(seasonLosses, other.seasonLosses)
				&& Objects.equals(seasonWins, other.seasonWins) && Objects.equals(teamId, other.teamId);
	}

}
