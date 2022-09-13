package com.springbootcollegestudents.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.springbootcollegestudents.exception.ResourceNotFoundException;
import com.springbootcollegestudents.model.Students;
import com.springbootcollegestudents.repository.StudentsRepository;
import com.springbootcollegestudents.sevice.StudentsService;

public class StudentsServiceImpl implements StudentsService {
	private StudentsRepository studentsRepository;


	@Override
	public Students SaveStudents(Students students) {
		// TODO Auto-generated method stub
		return studentsRepository.save(students);
	}

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return studentsRepository.findAll();
	}

	@Override
	public Students getStudentsById(long id) {
		// TODO Auto-generated method stub
		Optional<Students> students=studentsRepository.findById(id);
		if(students.isPresent()) {
			return students.get();
		}
		else {
			throw new ResourceNotFoundException("Employee","Id",id);
		}
	}


	@Override
	public Students updateStudents(Students students, long id) {
		// TODO Auto-generated method stub
		Students existingStudents=studentsRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Students","Id",id));
		existingStudents.setName(students.getName());
		existingStudents.setAge(students.getAge());
		existingStudents.setGender(students.getGender());
		studentsRepository.save(existingStudents);
		return existingStudents;
	
	}

}
