package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

public class ScheduleKey implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer day;
	private String home;
	private String away;

	public ScheduleKey() {
	}

	public ScheduleKey(Integer day, String home, String away) {
		super();
		this.day = day;
		this.home = home;
		this.away = away;
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

	@Override
	public int hashCode() {
		return Objects.hash(away, day, home);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduleKey other = (ScheduleKey) obj;
		return Objects.equals(away, other.away) && Objects.equals(day, other.day) && Objects.equals(home, other.home);
	}

}
