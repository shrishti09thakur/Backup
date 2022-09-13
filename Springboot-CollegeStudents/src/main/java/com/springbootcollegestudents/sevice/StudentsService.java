package com.springbootcollegestudents.sevice;

import java.util.List;


import com.springbootcollegestudents.model.Students;

public interface StudentsService {
	Students SaveStudents(Students students);
	List<Students> getAllStudents();
	Students getStudentsById(long id);
	Students updateStudents(Students students,long id);

}
