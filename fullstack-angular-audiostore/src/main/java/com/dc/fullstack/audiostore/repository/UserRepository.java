package com.dc.fullstack.audiostore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dc.fullstack.audiostore.domain.security.User;

public interface UserRepository extends CrudRepository<User	, Long>{
	User findByUsername(String name);
	User findByEmail(String email);
	List<User> findAll();
}
