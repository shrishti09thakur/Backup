package com.springboot.mindtree.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mindtree.entity.Patient;
import com.springboot.mindtree.exception.ResourceNotFoundException;
import com.springboot.mindtree.repository.PatientRepository;

@RestController
@RequestMapping("/api")
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/patient")
	public List<Patient> getAllPatient(){
		return patientRepository.findAll();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/patient")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientRepository.save(patient);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/patient/{id}")
	public ResponseEntity<Patient> getPatientById(@PathVariable Long id){
		Patient patient=patientRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Doctor Getmapping is incorrect:"+id));
		return ResponseEntity.ok(patient);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/patient/{id}")
	public ResponseEntity<Patient> updatePatient(@PathVariable Long id,@RequestBody Patient patientDetails){
		Patient patient=patientRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Patient update is incorrect:"+id));
		patient.setName(patientDetails.getName());
		patient.setAge(patientDetails.getAge());
		patient.setId(patientDetails.getId());
		patient.setDateofvisit(patientDetails.getDateofvisit());
		patient.setVisiteddoctor(patientDetails.getVisiteddoctor());
		Patient updatePatient=patientRepository.save(patient);
		return ResponseEntity.ok(updatePatient);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/patient/{id}")
	public ResponseEntity<Map<String,Boolean>>deleteDoctor(@PathVariable Long id){
		Patient patient=patientRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Doctor Delete is incorrect:"+id));
		patientRepository.delete(patient);
		Map<String,Boolean> response=new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);


		

	}

}
