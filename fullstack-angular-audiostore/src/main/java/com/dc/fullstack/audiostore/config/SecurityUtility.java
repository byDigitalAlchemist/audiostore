package com.dc.fullstack.audiostore.config;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SecurityUtility {

	private static final String SALT = "namak";
	
	@Bean
	public static BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder(12, new SecureRandom(SALT.getBytes()));
	}
	
	@Bean
	public static String randomPassword(){
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder saltBuilder = new StringBuilder();
		Random rnd = new Random();
		while (saltBuilder.length() < 18) {
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			saltBuilder.append(SALTCHARS.charAt(index));
		}
		
		String saltString = saltBuilder.toString();
		return saltString;
	}
}
