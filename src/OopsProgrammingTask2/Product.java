package OopsProgrammingTask2;

public class Product {
	private int pid;
	private double price;
	private int quantity;
	
	public Product(int pid, double price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double calcTax() {
		return price * Taxable.SALES_TAX;
	}
	
	public String toString() {
        return "Product ID: " + pid + ", Unit Price: " + price + ", Quantity: " + quantity;
    }
}
