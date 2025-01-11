package OopsProgrammingTask2;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public double calcTax() {
		return salary * Taxable.INCOME_TAX;
	}
	
	public String toString() {
		return  "Employee ID: " + empId + ", Name: " + name + ", Yearly Salary: " + salary;
	}
	
	
}
