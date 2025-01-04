package OopsTask3;

public class Main {

	public static void main(String[] args) {
		
		// Account number 1 for no argument constructor
		Account A1 = new Account();
		
		A1.deposit(500);
		A1.withdraw(300);
		A1.display();
		
		// Account number 2 for two arguments constructor
		Account A2 = new Account("Mohamed yasin", 1000);
		
		A2.deposit(600);
		A2.withdraw(400);
		A2.display();
	}

}
