package OopsTask3;

public class Account {
	
	double Balance; // Initial balance
	String accountHolder; // Account holder name
	
	// Constructor with no arguments
	public Account() {
		
		this.Balance=0.00;
		this.accountHolder="Unknown";
		
	}
	
	//Constructor with two arguments
	public Account(String accountHolder,double Balance) {
		
		this.accountHolder=accountHolder;
		if(Balance>=0) {
			this.Balance=Balance;
		}
		else {
			System.out.println("Initial balance cannot be in negative. Setting up balance to 0.");
		}
		
	}
	
	// Method for deposit process
	public void deposit(double amount) {
		
		if(amount >0){
			Balance = Balance + amount;
			System.out.println("Deposited: "+amount+" Current balance: "+Balance);
		}
		else {
			System.out.println("Invalid deposit amount. Please enter positive value");
		}
		
	}
	
	// Method for withdraw process
	public void withdraw(double amount) {
		
		if(amount>0 && amount <= Balance) {
			Balance = Balance - amount;
			System.out.println("Withdraw: "+amount+" Current balance: "+Balance);
		}
		else {
			System.out.println("Insufficient balance!");
		}
		
	}
	
	// Method to display 
	public void display() {
		System.out.println("Account holder name: "+accountHolder);
		System.out.println("Current balance: "+Balance);
	}
	
}
