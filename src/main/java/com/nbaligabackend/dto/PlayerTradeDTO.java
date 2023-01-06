package com.nbaligabackend.dto;

import java.io.Serializable;

import com.nbaligabackend.entities.Player;

public class PlayerTradeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String firstname;
	private String lastname;
	private Integer currentteamid;
	private Integer conractteamid;
	private String currentrating;
	private String futurerating;
	private Integer contract1;
	private Integer contract2;
	private Integer contract3;
	private Integer contract4;
	private Integer contract5;

	public PlayerTradeDTO() {
	}

	public PlayerTradeDTO(Long id, String firstname, String lastname, Integer currentteamid, Integer conractteamid,
			String currentrating, String futurerating, Integer contract1, Integer contract2, Integer contract3,
			Integer contract4, Integer contract5) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.currentteamid = currentteamid;
		this.conractteamid = conractteamid;
		this.currentrating = currentrating;
		this.futurerating = futurerating;
		this.contract1 = contract1;
		this.contract2 = contract2;
		this.contract3 = contract3;
		this.contract4 = contract4;
		this.contract5 = contract5;
	}

	public PlayerTradeDTO(Player entity) {
		id = entity.getId();
		firstname = entity.getFirstname();
		lastname = entity.getLastname();
		currentteamid = entity.getCurrentteamid();
		conractteamid = entity.getContractteamid();
		currentrating = entity.getCurrentrating();
		futurerating = entity.getFuturerating();
		contract1 = entity.getContract1();
		contract2 = entity.getContract2();
		contract3 = entity.getContract3();
		contract4 = entity.getContract4();
		contract5 = entity.getContract5();

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

	public Integer getCurrentteamid() {
		return currentteamid;
	}

	public void setCurrentteamid(Integer currentteamid) {
		this.currentteamid = currentteamid;
	}

	public Integer getConractteamid() {
		return conractteamid;
	}

	public void setConractteamid(Integer conractteamid) {
		this.conractteamid = conractteamid;
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

}
