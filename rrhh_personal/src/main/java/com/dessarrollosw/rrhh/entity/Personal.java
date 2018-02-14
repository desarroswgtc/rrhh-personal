package com.dessarrollosw.rrhh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nif;
	private String firstName;
	private String lastName;
	private String region;
	
	
	public Personal() {
		
	}
	
	public Personal(String nif,String firstName, String lastName, String region) {
		this.nif = nif;
		this.firstName = firstName;
		this.lastName = lastName;
		this.region = region;
	}
	
	
	public long getId() {
		return id;
	}
	
	public String getNIF() {
		return nif;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setNIF(String nif) {
		this.nif = nif;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	
}
