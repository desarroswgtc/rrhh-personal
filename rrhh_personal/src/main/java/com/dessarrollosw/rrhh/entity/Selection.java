package com.dessarrollosw.rrhh.entity;

import javax.persistence.Entity;

@Entity
public class Selection extends Personal {

	
	private String puesto;
	
	public Selection() {
		
	}
	
	public Selection(String nif, String firstName, String lastName, String region,
			String puesto) {
		
		super(nif,firstName,lastName,region);
		this.puesto = puesto;
		
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
	
	
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
}
