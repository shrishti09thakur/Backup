package com.springbootassesment.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private long id;
	@Column(name="docname")
	private String name;
	@Column(name="specialist")
	private String specialist;
	public Doctor(long id, String name, String specialist, String yearsofexperience) {
		super();
		this.id = id;
		this.name = name;
		this.specialist = specialist;
		this.yearsofexperience = yearsofexperience;
	}
	public Doctor(){
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getYearsofexperience() {
		return yearsofexperience;
	}
	public void setYearsofexperience(String yearsofexperience) {
		this.yearsofexperience = yearsofexperience;
	}
	@Column(name="yearofexp")
	private String yearsofexperience;

}
