package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

public class PlayoffStatsKey implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer season;
	private Integer id;
	private Integer games;
	private Integer points;
	private Integer rebounds;
	private Integer assists;
	
	public PlayoffStatsKey() {
	}

	public PlayoffStatsKey(Integer season, Integer id, Integer games, Integer points, Integer rebounds,
			Integer assists) {
		super();
		this.season = season;
		this.id = id;
		this.games = games;
		this.points = points;
		this.rebounds = rebounds;
		this.assists = assists;
	}

	public Integer getSeason() {
		return season;
	}

	public void setSeason(Integer season) {
		this.season = season;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGames() {
		return games;
	}

	public void setGames(Integer games) {
		this.games = games;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
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

	@Override
	public int hashCode() {
		return Objects.hash(assists, games, id, points, rebounds, season);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayoffStatsKey other = (PlayoffStatsKey) obj;
		return Objects.equals(assists,
				other.assists) && Objects.equals(games, other.games)
				&& Objects.equals(id, other.id) && Objects.equals(points, other.points)
				&& Objects.equals(rebounds, other.rebounds) && Objects.equals(season, other.season);
	}
	
	

}
