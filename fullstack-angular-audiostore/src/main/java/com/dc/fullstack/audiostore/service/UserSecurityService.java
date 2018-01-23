package com.dc.fullstack.audiostore.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dc.fullstack.audiostore.domain.security.User;

@Service
public class UserSecurityService implements UserDetailsService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserSecurityService.class);

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(userName);
		
		if(null == user){
			LOGGER.warn(" Username {} not found ", userName);
			throw new UsernameNotFoundException("Username "+userName + " not found ");
		}
		return user;
	}

}
