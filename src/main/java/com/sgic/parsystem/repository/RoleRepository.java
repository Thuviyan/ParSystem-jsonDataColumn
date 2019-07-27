package com.sgic.parsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.parsystem.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findRoleById(Integer id);
}
