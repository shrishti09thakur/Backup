package com.springboot.mindtree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vechile")
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id ;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="typeofvehc")
	private String typesofvehc;
	@Column(name="state")
	private String state;
	@Column(name="city")
	private String city;
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
	public String getTypesofvehc() {
		return typesofvehc;
	}
	public void setTypesofvehc(String typesofvehc) {
		this.typesofvehc = typesofvehc;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Vehicle(long id, String name, String typesofvehc, String state, String city) {
		super();
		this.id = id;
		this.name = name;
		this.typesofvehc = typesofvehc;
		this.state = state;
		this.city = city;
	}
	public Vehicle() {
		super();
	}
	

}
