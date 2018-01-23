package com.dc.fullstack.audiostore.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.dc.fullstack.audiostore.domain.security.UserRole;

@Entity
public class Role implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Role(){}
	
	@Id
	private int roleId;
	private String name;
	private Set<UserRole> userRoles = new HashSet<>();

	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	

}
