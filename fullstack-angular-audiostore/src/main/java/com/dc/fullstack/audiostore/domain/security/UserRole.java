package com.dc.fullstack.audiostore.domain.security;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dc.fullstack.audiostore.domain.Role;


@Entity
@Table(name="user_role")
public class UserRole implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long userRoleId;
	
	public UserRole(){};
	
	public UserRole(User user, Role role){
		this.user = user;
		this.role = role;
	};
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Role role;
	
	
	
	
}
