package OopsTask2;

public class Product {
	
	int pid;
	double price;
	int quantity;
	
	public Product(int pid,double price,int quantity) {
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	// This method is used for get pid of the product
	public int getpid() {
		return pid;
	}
	
	// This method is used for get price of the product
	public double getprice() {
		return price;
	}
	
	// This method is used for get quantity of the product
	public int getquantity() {
		return quantity;
	}
	
	// Display the product details
	public void display() {
		System.out.println("Product ID: "+pid);
		System.out.println("Product Price: "+price);
		System.out.println("Product Quantity: "+quantity);
	}
}
