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

import com.springboot.mindtree.entity.Doctor;
import com.springboot.mindtree.exception.ResourceNotFoundException;
import com.springboot.mindtree.repository.DoctorRepository;

@RestController
@RequestMapping("/api")
public class DoctorController {
	@Autowired
	private DoctorRepository doctorRepository;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/doctor")
	public List<Doctor> getAllDoctor(){
		return doctorRepository.findAll();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/doctor")
	public Doctor createCustomer(@RequestBody Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/doctor/{id}")
	public ResponseEntity<Doctor> getCustomerById(@PathVariable Long id){
		Doctor doctor=doctorRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Doctor Getmapping is incorrect:"+id));
		return ResponseEntity.ok(doctor);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/doctor/{id}")
	public ResponseEntity<Doctor> updateDoctor(@PathVariable Long id,@RequestBody Doctor doctorDetails){
		Doctor doctor=doctorRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Doctor update is incorrect:"+id));
		doctor.setName(doctorDetails.getName());
		doctor.setGender(doctorDetails.getGender());
		doctor.setSpecialistfields(doctorDetails.getSpecialistfields());
		Doctor updateDoctor=doctorRepository.save(doctor);
		return ResponseEntity.ok(updateDoctor);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/doctor/{id}")
	public ResponseEntity<Map<String,Boolean>>deleteDoctor(@PathVariable Long id){
		Doctor doctor=doctorRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Doctor Delete is incorrect:"+id));
		doctorRepository.delete(doctor);
		Map<String,Boolean> response=new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);


		

	}


}
