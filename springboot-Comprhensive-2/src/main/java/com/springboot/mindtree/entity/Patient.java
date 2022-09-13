package com.springboot.mindtree.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private String age;
	@Column(name="visiteddoctor")
	private String visiteddoctor;
	@Column(name="dateofvisit")
	private String dateofvisit;
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getVisiteddoctor() {
		return visiteddoctor;
	}
	public void setVisiteddoctor(String visiteddoctor) {
		this.visiteddoctor = visiteddoctor;
	}
	public String getDateofvisit() {
		return dateofvisit;
	}
	public void setDateofvisit(String dateofvisit) {
		this.dateofvisit = dateofvisit;
	}
	
	
	public Patient(long id, String name, String age, String visiteddoctor, String dateofvisit) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
		this.visiteddoctor = visiteddoctor;
		this.dateofvisit = dateofvisit;
		
	}
	public Patient() {
		super();
	}

}
