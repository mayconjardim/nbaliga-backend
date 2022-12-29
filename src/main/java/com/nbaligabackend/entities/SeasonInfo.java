package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SeasonInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer Season;
	private Integer SeasonDay;

	public SeasonInfo() {
	}

	public SeasonInfo(Integer season, Integer seasonDay) {
		super();
		Season = season;
		SeasonDay = seasonDay;
	}

	public Integer getSeason() {
		return Season;
	}

	public void setSeason(Integer season) {
		Season = season;
	}

	public Integer getSeasonDay() {
		return SeasonDay;
	}

	public void setSeasonDay(Integer seasonDay) {
		SeasonDay = seasonDay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Season);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeasonInfo other = (SeasonInfo) obj;
		return Objects.equals(Season, other.Season);
	}

}
