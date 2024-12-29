package class_assignments;
import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter starting range: ");
		int StartinRange = scan.nextInt();
		
		System.out.print("Enter ending range: ");
		int EndingRange = scan.nextInt();
		
		int count=1;// All numbers are divisible by 1. So, initialize value with 1.
		
		for(int i=StartinRange;i<=EndingRange;i++) {// This loop is for generate range
			for(int j=2;j<=i;j++) {// this loop is for divide a current number
				if(i%j==0){
					count++;
				}
			}
			if(count == 2){
				System.out.println(i);
			}
			count =1;
		}
		scan.close();

	}

}
