package com.nbaligabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nbaligabackend.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {


}
