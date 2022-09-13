package com.springboot.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mindtree.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository <Customer,Long>{

}
