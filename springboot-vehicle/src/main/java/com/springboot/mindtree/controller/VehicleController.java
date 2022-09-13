package com.springboot.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mindtree.model.Vehicle;
import com.springboot.mindtree.repository.VehcileRepository;
@RestController
@RequestMapping("/api")
public class VehicleController {
	@Autowired
	private VehcileRepository vehicleRepository;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/vehicle")
	public List<Vehicle> getAllVehicle(){
		return vehicleRepository.findAll();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/vehicle")
	public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

}
