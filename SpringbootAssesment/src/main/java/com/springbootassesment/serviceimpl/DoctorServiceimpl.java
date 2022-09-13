package com.springbootassesment.serviceimpl;

import org.springframework.stereotype.Service;
import com.springbootassesment.java.Doctor;
import com.springbootassesment.repository.DoctorRepository;
import com.springbootassesment.service.DoctorService;
@Service

public class DoctorServiceimpl implements DoctorService {
       private DoctorRepository doctorRepository;
	public DoctorServiceimpl(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

}
