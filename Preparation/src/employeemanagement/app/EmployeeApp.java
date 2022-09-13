package employeemanagement.app;

import java.util.ArrayList;
import java.util.Scanner;

import employeemanagement.entity.EmployeeManagement;
import employeemanagement.implservice.EmployeeImpl;

public class EmployeeApp {

	private static final int choice = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		EmployeeImpl ep = new EmployeeImpl();
		ArrayList<EmployeeManagement>em= new ArrayList<EmployeeManagement>();
		EmployeeManagement E1= new EmployeeManagement(1,"Lily",18,25000);
		EmployeeManagement E2= new EmployeeManagement(2,"Juli",19,20000);
		EmployeeManagement E3= new EmployeeManagement(3,"Mily",18,10000);
		EmployeeManagement E4= new EmployeeManagement(4,"Rani",20,50000);
		EmployeeManagement E5= new EmployeeManagement(5,"Sitara",17,5000);
		EmployeeManagement E6= new EmployeeManagement(6,"Tara",25,8000);
		EmployeeManagement E7= new EmployeeManagement(7,"Sara",23,20000);
		EmployeeManagement E8= new EmployeeManagement(8,"Raj",24,15000);
		EmployeeManagement E9= new EmployeeManagement(9,"Abhi",23,60000);
		EmployeeManagement E10= new EmployeeManagement(10,"Subh",20,30000);
		
		em.add(E1);
		em.add(E2);
		em.add(E3);
		em.add(E4);
		em.add(E5);
		em.add(E6);
		em.add(E7);
		em.add(E8);
		em.add(E9);
		em.add(E10);
		int choice=0;
		
		while(true) {
		System.out.println("1.Display all Employee Detail");
		System.out.println("2.Display all Employee in Desending Order");
		System.out.println("3.Update the Salary");
		System.out.println("4.Exit");
		
		System.out.println("Please Select The Choice");
		try{
			
			choice = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Your Choice is Wrong");	
		}
		switch(choice) {
		
		case 1:
			ep.displayallEmployee(em);
			break;
			
		case 2:
			ep.disployeeallEmployeeDesc(em);
			break;
			
		case 3:
			System.out.println("Enter the Id of Employee you want to update Salary");
			int updatedId=sc.nextInt();
			System.out.println("Enter the Salary you want to update");
			int updateSalary= sc.nextInt();
			ep.updateEmployeeSalary(em, updatedId, updateSalary);
			break;
		case 4:
			System.exit(0);
			
			default :
				System.out.println("Invalid Choice");
		}

	}

}
}
