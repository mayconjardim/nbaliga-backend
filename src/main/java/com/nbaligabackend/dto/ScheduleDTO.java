package com.nbaligabackend.dto;

import java.io.Serializable;

import com.nbaligabackend.entities.Schedule;

public class ScheduleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer day;
	private String home;
	private String away;
	private Integer league;
	private Integer type;
	private Integer homeScore;
	private Integer awayScore;
	private String boxName;
	private Integer playerOfGameId;
	private String playerOfGame;
	private Integer homePointsID;
	private Integer homePoints;
	private Integer homeRebID;
	private Integer homeRebs;
	private Integer homeAssistID;
	private Integer homeAssists;
	private Integer awayPointsID;
	private Integer awayPoints;
	private Integer awayRebID;
	private Integer awayRebs;
	private Integer awayAssistID;
	private Integer homeQ1;
	private Integer homeQ2;
	private Integer homeQ3;
	private Integer homeQ4;
	private Integer homeOT;
	private Integer awayQ1;
	private Integer awayQ2;
	private Integer awayQ3;
	private Integer awayQ4;
	private Integer awayOT;

	public ScheduleDTO() {
	}

	public ScheduleDTO(Integer day, String home, String away, Integer league, Integer type, Integer homeScore,
			Integer awayScore, String boxName, Integer playerOfGameId, String playerOfGame, Integer homePointsID,
			Integer homePoints, Integer homeRebID, Integer homeRebs, Integer homeAssistID, Integer homeAssists,
			Integer awayPointsID, Integer awayPoints, Integer awayRebID, Integer awayRebs, Integer awayAssistID,
			Integer homeQ1, Integer homeQ2, Integer homeQ3, Integer homeQ4, Integer homeOT, Integer awayQ1,
			Integer awayQ2, Integer awayQ3, Integer awayQ4, Integer awayOT) {
		super();
		this.day = day;
		this.home = home;
		this.away = away;
		this.league = league;
		this.type = type;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
		this.boxName = boxName;
		this.playerOfGameId = playerOfGameId;
		this.playerOfGame = playerOfGame;
		this.homePointsID = homePointsID;
		this.homePoints = homePoints;
		this.homeRebID = homeRebID;
		this.homeRebs = homeRebs;
		this.homeAssistID = homeAssistID;
		this.homeAssists = homeAssists;
		this.awayPointsID = awayPointsID;
		this.awayPoints = awayPoints;
		this.awayRebID = awayRebID;
		this.awayRebs = awayRebs;
		this.awayAssistID = awayAssistID;
		this.homeQ1 = homeQ1;
		this.homeQ2 = homeQ2;
		this.homeQ3 = homeQ3;
		this.homeQ4 = homeQ4;
		this.homeOT = homeOT;
		this.awayQ1 = awayQ1;
		this.awayQ2 = awayQ2;
		this.awayQ3 = awayQ3;
		this.awayQ4 = awayQ4;
		this.awayOT = awayOT;
	}

	public ScheduleDTO(Schedule entity) {
		super();
		this.day = entity.getDay();
		this.home = entity.getHome();
		this.away = entity.getAway();
		this.league = entity.getLeague();
		this.type = entity.getType();
		this.homeScore = entity.getHomeScore();
		this.awayScore = entity.getAwayScore();
		this.boxName = entity.getBoxName();
		this.playerOfGameId = entity.getPlayerOfGameId();
		this.playerOfGame = entity.getPlayerOfGame();
		this.homePointsID = entity.getHomePointsID();
		this.homePoints = entity.getHomePoints();
		this.homeRebID = entity.getHomeRebID();
		this.homeRebs = entity.getHomeRebs();
		this.homeAssistID = entity.getHomeAssistID();
		this.homeAssists = entity.getHomeAssists();
		this.awayPointsID = entity.getAwayPointsID();
		this.awayPoints = entity.getAwayPoints();
		this.awayRebID = entity.getAwayRebID();
		this.awayRebs = entity.getAwayRebs();
		this.awayAssistID = entity.getAwayAssistID();
		this.homeQ1 = entity.getHomeQ1();
		this.homeQ2 = entity.getHomeQ2();
		this.homeQ3 = entity.getHomeQ3();
		this.homeQ4 = entity.getHomeQ4();
		this.homeOT = entity.getHomeOT();
		this.awayQ1 = entity.getAwayQ1();
		this.awayQ2 = entity.getAwayQ2();
		this.awayQ3 = entity.getAwayQ3();
		this.awayQ4 = entity.getAwayQ4();
		this.awayOT = entity.getAwayOT();
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getAway() {
		return away;
	}

	public void setAway(String away) {
		this.away = away;
	}

	public Integer getLeague() {
		return league;
	}

	public void setLeague(Integer league) {
		this.league = league;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(Integer homeScore) {
		this.homeScore = homeScore;
	}

	public Integer getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(Integer awayScore) {
		this.awayScore = awayScore;
	}

	public String getBoxName() {
		return boxName;
	}

	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}

	public Integer getPlayerOfGameId() {
		return playerOfGameId;
	}

	public void setPlayerOfGameId(Integer playerOfGameId) {
		this.playerOfGameId = playerOfGameId;
	}

	public String getPlayerOfGame() {
		return playerOfGame;
	}

	public void setPlayerOfGame(String playerOfGame) {
		this.playerOfGame = playerOfGame;
	}

	public Integer getHomePointsID() {
		return homePointsID;
	}

	public void setHomePointsID(Integer homePointsID) {
		this.homePointsID = homePointsID;
	}

	public Integer getHomePoints() {
		return homePoints;
	}

	public void setHomePoints(Integer homePoints) {
		this.homePoints = homePoints;
	}

	public Integer getHomeRebID() {
		return homeRebID;
	}

	public void setHomeRebID(Integer homeRebID) {
		this.homeRebID = homeRebID;
	}

	public Integer getHomeRebs() {
		return homeRebs;
	}

	public void setHomeRebs(Integer homeRebs) {
		this.homeRebs = homeRebs;
	}

	public Integer getHomeAssistID() {
		return homeAssistID;
	}

	public void setHomeAssistID(Integer homeAssistID) {
		this.homeAssistID = homeAssistID;
	}

	public Integer getHomeAssists() {
		return homeAssists;
	}

	public void setHomeAssists(Integer homeAssists) {
		this.homeAssists = homeAssists;
	}

	public Integer getAwayPointsID() {
		return awayPointsID;
	}

	public void setAwayPointsID(Integer awayPointsID) {
		this.awayPointsID = awayPointsID;
	}

	public Integer getAwayPoints() {
		return awayPoints;
	}

	public void setAwayPoints(Integer awayPoints) {
		this.awayPoints = awayPoints;
	}

	public Integer getAwayRebID() {
		return awayRebID;
	}

	public void setAwayRebID(Integer awayRebID) {
		this.awayRebID = awayRebID;
	}

	public Integer getAwayRebs() {
		return awayRebs;
	}

	public void setAwayRebs(Integer awayRebs) {
		this.awayRebs = awayRebs;
	}

	public Integer getAwayAssistID() {
		return awayAssistID;
	}

	public void setAwayAssistID(Integer awayAssistID) {
		this.awayAssistID = awayAssistID;
	}

	public Integer getHomeQ1() {
		return homeQ1;
	}

	public void setHomeQ1(Integer homeQ1) {
		this.homeQ1 = homeQ1;
	}

	public Integer getHomeQ2() {
		return homeQ2;
	}

	public void setHomeQ2(Integer homeQ2) {
		this.homeQ2 = homeQ2;
	}

	public Integer getHomeQ3() {
		return homeQ3;
	}

	public void setHomeQ3(Integer homeQ3) {
		this.homeQ3 = homeQ3;
	}

	public Integer getHomeQ4() {
		return homeQ4;
	}

	public void setHomeQ4(Integer homeQ4) {
		this.homeQ4 = homeQ4;
	}

	public Integer getHomeOT() {
		return homeOT;
	}

	public void setHomeOT(Integer homeOT) {
		this.homeOT = homeOT;
	}

	public Integer getAwayQ1() {
		return awayQ1;
	}

	public void setAwayQ1(Integer awayQ1) {
		this.awayQ1 = awayQ1;
	}

	public Integer getAwayQ2() {
		return awayQ2;
	}

	public void setAwayQ2(Integer awayQ2) {
		this.awayQ2 = awayQ2;
	}

	public Integer getAwayQ3() {
		return awayQ3;
	}

	public void setAwayQ3(Integer awayQ3) {
		this.awayQ3 = awayQ3;
	}

	public Integer getAwayQ4() {
		return awayQ4;
	}

	public void setAwayQ4(Integer awayQ4) {
		this.awayQ4 = awayQ4;
	}

	public Integer getAwayOT() {
		return awayOT;
	}

	public void setAwayOT(Integer awayOT) {
		this.awayOT = awayOT;
	}

}
