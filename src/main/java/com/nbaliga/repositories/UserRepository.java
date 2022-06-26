package com.nbaliga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nbaliga.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
