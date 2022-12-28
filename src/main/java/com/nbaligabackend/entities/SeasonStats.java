package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seasonstats")
public class SeasonStats implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;	
	@Id
	private Integer season;
	private Integer league;
	private String team;
	private Integer games;
	private Integer gamesStarted;
	private Integer minutes;
	private Double mpg;
	private Integer fga;
	private Integer fgm;
	private Double fg_;
	private Integer _3pa;
	private Integer _3pm;
	private Double _3p_;
	private Integer fta;
	private Integer ftm;
	private Double ft_;
	private Integer offensiveRebounds;
	private Integer rebounds;
	private Double rpg;
	private Integer assists;
	private Double apg;
	private Integer steals;
	private Double spg;
	private Integer blocks;
	private Double bpg;
	private Integer turnovers;
	private Double tpg;
	private Integer points;
	private Double ppg;
	private Integer fouls;
	private Integer plusMinus;
	private Integer dq;
	private Integer doubleDoubles;
	private Integer tripleDoubles;

	public SeasonStats() {
	}

	public SeasonStats(Long id, Integer season, Integer league, String team, Integer games, Integer gamesStarted,
			Integer minutes, Double mpg, Integer fga, Integer fgm, Double fg_, Integer _3pa, Integer _3pm, Double _3p_,
			Integer fta, Integer ftm, Double ft_, Integer offensiveRebounds, Integer rebounds, Double rpg,
			Integer assists, Double apg, Integer steals, Double spg, Integer blocks, Double bpg, Integer turnovers,
			Double tpg, Integer points, Double ppg, Integer fouls, Integer plusMinus, Integer dq, Integer doubleDoubles,
			Integer tripleDoubles) {
		super();
		this.id = id;
		this.season = season;
		this.league = league;
		this.team = team;
		this.games = games;
		this.gamesStarted = gamesStarted;
		this.minutes = minutes;
		this.mpg = mpg;
		this.fga = fga;
		this.fgm = fgm;
		this.fg_ = fg_;
		this._3pa = _3pa;
		this._3pm = _3pm;
		this._3p_ = _3p_;
		this.fta = fta;
		this.ftm = ftm;
		this.ft_ = ft_;
		this.offensiveRebounds = offensiveRebounds;
		this.rebounds = rebounds;
		this.rpg = rpg;
		this.assists = assists;
		this.apg = apg;
		this.steals = steals;
		this.spg = spg;
		this.blocks = blocks;
		this.bpg = bpg;
		this.turnovers = turnovers;
		this.tpg = tpg;
		this.points = points;
		this.ppg = ppg;
		this.fouls = fouls;
		this.plusMinus = plusMinus;
		this.dq = dq;
		this.doubleDoubles = doubleDoubles;
		this.tripleDoubles = tripleDoubles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSeason() {
		return season;
	}

	public void setSeason(Integer season) {
		this.season = season;
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

	public Integer getGamesStarted() {
		return gamesStarted;
	}

	public void setGamesStarted(Integer gamesStarted) {
		this.gamesStarted = gamesStarted;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public Double getMpg() {
		return mpg;
	}

	public void setMpg(Double mpg) {
		this.mpg = mpg;
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

	public Double getFg_() {
		return fg_;
	}

	public void setFg_(Double fg_) {
		this.fg_ = fg_;
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

	public Double get_3p_() {
		return _3p_;
	}

	public void set_3p_(Double _3p_) {
		this._3p_ = _3p_;
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

	public Double getFt_() {
		return ft_;
	}

	public void setFt_(Double ft_) {
		this.ft_ = ft_;
	}

	public Integer getOffensiveRebounds() {
		return offensiveRebounds;
	}

	public void setOffensiveRebounds(Integer offensiveRebounds) {
		this.offensiveRebounds = offensiveRebounds;
	}

	public Integer getRebounds() {
		return rebounds;
	}

	public void setRebounds(Integer rebounds) {
		this.rebounds = rebounds;
	}

	public Double getRpg() {
		return rpg;
	}

	public void setRpg(Double rpg) {
		this.rpg = rpg;
	}

	public Integer getAssists() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	public Double getApg() {
		return apg;
	}

	public void setApg(Double apg) {
		this.apg = apg;
	}

	public Integer getSteals() {
		return steals;
	}

	public void setSteals(Integer steals) {
		this.steals = steals;
	}

	public Double getSpg() {
		return spg;
	}

	public void setSpg(Double spg) {
		this.spg = spg;
	}

	public Integer getBlocks() {
		return blocks;
	}

	public void setBlocks(Integer blocks) {
		this.blocks = blocks;
	}

	public Double getBpg() {
		return bpg;
	}

	public void setBpg(Double bpg) {
		this.bpg = bpg;
	}

	public Integer getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(Integer turnovers) {
		this.turnovers = turnovers;
	}

	public Double getTpg() {
		return tpg;
	}

	public void setTpg(Double tpg) {
		this.tpg = tpg;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Double getPpg() {
		return ppg;
	}

	public void setPpg(Double ppg) {
		this.ppg = ppg;
	}

	public Integer getFouls() {
		return fouls;
	}

	public void setFouls(Integer fouls) {
		this.fouls = fouls;
	}

	public Integer getPlusMinus() {
		return plusMinus;
	}

	public void setPlusMinus(Integer plusMinus) {
		this.plusMinus = plusMinus;
	}

	public Integer getDq() {
		return dq;
	}

	public void setDq(Integer dq) {
		this.dq = dq;
	}

	public Integer getDoubleDoubles() {
		return doubleDoubles;
	}

	public void setDoubleDoubles(Integer doubleDoubles) {
		this.doubleDoubles = doubleDoubles;
	}

	public Integer getTripleDoubles() {
		return tripleDoubles;
	}

	public void setTripleDoubles(Integer tripleDoubles) {
		this.tripleDoubles = tripleDoubles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeasonStats other = (SeasonStats) obj;
		return Objects.equals(id, other.id);
	}

}
