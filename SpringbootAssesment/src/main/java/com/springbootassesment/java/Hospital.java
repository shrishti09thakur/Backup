package com.springbootassesment.java;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="hospital")
public class Hospital {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="hospname")
	private String name;
	@Column(name="lolcation")
	private String location;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="doc_fid",referencedColumnName="id")
	List<Doctor> doctor=new ArrayList<>();
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Doctor> getDoctor() {
		return doctor;
	}
	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}
	public Hospital(long id, String name, String location, List<Doctor> doctor) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.doctor = doctor;
	}
	public Hospital() {
		super();
	}

}
