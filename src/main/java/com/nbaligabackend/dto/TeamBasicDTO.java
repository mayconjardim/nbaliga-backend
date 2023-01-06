package com.nbaligabackend.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.nbaligabackend.entities.DraftPicks;
import com.nbaligabackend.entities.Player;
import com.nbaligabackend.entities.Team;

public class TeamBasicDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer league;
	private String cityName;
	private String name;
	private String city;
	private String state;
	private String conference;
	private Integer totalSalary;

	private Set<PlayerBasicDTO> players = new HashSet<>();

	private Set<DraftPicksDTO> picks = new HashSet<>();

	public TeamBasicDTO() {
	}

	public TeamBasicDTO(Long id, Integer league, String cityName, String name, String city, String state,
			String conference, Integer totalSalary) {
		super();
		this.id = id;
		this.league = league;
		this.cityName = cityName;
		this.name = name;
		this.city = city;
		this.state = state;
		this.conference = conference;
		this.totalSalary = totalSalary;
	}

	public TeamBasicDTO(Team entity) {
		id = entity.getId();
		league = entity.getLeague();
		cityName = entity.getCityName();
		name = entity.getName();
		city = entity.getCity();
		state = entity.getState();
		conference = entity.getConference();
		totalSalary = entity.getTotalSalary();
	}

	public TeamBasicDTO(Team entity, Set<Player> players, Set<DraftPicks> picks) {
		this(entity);
		players.forEach(play -> this.players.add(new PlayerBasicDTO(play)));
		picks.forEach(pick -> this.picks.add(new DraftPicksDTO(pick)));
	}

	// métodos personalizados

	public Integer getCapSpace() {
		return 101962352 - this.totalSalary + 0;
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

	public Integer getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(Integer totalSalary) {
		this.totalSalary = totalSalary;
	}

	public Set<PlayerBasicDTO> getPlayers() {
		return players;
	}

	public void setPlayers(Set<PlayerBasicDTO> players) {
		this.players = players;
	}

	public Set<DraftPicksDTO> getPicks() {
		return picks;
	}

	public void setPicks(Set<DraftPicksDTO> picks) {
		this.picks = picks;
	}

	// métodos default

}
