package com.nbaligabackend.dto;

import java.io.Serializable;

import com.nbaligabackend.entities.SeasonInfo;

public class SeasonInfoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer season;
	private Integer seasonDay;

	public SeasonInfoDTO() {
	}

	public SeasonInfoDTO(Integer season, Integer seasonDay) {
		super();
		this.season = season;
		this.seasonDay = seasonDay;
	}

	public SeasonInfoDTO(SeasonInfo entity) {
		season = entity.getSeason();
		seasonDay = entity.getSeasonDay();
	}

	public Integer getSeason() {
		return season;
	}

	public void setSeason(Integer season) {
		this.season = season;
	}

	public Integer getSeasonDay() {
		return seasonDay;
	}

	public void setSeasonDay(Integer seasonDay) {
		this.seasonDay = seasonDay;
	}

}
