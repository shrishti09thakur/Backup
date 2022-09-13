package com.springbootcollegestudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcollegestudents.model.Students;


public interface StudentsRepository  extends JpaRepository<Students,Long> {
	

}
