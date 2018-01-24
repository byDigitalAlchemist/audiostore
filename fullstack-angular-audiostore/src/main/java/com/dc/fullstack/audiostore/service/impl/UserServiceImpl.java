package com.dc.fullstack.audiostore.service.impl;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dc.fullstack.audiostore.domain.security.User;
import com.dc.fullstack.audiostore.domain.security.UserRole;
import com.dc.fullstack.audiostore.repository.RoleRepository;
import com.dc.fullstack.audiostore.repository.UserRepository;
import com.dc.fullstack.audiostore.service.UserService;

public class UserServiceImpl implements UserService{

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Transactional
	public User createUser(User user, Set<UserRole> roles){
		User localUser = userRepository.findByUsername(user.getUsername());
		
		if(localUser != null){
			LOGGER.info(" User with username {} already exist. Nothing will be done. ", user.getUsername());
		}
		else{
			for (UserRole userRole : roles) {
				roleRepository.save(userRole.getRole());
			}
			
			user.getUserRoles().addAll(roles);
			
			localUser = userRepository.save(user);
		}
		
		
		return localUser;
	}
	
	
}
