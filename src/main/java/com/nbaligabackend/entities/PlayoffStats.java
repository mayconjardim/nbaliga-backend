package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playoffstats")
public class PlayoffStats implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer season;
	private Integer id;
	private Integer league;
	private String team;
	private Integer games;
	private Integer minutes;
	private Integer fga;
	private Integer fgm;
	private Integer _3pa;
	private Integer _3pm;
	private Integer fta;
	private Integer ftm;
	private Integer offensiverebounds;
	private Integer rebounds;
	private Integer assists;
	private Integer steals;
	private Integer blocks;
	private Integer turnovers;
	private Integer points;
	private Integer fouls;
	private Integer plusminus;
	private Integer dq;
	private Integer doubledoubles;
	private Integer tripledoubles;

	public PlayoffStats() {
	}

	public PlayoffStats(Integer season, Integer id, Integer league, String team, Integer games, Integer minutes,
			Integer fga, Integer fgm, Integer _3pa, Integer _3pm, Integer fta, Integer ftm, Integer offensiverebounds,
			Integer rebounds, Integer assists, Integer steals, Integer blocks, Integer turnovers, Integer points,
			Integer fouls, Integer plusminus, Integer dq, Integer doubledoubles, Integer tripledoubles) {
		super();
		this.season = season;
		this.id = id;
		this.league = league;
		this.team = team;
		this.games = games;
		this.minutes = minutes;
		this.fga = fga;
		this.fgm = fgm;
		this._3pa = _3pa;
		this._3pm = _3pm;
		this.fta = fta;
		this.ftm = ftm;
		this.offensiverebounds = offensiverebounds;
		this.rebounds = rebounds;
		this.assists = assists;
		this.steals = steals;
		this.blocks = blocks;
		this.turnovers = turnovers;
		this.points = points;
		this.fouls = fouls;
		this.plusminus = plusminus;
		this.dq = dq;
		this.doubledoubles = doubledoubles;
		this.tripledoubles = tripledoubles;
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

	public Integer getLeague() {
		return league;
	}

	public void setLeague(Integer league) {
		this.league = league;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getGames() {
		return games;
	}

	public void setGames(Integer games) {
		this.games = games;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public Integer getFga() {
		return fga;
	}

	public void setFga(Integer fga) {
		this.fga = fga;
	}

	public Integer getFgm() {
		return fgm;
	}

	public void setFgm(Integer fgm) {
		this.fgm = fgm;
	}

	public Integer get_3pa() {
		return _3pa;
	}

	public void set_3pa(Integer _3pa) {
		this._3pa = _3pa;
	}

	public Integer get_3pm() {
		return _3pm;
	}

	public void set_3pm(Integer _3pm) {
		this._3pm = _3pm;
	}

	public Integer getFta() {
		return fta;
	}

	public void setFta(Integer fta) {
		this.fta = fta;
	}

	public Integer getFtm() {
		return ftm;
	}

	public void setFtm(Integer ftm) {
		this.ftm = ftm;
	}

	public Integer getOffensiverebounds() {
		return offensiverebounds;
	}

	public void setOffensiverebounds(Integer offensiverebounds) {
		this.offensiverebounds = offensiverebounds;
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

	public Integer getBlocks() {
		return blocks;
	}

	public void setBlocks(Integer blocks) {
		this.blocks = blocks;
	}

	public Integer getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(Integer turnovers) {
		this.turnovers = turnovers;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getFouls() {
		return fouls;
	}

	public void setFouls(Integer fouls) {
		this.fouls = fouls;
	}

	public Integer getPlusminus() {
		return plusminus;
	}

	public void setPlusminus(Integer plusminus) {
		this.plusminus = plusminus;
	}

	public Integer getDq() {
		return dq;
	}

	public void setDq(Integer dq) {
		this.dq = dq;
	}

	public Integer getDoubledoubles() {
		return doubledoubles;
	}

	public void setDoubledoubles(Integer doubledoubles) {
		this.doubledoubles = doubledoubles;
	}

	public Integer getTripledoubles() {
		return tripledoubles;
	}

	public void setTripledoubles(Integer tripledoubles) {
		this.tripledoubles = tripledoubles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, season, team);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayoffStats other = (PlayoffStats) obj;
		return Objects.equals(id, other.id) && Objects.equals(season, other.season) && Objects.equals(team, other.team);
	}
	
	
}
