package class_assignments;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = scan.nextInt();// Get input
		
		int count =0;// add that number if modulus equal to zero
		for(int i=1;i<num;i++) {
			if(num%i==0){
				count += i;
			}
		}
		if(num == count){
			System.out.println("Given number is perfect.");
		}
		else {
			System.out.println("Given number is not perfect.");
		}
		scan.close();
	}

}
