package com.springbootcollegestudents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springbootcollegestudents.model.Students;
import com.springbootcollegestudents.sevice.StudentsService;


@RestController
@RequestMapping("/students")
public class StudentsController {
	@Autowired
	private StudentsService studentsService;
	public StudentsController(StudentsService studentsService) {
		super();
		this.studentsService = studentsService;
	}
	@PostMapping()
    public ResponseEntity<Students> saveStudents(@RequestBody Students students){
		return new ResponseEntity<Students>(studentsService.SaveStudents(students),HttpStatus.CREATED);
   	 
    }
	@GetMapping
	public List<Students> getAllStudents(){
		return studentsService.getAllStudents();
	}
	//http://localhost:8030/api/1
	@GetMapping("{id}")
	public ResponseEntity<Students> getStudentsById(@PathVariable("id")long studentsid){
		return new ResponseEntity<Students>(studentsService.getStudentsById(studentsid),HttpStatus.OK);
		
		
	}
	
	@PutMapping("{id}")
		public ResponseEntity<Students> updateStudents(@PathVariable("id") long id ,@RequestBody Students students){
		return new ResponseEntity<Students>(studentsService.updateStudents(students, id),HttpStatus.OK);
	}
}
