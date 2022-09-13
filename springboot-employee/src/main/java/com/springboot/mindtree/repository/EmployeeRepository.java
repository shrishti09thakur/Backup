package com.springboot.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mindtree.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
