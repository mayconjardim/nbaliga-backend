package com.nbaligabackend.dto;

import java.io.Serializable;

import com.nbaligabackend.entities.Team;

public class StandingsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String city;
	private Integer streak;
	private Integer homeWins;
	private Integer homeLosses;
	private Integer roadWins;
	private Integer roadLosses;
	private Double win_;
	private Integer points;
	private Integer allowedPoints;
	private Double gb;
	private Double confGb;
	private Integer divRank;
	private Integer confRank;
	private String conference;

	public StandingsDTO() {
	}

	public StandingsDTO(Long id, String name, String city, Integer streak, Integer homeWins, Integer homeLosses,
			Integer roadWins, Integer roadLosses, Double win_, Integer points, Integer allowedPoints, Double gb,
			Double confGb, Integer divRank, Integer confRank, String conference) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.streak = streak;
		this.homeWins = homeWins;
		this.homeLosses = homeLosses;
		this.roadWins = roadWins;
		this.roadLosses = roadLosses;
		this.win_ = win_;
		this.points = points;
		this.allowedPoints = allowedPoints;
		this.gb = gb;
		this.confGb = confGb;
		this.divRank = divRank;
		this.confRank = confRank;
		this.conference = conference;
	}

	public StandingsDTO(Team entity) {
		id = entity.getId();
		name = entity.getName();
		city = entity.getCity();
		streak = entity.getStreak();
		homeWins = entity.getHomeWins();
		homeLosses = entity.getHomeLosses();
		roadWins = entity.getRoadWins();
		roadLosses = entity.getRoadLosses();
		win_ = entity.getWin_();
		points = entity.getPoints();
		allowedPoints = entity.getAllowedPoints();
		gb = entity.getGb();
		confGb = entity.getConfGb();
		divRank = entity.getDivRank();
		confRank = entity.getConfRank();
		conference = entity.getConference();
	}

	public String getTeamName() {
		return city + " " + name;
	}

	public Integer getTotalWins() {
		return homeWins + roadWins;
	}

	public Integer getTotalLosses() {
		return homeLosses + roadLosses;
	}

	public Double getPF() {
		if (points > 0) {
			return points / (getTotalWins().doubleValue() + getTotalLosses().doubleValue()) + 0.0001;
		} else  {
			return 0.0;
		}

	}

	public Double getPA() {
		if (points > 0) {
			return points / (getTotalWins().doubleValue() + getTotalLosses().doubleValue()) + 0.0001;
		} else {
			return 0.0;
		}
	}

	public Double getDiff() {
		if (getPF() > 0) {
			return getPF() - getPA();
		} else {
			return 0.0;
		}

	}

	public String getStrk() {
		if (streak > 0) {
			return "W" + streak;
		} else if (streak < 0) {
			return "L" + Math.abs(streak);
		} else {
			return "-";
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

}