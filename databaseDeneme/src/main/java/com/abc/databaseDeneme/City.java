package com.abc.databaseDeneme;


import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {
	@Id
	@Column(name = "ID")//veritabanındaki ismi
	private int ID;
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "CountryCode")
	private String CountryCode;
	
	@Column(name = "District")
	private String District;
	
	@Column(name = "Population")
	private int Population;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public int getPopulation() {
		return Population;
	}

	public void setPopulation(int population) {
		Population = population;
	}
	

	
}
