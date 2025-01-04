package OopsTask2;
import java.util.Scanner;

public class Main {
	
	// Calculate total amount spent on all product
	public static double calculateTotalAmount(Product[] product) {
		double totalAmount = 0;
		for(Product products:product) {
			totalAmount = totalAmount+products.getprice()*products.getquantity();
		}
		return totalAmount;
	}

	// main method
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);// get input
		
		Product[] product = new Product[5];// create array and set array size
		
		// This loop is used for get information about product
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter the product details "+(i+1)+":");
			
			System.out.print("Enter Product ID: ");
			int pid = scan.nextInt();
			
			System.out.print("Enter Product Price: ");
			double price = scan.nextDouble();
			
			System.out.print("Enter Product Quantity: ");
			int quantity = scan.nextInt();
			
			product[i]=new Product(pid,price,quantity);
		}
		
		// Display products
		System.out.println("Product details:");
		for(int j=0;j<product.length;j++){
			
			product[j].display();
			
		}
		
		//Get highest price of product 
		Product highestPrice = product[0];
		for(int k=1;k<product.length;k++) {
			if(product[k].getprice() > highestPrice.getprice()) {
				highestPrice = product[k];
			}
		}
		
		System.out.println("Highest price product: ");
		highestPrice.display();
		
		//Display total amount spent on all products
		double totalAmount =Main.calculateTotalAmount(product);
        System.out.println("Total Amount Spent on All Products: "+totalAmount);
        
		scan.close();
		
	}

}
