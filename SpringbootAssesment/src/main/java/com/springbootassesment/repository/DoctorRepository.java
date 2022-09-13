package com.springbootassesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootassesment.java.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

}
