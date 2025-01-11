package OopsProgrammingTask2;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Get employee information
		
        System.out.println("Enter Employee ID: ");
        int empId = scan.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = scan.next();
        System.out.println("Enter Employee Yearly Salary: ");
        double salary = scan.nextDouble();
        
        Employee emp = new Employee(empId,name,salary);
        System.out.println(emp);
        System.out.println("Income Tax: "+ emp.calcTax());
        
        // Get product information
        
        System.out.println("Enter Product ID: ");
        int pid = scan.nextInt();
        System.out.println("Enter Product Unit Price: ");
        double price = scan.nextDouble();
        System.out.println("Enter Product Quantity: ");
        int quantity = scan.nextInt();
        
        Product product = new Product(pid,price,quantity);
        System.out.println(product);
        System.out.println("Sales Tax per unit: "+ product.calcTax());
        
        
        scan.close();
		
		
	}

}
