package com.nbaligabackend.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String firstname;
	private String lastname;
	private String name;
	private Integer height;
	private Integer weight;
	private Integer age;
	private Integer birthmonth;
	private Integer birthday;
	private Integer birthyear;
	private String currentleague;
	private Integer currentleagueid;
	private String currentteam;
	private Integer currentteamid;
	private String contractteam;
	private Integer contractteamid;
	private String dlgteam;
	private Integer dlgteamid;
	private String injury;
	private Integer timeinjured;
	private Boolean inactive;
	private Integer positionnumber;
	private Integer experience;
	private String college;
	private String city;
	private String state;
	private Integer greed;
	private Integer happiness;
	private Integer loyalty;
	private Integer winner;
	private String insidescoring;
	private String jumpshot;
	private String freethrowshot;
	private String threepointshot;
	private String handling;
	private String passing;
	private String offensiverebounding;
	private String defensiverebounding;
	private String postdefense;
	private String perimeterdefense;
	private String stealing;
	private String shotblocking;
	private String quickness;
	private String strength;
	private String stamina;
	private String jumping;
	private String pot_inside;
	private String pot_jumpshot;
	private String pot_freethrow;
	private String pot_3pshot;
	private String pot_handling;
	private String pot_passing;
	private String pot_orebounding;
	private String pot_drebounding;
	private String pot_postdefense;
	private String pot_perimeterdefense;
	private String pot_stealing;
	private String pot_blocking;
	private String currentrating;
	private String futurerating;
	private String overallrating;
	private String overallpotential;
	private Integer championships;
	private Integer playerofgame;
	private Integer playerofweek;
	private Integer playerofmonth;
	private Integer contract1;
	private Integer contract2;
	private Integer contract3;
	private Integer contract4;
	private Integer contract5;
	private Integer contract6;
	private Integer contract7;
	private Integer contract8;
	private Integer optiontype1;
	private Integer optiontype2;
	private Integer optiontype3;
	private Integer optiontype4;
	private Integer optiontype5;
	private Integer optiontype6;
	private Integer optiontype7;
	private Integer optiontype8;
	private Integer birdyears;

	public Player() {
	}

	public Player(Long id, String firstname, String lastname, String name, Integer height, Integer weight, Integer age,
			Integer birthmonth, Integer birthday, Integer birthyear, String currentleague, Integer currentleagueid,
			String currentteam, Integer currentteamid, String contractteam, Integer contractteamid, String dlgteam,
			Integer dlgteamid, String injury, Integer timeinjured, Boolean inactive, Integer positionnumber,
			Integer experience, String college, String city, String state, Integer greed, Integer happiness,
			Integer loyalty, Integer winner, String insidescoring, String jumpshot, String freethrowshot,
			String threepointshot, String handling, String passing, String offensiverebounding,
			String defensiverebounding, String postdefense, String perimeterdefense, String stealing,
			String shotblocking, String quickness, String strength, String stamina, String jumping, String pot_inside,
			String pot_jumpshot, String pot_freethrow, String pot_3pshot, String pot_handling, String pot_passing,
			String pot_orebounding, String pot_drebounding, String pot_postdefense, String pot_perimeterdefense,
			String pot_stealing, String pot_blocking, String currentrating, String futurerating, String overallrating,
			String overallpotential, Integer championships, Integer playerofgame, Integer playerofweek,
			Integer playerofmonth, Integer contract1, Integer contract2, Integer contract3, Integer contract4,
			Integer contract5, Integer contract6, Integer contract7, Integer contract8, Integer optiontype1,
			Integer optiontype2, Integer optiontype3, Integer optiontype4, Integer optiontype5, Integer optiontype6,
			Integer optiontype7, Integer optiontype8, Integer birdyears) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.currentleague = currentleague;
		this.currentleagueid = currentleagueid;
		this.currentteam = currentteam;
		this.currentteamid = currentteamid;
		this.contractteam = contractteam;
		this.contractteamid = contractteamid;
		this.dlgteam = dlgteam;
		this.dlgteamid = dlgteamid;
		this.injury = injury;
		this.timeinjured = timeinjured;
		this.inactive = inactive;
		this.positionnumber = positionnumber;
		this.experience = experience;
		this.college = college;
		this.city = city;
		this.state = state;
		this.greed = greed;
		this.happiness = happiness;
		this.loyalty = loyalty;
		this.winner = winner;
		this.insidescoring = insidescoring;
		this.jumpshot = jumpshot;
		this.freethrowshot = freethrowshot;
		this.threepointshot = threepointshot;
		this.handling = handling;
		this.passing = passing;
		this.offensiverebounding = offensiverebounding;
		this.defensiverebounding = defensiverebounding;
		this.postdefense = postdefense;
		this.perimeterdefense = perimeterdefense;
		this.stealing = stealing;
		this.shotblocking = shotblocking;
		this.quickness = quickness;
		this.strength = strength;
		this.stamina = stamina;
		this.jumping = jumping;
		this.pot_inside = pot_inside;
		this.pot_jumpshot = pot_jumpshot;
		this.pot_freethrow = pot_freethrow;
		this.pot_3pshot = pot_3pshot;
		this.pot_handling = pot_handling;
		this.pot_passing = pot_passing;
		this.pot_orebounding = pot_orebounding;
		this.pot_drebounding = pot_drebounding;
		this.pot_postdefense = pot_postdefense;
		this.pot_perimeterdefense = pot_perimeterdefense;
		this.pot_stealing = pot_stealing;
		this.pot_blocking = pot_blocking;
		this.currentrating = currentrating;
		this.futurerating = futurerating;
		this.overallrating = overallrating;
		this.overallpotential = overallpotential;
		this.championships = championships;
		this.playerofgame = playerofgame;
		this.playerofweek = playerofweek;
		this.playerofmonth = playerofmonth;
		this.contract1 = contract1;
		this.contract2 = contract2;
		this.contract3 = contract3;
		this.contract4 = contract4;
		this.contract5 = contract5;
		this.contract6 = contract6;
		this.contract7 = contract7;
		this.contract8 = contract8;
		this.optiontype1 = optiontype1;
		this.optiontype2 = optiontype2;
		this.optiontype3 = optiontype3;
		this.optiontype4 = optiontype4;
		this.optiontype5 = optiontype5;
		this.optiontype6 = optiontype6;
		this.optiontype7 = optiontype7;
		this.optiontype8 = optiontype8;
		this.birdyears = birdyears;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getBirthmonth() {
		return birthmonth;
	}

	public void setBirthmonth(Integer birthmonth) {
		this.birthmonth = birthmonth;
	}

	public Integer getBirthday() {
		return birthday;
	}

	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}

	public Integer getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(Integer birthyear) {
		this.birthyear = birthyear;
	}

	public String getCurrentleague() {
		return currentleague;
	}

	public void setCurrentleague(String currentleague) {
		this.currentleague = currentleague;
	}

	public Integer getCurrentleagueid() {
		return currentleagueid;
	}

	public void setCurrentleagueid(Integer currentleagueid) {
		this.currentleagueid = currentleagueid;
	}

	public String getCurrentteam() {
		return currentteam;
	}

	public void setCurrentteam(String currentteam) {
		this.currentteam = currentteam;
	}

	public Integer getCurrentteamid() {
		return currentteamid;
	}

	public void setCurrentteamid(Integer currentteamid) {
		this.currentteamid = currentteamid;
	}

	public String getContractteam() {
		return contractteam;
	}

	public void setContractteam(String contractteam) {
		this.contractteam = contractteam;
	}

	public Integer getContractteamid() {
		return contractteamid;
	}

	public void setContractteamid(Integer contractteamid) {
		this.contractteamid = contractteamid;
	}

	public String getDlgteam() {
		return dlgteam;
	}

	public void setDlgteam(String dlgteam) {
		this.dlgteam = dlgteam;
	}

	public Integer getDlgteamid() {
		return dlgteamid;
	}

	public void setDlgteamid(Integer dlgteamid) {
		this.dlgteamid = dlgteamid;
	}

	public String getInjury() {
		return injury;
	}

	public void setInjury(String injury) {
		this.injury = injury;
	}

	public Integer getTimeinjured() {
		return timeinjured;
	}

	public void setTimeinjured(Integer timeinjured) {
		this.timeinjured = timeinjured;
	}

	public Boolean getInactive() {
		return inactive;
	}

	public void setInactive(Boolean inactive) {
		this.inactive = inactive;
	}

	public Integer getPositionnumber() {
		return positionnumber;
	}

	public void setPositionnumber(Integer positionnumber) {
		this.positionnumber = positionnumber;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
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

	public Integer getGreed() {
		return greed;
	}

	public void setGreed(Integer greed) {
		this.greed = greed;
	}

	public Integer getHappiness() {
		return happiness;
	}

	public void setHappiness(Integer happiness) {
		this.happiness = happiness;
	}

	public Integer getLoyalty() {
		return loyalty;
	}

	public void setLoyalty(Integer loyalty) {
		this.loyalty = loyalty;
	}

	public Integer getWinner() {
		return winner;
	}

	public void setWinner(Integer winner) {
		this.winner = winner;
	}

	public String getInsidescoring() {
		return insidescoring;
	}

	public void setInsidescoring(String insidescoring) {
		this.insidescoring = insidescoring;
	}

	public String getJumpshot() {
		return jumpshot;
	}

	public void setJumpshot(String jumpshot) {
		this.jumpshot = jumpshot;
	}

	public String getFreethrowshot() {
		return freethrowshot;
	}

	public void setFreethrowshot(String freethrowshot) {
		this.freethrowshot = freethrowshot;
	}

	public String getThreepointshot() {
		return threepointshot;
	}

	public void setThreepointshot(String threepointshot) {
		this.threepointshot = threepointshot;
	}

	public String getHandling() {
		return handling;
	}

	public void setHandling(String handling) {
		this.handling = handling;
	}

	public String getPassing() {
		return passing;
	}

	public void setPassing(String passing) {
		this.passing = passing;
	}

	public String getOffensiverebounding() {
		return offensiverebounding;
	}

	public void setOffensiverebounding(String offensiverebounding) {
		this.offensiverebounding = offensiverebounding;
	}

	public String getDefensiverebounding() {
		return defensiverebounding;
	}

	public void setDefensiverebounding(String defensiverebounding) {
		this.defensiverebounding = defensiverebounding;
	}

	public String getPostdefense() {
		return postdefense;
	}

	public void setPostdefense(String postdefense) {
		this.postdefense = postdefense;
	}

	public String getPerimeterdefense() {
		return perimeterdefense;
	}

	public void setPerimeterdefense(String perimeterdefense) {
		this.perimeterdefense = perimeterdefense;
	}

	public String getStealing() {
		return stealing;
	}

	public void setStealing(String stealing) {
		this.stealing = stealing;
	}

	public String getShotblocking() {
		return shotblocking;
	}

	public void setShotblocking(String shotblocking) {
		this.shotblocking = shotblocking;
	}

	public String getQuickness() {
		return quickness;
	}

	public void setQuickness(String quickness) {
		this.quickness = quickness;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getStamina() {
		return stamina;
	}

	public void setStamina(String stamina) {
		this.stamina = stamina;
	}

	public String getJumping() {
		return jumping;
	}

	public void setJumping(String jumping) {
		this.jumping = jumping;
	}

	public String getPot_inside() {
		return pot_inside;
	}

	public void setPot_inside(String pot_inside) {
		this.pot_inside = pot_inside;
	}

	public String getPot_jumpshot() {
		return pot_jumpshot;
	}

	public void setPot_jumpshot(String pot_jumpshot) {
		this.pot_jumpshot = pot_jumpshot;
	}

	public String getPot_freethrow() {
		return pot_freethrow;
	}

	public void setPot_freethrow(String pot_freethrow) {
		this.pot_freethrow = pot_freethrow;
	}

	public String getPot_3pshot() {
		return pot_3pshot;
	}

	public void setPot_3pshot(String pot_3pshot) {
		this.pot_3pshot = pot_3pshot;
	}

	public String getPot_handling() {
		return pot_handling;
	}

	public void setPot_handling(String pot_handling) {
		this.pot_handling = pot_handling;
	}

	public String getPot_passing() {
		return pot_passing;
	}

	public void setPot_passing(String pot_passing) {
		this.pot_passing = pot_passing;
	}

	public String getPot_orebounding() {
		return pot_orebounding;
	}

	public void setPot_orebounding(String pot_orebounding) {
		this.pot_orebounding = pot_orebounding;
	}

	public String getPot_drebounding() {
		return pot_drebounding;
	}

	public void setPot_drebounding(String pot_drebounding) {
		this.pot_drebounding = pot_drebounding;
	}

	public String getPot_postdefense() {
		return pot_postdefense;
	}

	public void setPot_postdefense(String pot_postdefense) {
		this.pot_postdefense = pot_postdefense;
	}

	public String getPot_perimeterdefense() {
		return pot_perimeterdefense;
	}

	public void setPot_perimeterdefense(String pot_perimeterdefense) {
		this.pot_perimeterdefense = pot_perimeterdefense;
	}

	public String getPot_stealing() {
		return pot_stealing;
	}

	public void setPot_stealing(String pot_stealing) {
		this.pot_stealing = pot_stealing;
	}

	public String getPot_blocking() {
		return pot_blocking;
	}

	public void setPot_blocking(String pot_blocking) {
		this.pot_blocking = pot_blocking;
	}

	public String getCurrentrating() {
		return currentrating;
	}

	public void setCurrentrating(String currentrating) {
		this.currentrating = currentrating;
	}

	public String getFuturerating() {
		return futurerating;
	}

	public void setFuturerating(String futurerating) {
		this.futurerating = futurerating;
	}

	public String getOverallrating() {
		return overallrating;
	}

	public void setOverallrating(String overallrating) {
		this.overallrating = overallrating;
	}

	public String getOverallpotential() {
		return overallpotential;
	}

	public void setOverallpotential(String overallpotential) {
		this.overallpotential = overallpotential;
	}

	public Integer getChampionships() {
		return championships;
	}

	public void setChampionships(Integer championships) {
		this.championships = championships;
	}

	public Integer getPlayerofgame() {
		return playerofgame;
	}

	public void setPlayerofgame(Integer playerofgame) {
		this.playerofgame = playerofgame;
	}

	public Integer getPlayerofweek() {
		return playerofweek;
	}

	public void setPlayerofweek(Integer playerofweek) {
		this.playerofweek = playerofweek;
	}

	public Integer getPlayerofmonth() {
		return playerofmonth;
	}

	public void setPlayerofmonth(Integer playerofmonth) {
		this.playerofmonth = playerofmonth;
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

	public Integer getContract6() {
		return contract6;
	}

	public void setContract6(Integer contract6) {
		this.contract6 = contract6;
	}

	public Integer getContract7() {
		return contract7;
	}

	public void setContract7(Integer contract7) {
		this.contract7 = contract7;
	}

	public Integer getContract8() {
		return contract8;
	}

	public void setContract8(Integer contract8) {
		this.contract8 = contract8;
	}

	public Integer getOptiontype1() {
		return optiontype1;
	}

	public void setOptiontype1(Integer optiontype1) {
		this.optiontype1 = optiontype1;
	}

	public Integer getOptiontype2() {
		return optiontype2;
	}

	public void setOptiontype2(Integer optiontype2) {
		this.optiontype2 = optiontype2;
	}

	public Integer getOptiontype3() {
		return optiontype3;
	}

	public void setOptiontype3(Integer optiontype3) {
		this.optiontype3 = optiontype3;
	}

	public Integer getOptiontype4() {
		return optiontype4;
	}

	public void setOptiontype4(Integer optiontype4) {
		this.optiontype4 = optiontype4;
	}

	public Integer getOptiontype5() {
		return optiontype5;
	}

	public void setOptiontype5(Integer optiontype5) {
		this.optiontype5 = optiontype5;
	}

	public Integer getOptiontype6() {
		return optiontype6;
	}

	public void setOptiontype6(Integer optiontype6) {
		this.optiontype6 = optiontype6;
	}

	public Integer getOptiontype7() {
		return optiontype7;
	}

	public void setOptiontype7(Integer optiontype7) {
		this.optiontype7 = optiontype7;
	}

	public Integer getOptiontype8() {
		return optiontype8;
	}

	public void setOptiontype8(Integer optiontype8) {
		this.optiontype8 = optiontype8;
	}

	public Integer getBirdyears() {
		return birdyears;
	}

	public void setBirdyears(Integer birdyears) {
		this.birdyears = birdyears;
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
		Player other = (Player) obj;
		return Objects.equals(id, other.id);
	}

}
