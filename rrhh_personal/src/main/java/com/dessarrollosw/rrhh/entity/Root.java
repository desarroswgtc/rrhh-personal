package com.dessarrollosw.rrhh.entity;

import javax.persistence.Entity;

@Entity
public class Root extends User {

	public Root() {
		super();
	}
	
	public Root(String login, String pass, String role) {
		super(login,pass,role);
	}
	
	/** Access **/
	
	@Override
	public long getId() {
		return super.getId();
	}
	
	@Override
	public String getLogin() {
		return super.getLogin();
	}
	
	@Override
	public String getPass() {
		return super.getPass();
	}
	
	@Override
	public String getRole() {
		return super.getRole();
	}
	
}
