package com.sgic.parsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.parsystem.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findUserById(Integer userid);
}
