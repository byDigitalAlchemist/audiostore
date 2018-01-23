package com.dc.fullstack.audiostore.domain;

import java.io.Serializable;

import org.springframework.security.core.GrantedAuthority;


public class Authority implements GrantedAuthority, Serializable{

	private static final long serialVersionUID = 221481802441059465L;

	private final String authority; 
	
	public Authority(String authority) {
		super();
		this.authority = authority;
	}
	
	@Override
	public String getAuthority() {
		return this.authority;
	}

	
	
}
