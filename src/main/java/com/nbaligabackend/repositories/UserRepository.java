package com.nbaligabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nbaligabackend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
