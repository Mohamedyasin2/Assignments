package class_assignments;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();// User input
		int factorial =1;// Store multiplication value
		for(int i =1;i<=num;i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		scan.close();
	}

}
