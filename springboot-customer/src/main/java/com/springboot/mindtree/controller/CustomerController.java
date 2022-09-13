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

import com.springboot.mindtree.exception.ResourceNotFoundException;
import com.springboot.mindtree.model.Customer;
import com.springboot.mindtree.repository.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private CustomerRepository customerrepository;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/customer")
	public List<Customer> getAllCustomer(){
		return customerrepository.findAll();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerrepository.save(customer);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id){
		Customer customer=customerrepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Customer not exisit with id:"+id));
		return ResponseEntity.ok(customer);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/customer/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable Long id,@RequestBody Customer customerDetails){
		Customer customer=customerrepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Customer not exisit with id:"+id));
		customer.setName(customerDetails.getName());
		customer.setAge(customerDetails.getAge());
		customer.setGender(customerDetails.getGender());
		customer.setHobbies(customerDetails.getHobbies());
		customer.setAddress(customerDetails.getAddress());
		Customer updateCustomer=customerrepository.save(customer);
		return ResponseEntity.ok(updateCustomer);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<Map<String,Boolean>>deleteCustomer(@PathVariable Long id){
		Customer customer=customerrepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Customer not exisit with id:"+id));
		customerrepository.delete(customer);
		Map<String,Boolean> response=new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);


		

	}

}
