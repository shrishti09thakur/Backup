package employeemanagement.namecomparator;

import java.util.Comparator;

import employeemanagement.entity.EmployeeManagement;

public class NameComparable implements Comparator<EmployeeManagement> {

	@Override
	public int compare(EmployeeManagement o1, EmployeeManagement o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

}
