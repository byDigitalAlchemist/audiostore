package com.dc.fullstack.audiostore.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dc.fullstack.audiostore.domain.security.User;
import com.dc.fullstack.audiostore.domain.security.UserRole;
import com.dc.fullstack.audiostore.repository.UserRepository;
import com.dc.fullstack.audiostore.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public User createUser(User user, Set<UserRole> roles){
		User localUser = userRepository.findByUsername(user.getUsername());
		return localUser;
	}
	
	
}
