package com.dessarrollosw.rrhh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String login;
	private String pass;
	private String role;
	
	public User() {
		
	}
	
	public User(String login, String pass, String role) {
		this.login = login;
		this.pass = pass;
		this.role = role;
	}
	
	/** Access **/
	
	public long getId() {
		return id;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getPass() {
		return pass;
	}
	
	public String getRole() {
		return role;
	}
	
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
