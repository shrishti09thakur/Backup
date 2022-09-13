package employeemanagement1.service;
import java.lang.reflect.Array;
import java.util.ArrayList;

import employeemanagement.entity.EmployeeManagement;

public interface EmployeeService {
	void displayallEmployee(ArrayList<EmployeeManagement>all);
	void disployeeallEmployeeDesc(ArrayList<EmployeeManagement>all);
	void updateEmployeeSalary(ArrayList<EmployeeManagement>all , int id, int salary);

}
