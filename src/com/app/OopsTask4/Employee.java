package com.app.OopsTask4;

public class Employee extends Person1 {
	
	int employeeID;
	int salary;
	
	public Employee(String name,int age,int employeeID, int salary) {
		
		super(name,age);
		this.employeeID = employeeID;
		this.salary = salary;
		
	}
	
	public void displaydetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("EmployeeID: "+employeeID);
		System.out.println("Salary: "+salary);
		
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee("Mohamed Yasin",23,1,20000);
		e.displaydetails();
	}

}
