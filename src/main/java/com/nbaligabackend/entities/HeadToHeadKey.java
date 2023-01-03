package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

public class HeadToHeadKey implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer teamId;
	private Integer oppId;
	private Integer seasonWins;
	private Integer seasonLosses;
	
	public HeadToHeadKey() {
	}

	public HeadToHeadKey(Integer teamId, Integer oppId, Integer seasonWins, Integer seasonLosses) {
		super();
		this.teamId = teamId;
		this.oppId = oppId;
		this.seasonWins = seasonWins;
		this.seasonLosses = seasonLosses;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public Integer getOppId() {
		return oppId;
	}

	public void setOppId(Integer oppId) {
		this.oppId = oppId;
	}

	public Integer getSeasonWins() {
		return seasonWins;
	}

	public void setSeasonWins(Integer seasonWins) {
		this.seasonWins = seasonWins;
	}

	public Integer getSeasonLosses() {
		return seasonLosses;
	}

	public void setSeasonLosses(Integer seasonLosses) {
		this.seasonLosses = seasonLosses;
	}

	@Override
	public int hashCode() {
		return Objects.hash(oppId, seasonLosses, seasonWins, teamId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadToHeadKey other = (HeadToHeadKey) obj;
		return Objects.equals(oppId, other.oppId) && Objects.equals(seasonLosses, other.seasonLosses)
				&& Objects.equals(seasonWins, other.seasonWins) && Objects.equals(teamId, other.teamId);
	}
	
	
}
