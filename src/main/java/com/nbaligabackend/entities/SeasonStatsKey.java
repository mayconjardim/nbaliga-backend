package com.nbaligabackend.entities;

import java.io.Serializable;

public class SeasonStatsKey implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer minutes;
	private Integer rebounds;
	private Integer assists;
	private Integer steals;
	private Integer points;

	public SeasonStatsKey() {
	}

	public SeasonStatsKey(Integer minutes, Integer rebounds, Integer assists, Integer steals, Integer points) {
		super();
		this.minutes = minutes;
		this.rebounds = rebounds;
		this.assists = assists;
		this.steals = steals;
		this.points = points;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public Integer getRebounds() {
		return rebounds;
	}

	public void setRebounds(Integer rebounds) {
		this.rebounds = rebounds;
	}

	public Integer getAssists() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	public Integer getSteals() {
		return steals;
	}

	public void setSteals(Integer steals) {
		this.steals = steals;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

}
