package com.dessarrollosw.rrhh.entity;

import javax.persistence.Entity;

@Entity
public class Employee extends Personal {
	
	private String nif;
	private String dataBank;
	private String tlf;
	private String email;
	
	
	public Employee () {
		super ();
	}
	
	public Employee (String nif, String firstName, String lastName, String region
			, String dataBank , String tlf, String email) {
		super(nif,firstName,lastName,region);
		this.nif = nif;
		this.dataBank = dataBank;
		this.tlf = tlf;
		this.email = email;
	}
	
	@Override
	public long getId() {
		return super.getId();
	}
	
	@Override
	public String getNIF() {
		return super.getNIF();
	}
	
	@Override
	public String getFirstName() {
		return super.getFirstName();
	}
	
	
	@Override
	public String getLastName() {
		return super.getLastName();
	}
	
	@Override
	public String getRegion() {
		return super.getRegion();
	}
	
	
	public String getNif() {
		return nif;
	}
	

	public String getDataBank() {
		return dataBank;
	}
	
	public String getTlf() {
		return tlf;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public void setNIF(String nif) {
		super.setNIF(nif);
	}
	
	@Override
	public void setFirstName(String firstName) {
		super.setFirstName(firstName);
	}
	
	@Override
	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}
	
	@Override
	public void setRegion(String region) {
		super.setRegion(region);
	}
	
	
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public void setDataBank(String dataBank) {
		this.dataBank = dataBank;
	}
	
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
