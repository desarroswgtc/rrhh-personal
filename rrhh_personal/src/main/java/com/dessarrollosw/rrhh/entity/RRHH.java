package com.dessarrollosw.rrhh.entity;

import javax.persistence.Entity;

@Entity
public class RRHH extends User{

	private String email;
	
	public RRHH() {
		super();
	}
	
	public RRHH(String login, String pass, String role, String email) {
		super(login,pass, role);
		this.email = email;
	}
	
	/** Access **/
	/** Inherated **/
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
	
	@Override
	public void setPass(String pass) {
		 super.setPass(pass);
	}
	
	/** Native **/
	
	public String getEmail() {
		return email;
	}
	
	
	
}
