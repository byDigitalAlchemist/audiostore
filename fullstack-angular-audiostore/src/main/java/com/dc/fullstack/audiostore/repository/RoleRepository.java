package com.dc.fullstack.audiostore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dc.fullstack.audiostore.domain.Role;
import com.dc.fullstack.audiostore.domain.security.User;

public interface RoleRepository extends CrudRepository<Role	, Long>{
	User findByUsername(String name);
	User findByEmail(String email);
	List<Role> findAll();
}
