package com.springbootassesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootassesment.java.Hospital;
import com.springbootassesment.service.HospitalService;
@RestController
@RequestMapping("/hospital")
public class HospitalController {
	@Autowired
	private HospitalService hospitalService;

	public HospitalController(HospitalService hospitalService) {
		super();
		this.hospitalService = hospitalService;
	}
	@PostMapping
	public ResponseEntity<Hospital> saveHospital(@RequestBody Hospital hospital){
		return new ResponseEntity<Hospital>(hospitalService.saveHospital(hospital),HttpStatus.CREATED) ;
	}


}
