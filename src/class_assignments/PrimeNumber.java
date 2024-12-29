package class_assignments;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();// User input
		int count =0;// Count divisble
		
		if(num>1) {
			for(int i =1;i<=num;i++) {
				if(num %i== 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println("Given number is prime.");
			}
			else {
				System.out.println("Given number is not prime.");
			}
		}
		else {
			System.out.println("Invalid input!");
		}
		scan.close();
		
	}

}
