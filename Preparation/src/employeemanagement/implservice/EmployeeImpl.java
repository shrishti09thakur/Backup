package employeemanagement.implservice;

import java.util.ArrayList;
import java.util.Collections;

import employeemanagement.entity.EmployeeManagement;
import employeemanagement.namecomparator.NameComparable;
import employeemanagement1.service.EmployeeService;

public class EmployeeImpl implements EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayallEmployee(ArrayList<EmployeeManagement> all) {
		// TODO Auto-generated method stub
		for(int i=0;i<all.size();i++) {
			System.out.println(all.get(i).getId()+" "+all.get(i).getName()+" "+all.get(i).getSalary()+" "+all.get(i).getAge());
		}
		
	}

	@Override
	public void disployeeallEmployeeDesc(ArrayList<EmployeeManagement> all) {
		// TODO Auto-generated method stub
		Collections.sort(all, new NameComparable());
		for(int i=0; i<all.size();i++) {
			System.out.println(all.get(i).getId()+" "+all.get(i).getName()+" "+all.get(i).getSalary()+" "+all.get(i).getAge());	
		}
	}

	@Override
	public void updateEmployeeSalary(ArrayList<EmployeeManagement> all, int id, int salary) {
		// TODO Auto-generated method stub
		for(int i=0;i<all.size();i++) {
			if(all.get(i).getId()==id) {
				all.get(i).setSalary(salary);
			}
		}
		for(int j=0;j<all.size();j++) {
		System.out.println(all.get(j).getId()+" "+all.get(j).getName()+" "+all.get(j).getSalary()+" "+all.get(j).getAge());
		}
	}

}
