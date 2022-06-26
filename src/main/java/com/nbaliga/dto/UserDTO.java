package com.nbaliga.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.nbaliga.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private TeamDTO teamDTO;

	Set<RoleDTO> roles = new HashSet<>();

	public UserDTO() {
	}

	public UserDTO(Long id, String name, TeamDTO teamDTO) {
		super();
		this.id = id;
		this.name = name;
		this.teamDTO = teamDTO;
	}

	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		teamDTO = new TeamDTO(entity.getTeam());
	}

	public Set<RoleDTO> getRoles() {
		return roles;
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

	public TeamDTO getTeamDTO() {
		return teamDTO;
	}

	public void setTeamDTO(TeamDTO teamDTO) {
		this.teamDTO = teamDTO;
	}

}
