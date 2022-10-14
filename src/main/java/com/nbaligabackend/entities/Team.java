package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private Integer league;
	private String cityName;
	private String name;
	private String city;
	private String state;
	private String conference;
	private String division;
	private Integer teamRating;
	private Integer championships;
	private Integer playoffs;
	private Integer totalSalary;
	private Integer numPlayers;
	private Integer oldWinRating;
	private Integer streak;
	private Integer homeWins;
	private Integer homeLosses;
	private Integer roadWins;
	private Integer roadLosses;
	private Double win_;
	private Integer totalWins;
	private Integer totalLosses;
	private Integer playoffWins;
	private Integer playoffLosses;
	private Integer finalsAppearances;
	private Integer points;
	private Integer allowedPoints;
	private Integer steals;
	private Integer allowedSteals;
	private Integer rebounds;
	private Integer allowedRebounds;
	private Integer assists;
	private Integer allowedAssists;
	private Integer blocks;
	private Integer allowedBlocks;
	private Integer turnovers;
	private Integer allowedTurnovers;
	private Integer fga;
	private Integer fgm;
	private Integer allowedFga;
	private Integer allowedFgm;
	private Integer _3pa;
	private Integer _3pm;
	private Integer allowed3pa;
	private Integer allowed3pm;
	private Integer ftm;
	private Integer fta;
	private Integer allowedFtm;
	private Integer allowedFta;
	private Integer lastPlayoffYear;
	private Boolean isHuman;
	private Double cutSalary;
	private Double cutSalary2;
	private Double cutSalary3;
	private Double cutSalary4;
	private Double cutSalary5;
	private Double cutSalary6;
	private Double cutSalary7;
	private Double cutSalary8;
	private Integer usedMidException;
	private Integer usedLowException;
	private Double gb;
	private Double confGb;
	private Integer divRank;
	private Integer confRank;
	private String arenaName;

	public Team() {
	}

	public Team(Long id, Integer league, String cityName, String name, String city, String state, String conference,
			String division, Integer teamRating, Integer championships, Integer playoffs, Integer totalSalary,
			Integer numPlayers, Integer oldWinRating, Integer streak, Integer homeWins, Integer homeLosses,
			Integer roadWins, Integer roadLosses, Double win_, Integer totalWins, Integer totalLosses,
			Integer playoffWins, Integer playoffLosses, Integer finalsAppearances, Integer points,
			Integer allowedPoints, Integer steals, Integer allowedSteals, Integer rebounds, Integer allowedRebounds,
			Integer assists, Integer allowedAssists, Integer blocks, Integer allowedBlocks, Integer turnovers,
			Integer allowedTurnovers, Integer fga, Integer fgm, Integer allowedFga, Integer allowedFgm, Integer _3pa,
			Integer _3pm, Integer allowed3pa, Integer allowed3pm, Integer ftm, Integer fta, Integer allowedFtm,
			Integer allowedFta, Integer lastPlayoffYear, Boolean isHuman, Double cutSalary, Double cutSalary2,
			Double cutSalary3, Double cutSalary4, Double cutSalary5, Double cutSalary6, Double cutSalary7,
			Double cutSalary8, Integer usedMidException, Integer usedLowException, Double gb, Double confGb,
			Integer divRank, Integer confRank, String arenaName) {
		super();
		this.id = id;
		this.league = league;
		this.cityName = cityName;
		this.name = name;
		this.city = city;
		this.state = state;
		this.conference = conference;
		this.division = division;
		this.teamRating = teamRating;
		this.championships = championships;
		this.playoffs = playoffs;
		this.totalSalary = totalSalary;
		this.numPlayers = numPlayers;
		this.oldWinRating = oldWinRating;
		this.streak = streak;
		this.homeWins = homeWins;
		this.homeLosses = homeLosses;
		this.roadWins = roadWins;
		this.roadLosses = roadLosses;
		this.win_ = win_;
		this.totalWins = totalWins;
		this.totalLosses = totalLosses;
		this.playoffWins = playoffWins;
		this.playoffLosses = playoffLosses;
		this.finalsAppearances = finalsAppearances;
		this.points = points;
		this.allowedPoints = allowedPoints;
		this.steals = steals;
		this.allowedSteals = allowedSteals;
		this.rebounds = rebounds;
		this.allowedRebounds = allowedRebounds;
		this.assists = assists;
		this.allowedAssists = allowedAssists;
		this.blocks = blocks;
		this.allowedBlocks = allowedBlocks;
		this.turnovers = turnovers;
		this.allowedTurnovers = allowedTurnovers;
		this.fga = fga;
		this.fgm = fgm;
		this.allowedFga = allowedFga;
		this.allowedFgm = allowedFgm;
		this._3pa = _3pa;
		this._3pm = _3pm;
		this.allowed3pa = allowed3pa;
		this.allowed3pm = allowed3pm;
		this.ftm = ftm;
		this.fta = fta;
		this.allowedFtm = allowedFtm;
		this.allowedFta = allowedFta;
		this.lastPlayoffYear = lastPlayoffYear;
		this.isHuman = isHuman;
		this.cutSalary = cutSalary;
		this.cutSalary2 = cutSalary2;
		this.cutSalary3 = cutSalary3;
		this.cutSalary4 = cutSalary4;
		this.cutSalary5 = cutSalary5;
		this.cutSalary6 = cutSalary6;
		this.cutSalary7 = cutSalary7;
		this.cutSalary8 = cutSalary8;
		this.usedMidException = usedMidException;
		this.usedLowException = usedLowException;
		this.gb = gb;
		this.confGb = confGb;
		this.divRank = divRank;
		this.confRank = confRank;
		this.arenaName = arenaName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getLeague() {
		return league;
	}

	public void setLeague(Integer league) {
		this.league = league;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Integer getTeamRating() {
		return teamRating;
	}

	public void setTeamRating(Integer teamRating) {
		this.teamRating = teamRating;
	}

	public Integer getChampionships() {
		return championships;
	}

	public void setChampionships(Integer championships) {
		this.championships = championships;
	}

	public Integer getPlayoffs() {
		return playoffs;
	}

	public void setPlayoffs(Integer playoffs) {
		this.playoffs = playoffs;
	}

	public Integer getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(Integer totalSalary) {
		this.totalSalary = totalSalary;
	}

	public Integer getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(Integer numPlayers) {
		this.numPlayers = numPlayers;
	}

	public Integer getOldWinRating() {
		return oldWinRating;
	}

	public void setOldWinRating(Integer oldWinRating) {
		this.oldWinRating = oldWinRating;
	}

	public Integer getStreak() {
		return streak;
	}

	public void setStreak(Integer streak) {
		this.streak = streak;
	}

	public Integer getHomeWins() {
		return homeWins;
	}

	public void setHomeWins(Integer homeWins) {
		this.homeWins = homeWins;
	}

	public Integer getHomeLosses() {
		return homeLosses;
	}

	public void setHomeLosses(Integer homeLosses) {
		this.homeLosses = homeLosses;
	}

	public Integer getRoadWins() {
		return roadWins;
	}

	public void setRoadWins(Integer roadWins) {
		this.roadWins = roadWins;
	}

	public Integer getRoadLosses() {
		return roadLosses;
	}

	public void setRoadLosses(Integer roadLosses) {
		this.roadLosses = roadLosses;
	}

	public Double getWin_() {
		return win_;
	}

	public void setWin_(Double win_) {
		this.win_ = win_;
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

	public Integer getFinalsAppearances() {
		return finalsAppearances;
	}

	public void setFinalsAppearances(Integer finalsAppearances) {
		this.finalsAppearances = finalsAppearances;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getAllowedPoints() {
		return allowedPoints;
	}

	public void setAllowedPoints(Integer allowedPoints) {
		this.allowedPoints = allowedPoints;
	}

	public Integer getSteals() {
		return steals;
	}

	public void setSteals(Integer steals) {
		this.steals = steals;
	}

	public Integer getAllowedSteals() {
		return allowedSteals;
	}

	public void setAllowedSteals(Integer allowedSteals) {
		this.allowedSteals = allowedSteals;
	}

	public Integer getRebounds() {
		return rebounds;
	}

	public void setRebounds(Integer rebounds) {
		this.rebounds = rebounds;
	}

	public Integer getAllowedRebounds() {
		return allowedRebounds;
	}

	public void setAllowedRebounds(Integer allowedRebounds) {
		this.allowedRebounds = allowedRebounds;
	}

	public Integer getAssists() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	public Integer getAllowedAssists() {
		return allowedAssists;
	}

	public void setAllowedAssists(Integer allowedAssists) {
		this.allowedAssists = allowedAssists;
	}

	public Integer getBlocks() {
		return blocks;
	}

	public void setBlocks(Integer blocks) {
		this.blocks = blocks;
	}

	public Integer getAllowedBlocks() {
		return allowedBlocks;
	}

	public void setAllowedBlocks(Integer allowedBlocks) {
		this.allowedBlocks = allowedBlocks;
	}

	public Integer getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(Integer turnovers) {
		this.turnovers = turnovers;
	}

	public Integer getAllowedTurnovers() {
		return allowedTurnovers;
	}

	public void setAllowedTurnovers(Integer allowedTurnovers) {
		this.allowedTurnovers = allowedTurnovers;
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

	public Integer getAllowedFga() {
		return allowedFga;
	}

	public void setAllowedFga(Integer allowedFga) {
		this.allowedFga = allowedFga;
	}

	public Integer getAllowedFgm() {
		return allowedFgm;
	}

	public void setAllowedFgm(Integer allowedFgm) {
		this.allowedFgm = allowedFgm;
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

	public Integer getAllowed3pa() {
		return allowed3pa;
	}

	public void setAllowed3pa(Integer allowed3pa) {
		this.allowed3pa = allowed3pa;
	}

	public Integer getAllowed3pm() {
		return allowed3pm;
	}

	public void setAllowed3pm(Integer allowed3pm) {
		this.allowed3pm = allowed3pm;
	}

	public Integer getFtm() {
		return ftm;
	}

	public void setFtm(Integer ftm) {
		this.ftm = ftm;
	}

	public Integer getFta() {
		return fta;
	}

	public void setFta(Integer fta) {
		this.fta = fta;
	}

	public Integer getAllowedFtm() {
		return allowedFtm;
	}

	public void setAllowedFtm(Integer allowedFtm) {
		this.allowedFtm = allowedFtm;
	}

	public Integer getAllowedFta() {
		return allowedFta;
	}

	public void setAllowedFta(Integer allowedFta) {
		this.allowedFta = allowedFta;
	}

	public Integer getLastPlayoffYear() {
		return lastPlayoffYear;
	}

	public void setLastPlayoffYear(Integer lastPlayoffYear) {
		this.lastPlayoffYear = lastPlayoffYear;
	}

	public Boolean getIsHuman() {
		return isHuman;
	}

	public void setIsHuman(Boolean isHuman) {
		this.isHuman = isHuman;
	}

	public Double getCutSalary() {
		return cutSalary;
	}

	public void setCutSalary(Double cutSalary) {
		this.cutSalary = cutSalary;
	}

	public Double getCutSalary2() {
		return cutSalary2;
	}

	public void setCutSalary2(Double cutSalary2) {
		this.cutSalary2 = cutSalary2;
	}

	public Double getCutSalary3() {
		return cutSalary3;
	}

	public void setCutSalary3(Double cutSalary3) {
		this.cutSalary3 = cutSalary3;
	}

	public Double getCutSalary4() {
		return cutSalary4;
	}

	public void setCutSalary4(Double cutSalary4) {
		this.cutSalary4 = cutSalary4;
	}

	public Double getCutSalary5() {
		return cutSalary5;
	}

	public void setCutSalary5(Double cutSalary5) {
		this.cutSalary5 = cutSalary5;
	}

	public Double getCutSalary6() {
		return cutSalary6;
	}

	public void setCutSalary6(Double cutSalary6) {
		this.cutSalary6 = cutSalary6;
	}

	public Double getCutSalary7() {
		return cutSalary7;
	}

	public void setCutSalary7(Double cutSalary7) {
		this.cutSalary7 = cutSalary7;
	}

	public Double getCutSalary8() {
		return cutSalary8;
	}

	public void setCutSalary8(Double cutSalary8) {
		this.cutSalary8 = cutSalary8;
	}

	public Integer getUsedMidException() {
		return usedMidException;
	}

	public void setUsedMidException(Integer usedMidException) {
		this.usedMidException = usedMidException;
	}

	public Integer getUsedLowException() {
		return usedLowException;
	}

	public void setUsedLowException(Integer usedLowException) {
		this.usedLowException = usedLowException;
	}

	public Double getGb() {
		return gb;
	}

	public void setGb(Double gb) {
		this.gb = gb;
	}

	public Double getConfGb() {
		return confGb;
	}

	public void setConfGb(Double confGb) {
		this.confGb = confGb;
	}

	public Integer getDivRank() {
		return divRank;
	}

	public void setDivRank(Integer divRank) {
		this.divRank = divRank;
	}

	public Integer getConfRank() {
		return confRank;
	}

	public void setConfRank(Integer confRank) {
		this.confRank = confRank;
	}

	public String getArenaName() {
		return arenaName;
	}

	public void setArenaName(String arenaName) {
		this.arenaName = arenaName;
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
		Team other = (Team) obj;
		return Objects.equals(id, other.id);
	}

}
