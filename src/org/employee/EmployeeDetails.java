package org.employee;

public class EmployeeDetails { // block or body of the class
	
	// private - access specifier
	// void    - return type
	// empName - method name
	// ()      - arguments place / input / parameter place
	// {}      - block or body of the method
	private void empName() {
		// implementation or business logic
		// "" - double quote - String : predefinded class
		System.out.println("Employee name : Anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile : 7200983432");
	}
	
	private void empAdd() {
		System.out.println("emp add: Anna nagar");
	}
	private void empId() {
		System.out.println("emp id : 111");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> 06c6373c1735c6bf44c93636d407bc92d97ed6fb

	
	// main method
	public static void main(String[] args) {
		
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
		e.empMobile();
		
	}
	
	

}
