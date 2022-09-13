package com.springbootassesment.service;

import org.springframework.stereotype.Service;

import com.springbootassesment.java.Hospital;
@Service
public interface HospitalService {
	Hospital saveHospital(Hospital hospital);

}
