package com.nbaliga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nbaliga.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
