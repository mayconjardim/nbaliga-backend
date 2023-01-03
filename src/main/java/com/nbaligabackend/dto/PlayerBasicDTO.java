package com.nbaligabackend.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.nbaligabackend.entities.Player;
import com.nbaligabackend.entities.SeasonStats;

public class PlayerBasicDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer contract1;
	private Integer contract2;
	private Integer contract3;
	private Integer contract4;
	private Integer contract5;

	private List<SeasonStatsDTO> seasonStats = new ArrayList<>();

	public PlayerBasicDTO() {
	}

	public PlayerBasicDTO(Long id, Integer contract1, Integer contract2, Integer contract3, Integer contract4,
			Integer contract5) {
		super();
		this.id = id;
		this.contract1 = contract1;
		this.contract2 = contract2;
		this.contract3 = contract3;
		this.contract4 = contract4;
		this.contract5 = contract5;

	}

	public PlayerBasicDTO(Player entity) {
		id = entity.getId();
		contract1 = entity.getContract1();
		contract2 = entity.getContract2();
		contract3 = entity.getContract3();
		contract4 = entity.getContract4();
		contract5 = entity.getContract5();
	}

	public PlayerBasicDTO(Player entity, List<SeasonStats> seasonStats) {
		this(entity);
		seasonStats.forEach(stats -> this.seasonStats.add(new SeasonStatsDTO(stats)));
	}

	public double getPointsPerGame() {
		if (seasonStats.isEmpty()) {
			return 0.0;
		}
		return seasonStats.get(seasonStats.size() - 1).getPpg();
	}

	public double getRebsPerGame() {
		if (seasonStats.isEmpty()) {
			return 0.0;
		}
		return seasonStats.get(seasonStats.size() - 1).getRpg();
	}

	public double getAssistsPerGame() {
		if (seasonStats.isEmpty()) {
			return 0.0;
		}
		return seasonStats.get(seasonStats.size() - 1).getApg();
	}

	public Integer getContractLength() {
		int years = 0;
		years += (this.contract1 > 0) ? 1 : 0;
		years += (this.contract2 > 0) ? 1 : 0;
		years += (this.contract3 > 0) ? 1 : 0;
		years += (this.contract4 > 0) ? 1 : 0;
		years += (this.contract5 > 0) ? 1 : 0;
		return years;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getContract1() {
		return contract1;
	}

	public void setContract1(Integer contract1) {
		this.contract1 = contract1;
	}

	public Integer getContract2() {
		return contract2;
	}

	public void setContract2(Integer contract2) {
		this.contract2 = contract2;
	}

	public Integer getContract3() {
		return contract3;
	}

	public void setContract3(Integer contract3) {
		this.contract3 = contract3;
	}

	public Integer getContract4() {
		return contract4;
	}

	public void setContract4(Integer contract4) {
		this.contract4 = contract4;
	}

	public Integer getContract5() {
		return contract5;
	}

	public void setContract5(Integer contract5) {
		this.contract5 = contract5;
	}

	public List<SeasonStatsDTO> getSeasonStats() {
		return seasonStats;
	}

	public void setSeasonStats(List<SeasonStatsDTO> seasonStats) {
		this.seasonStats = seasonStats;
	}

}
