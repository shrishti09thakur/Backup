package com.springboot.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.mindtree.model.Vehicle;

public interface VehcileRepository extends JpaRepository<Vehicle,Long> {

}
