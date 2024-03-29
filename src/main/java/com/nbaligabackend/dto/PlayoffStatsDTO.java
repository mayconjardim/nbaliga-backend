package com.nbaligabackend.dto;

import java.io.Serializable;

import com.nbaligabackend.entities.PlayoffStats;

public class PlayoffStatsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

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

	public PlayoffStatsDTO() {
	}

	public PlayoffStatsDTO(Integer season, Integer id, Integer league, String team, Integer games, Integer minutes,
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

	public PlayoffStatsDTO(PlayoffStats entity) {

		this.season = entity.getSeason();
		this.id = entity.getId();
		this.league = entity.getLeague();
		this.team = entity.getTeam();
		this.games = entity.getGames();
		this.minutes = entity.getMinutes();
		this.fga = entity.getFga();
		this.fgm = entity.getFgm();
		this._3pa = entity.get_3pa();
		this._3pm = entity.get_3pm();
		this.fta = entity.getFta();
		this.ftm = entity.getFtm();
		this.offensiverebounds = entity.getOffensiverebounds();
		this.rebounds = entity.getRebounds();
		this.assists = entity.getAssists();
		this.steals = entity.getSteals();
		this.blocks = entity.getBlocks();
		this.turnovers = entity.getTurnovers();
		this.points = entity.getPoints();
		this.fouls = entity.getFouls();
		this.plusminus = entity.getPlusminus();
		this.dq = entity.getDq();
		this.doubledoubles = entity.getDoubledoubles();
		this.tripledoubles = entity.getTripledoubles();
	}

	// Métodos personalizados

	
	
	public Double getPpgPct() {
		return this.points.doubleValue() / this.games;
	}

	public Double getRebPct() {
		return this.rebounds.doubleValue() / this.games;
	}
	
	public Double getOffRebPct() {
		return this.offensiverebounds.doubleValue() / this.games;
	}
	
	public Double getDeffRebPct() {
		return (this.rebounds.doubleValue() - this.offensiverebounds) / this.games ;
	}
	
	public Integer getPlusMinusPct() {
		return this.plusminus / games;
	}

	public Double getAstPct() {
		return this.assists.doubleValue() / this.games;
	}

	public Double getStealsPct() {
		return this.steals.doubleValue() / this.games;
	}

	public Double getBlocksPct() {
		return this.blocks.doubleValue() / this.games;
	}

	public Double getTurnoversPct() {
		return this.turnovers.doubleValue() / this.games;
	}

	public Double getFoulsPct() {
		return this.fouls.doubleValue() / this.games;
	}

	public Double getMpg() {
		return this.minutes.doubleValue() / this.games;
	}

	public Double getFga_() {
		return this.fga.doubleValue() / this.games;
	}

	public Double getFgm_() {
		return this.fgm.doubleValue() / this.games;
	}

	public Double getFgPct() {
		return this.fgm.doubleValue() / this.fga + 0.0001;
	}

	public Double get_3pa_() {
		return this._3pa.doubleValue() / this.games + 0.0001;
	}

	public Double get_3pm_() {
		return this._3pm.doubleValue() / this.games + 0.0001;
	}

	public Double get_3Pct() {
		return this._3pm.doubleValue() / this._3pa + 0.0001;
	}

	public Double getfta_() {
		return this.fta.doubleValue() / this.games;
	}

	public Double getftm_() {
		return this.ftm.doubleValue() / this.games;
	}

	public Double getFtPct() {
		return this.ftm.doubleValue() / this.fta + 0.0001;
	}

	// Métodos default
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

}
