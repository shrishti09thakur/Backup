package com.springboot.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.mindtree.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long>{

}
