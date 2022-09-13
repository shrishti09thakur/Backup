package com.springboot.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.mindtree.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
