package com.springbootassesment.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springbootassesment.java.Hospital;
import com.springbootassesment.repository.HospitalRepository;
import com.springbootassesment.service.HospitalService;
@Service
@Component
public class HospitalServiceimpl implements HospitalService{
	@Autowired
     private HospitalRepository hospitalRepository;
     
     public HospitalServiceimpl(HospitalRepository hospitalRepository) {
	super();
	this.hospitalRepository = hospitalRepository;
	}
	@Override
	public Hospital saveHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		return hospitalRepository.save(hospital);
	}
	

}
