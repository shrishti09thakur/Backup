package com.springboot.mindtree;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.mindtree.entity.Doctor;
import com.springboot.mindtree.repository.DoctorRepository;


@SpringBootTest
class SpringbootComprhensiveApplicationTests {
	@Autowired
    DoctorRepository docrepo;
	@Test
	public void contextLoads() {
		Doctor doc=new Doctor();
		doc.setId(1L);
		doc.setName("Dipti");
		doc.setAge("12");
		doc.setGender("female");
		doc.setPatientattended(1);
		doc.setSpecialistfields("Lungs");
		docrepo.save(doc);
		assertNotNull(docrepo.findById(2L).get());
		
	}
	private void assertNotNull(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testReadAll() {
		List<Doctor> list=docrepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void deleteeDoctor() {
		docrepo.deleteById(12L);
		assertThat(docrepo.existsById(12L)).isFalse();
		
	}


}
