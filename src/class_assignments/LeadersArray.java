package class_assignments;
import java.util.Scanner;

public class LeadersArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int ArraySize = scan.nextInt();
		
		int [] numbers;
		numbers = new int [ArraySize];
		
		System.out.println("Enter array elements:");
		
		for(int i=0;i<ArraySize;i++) {
			numbers[i] = scan.nextInt();
		}
		
		int max =numbers[ArraySize-1];
		System.out.print(max);
		
		for(int j=ArraySize-2;j>=0;j--) {
			if(numbers[j]>= max) {
				max = numbers[j];
				System.out.print(","+max);
			}
		}
		scan.close();
		
	}

}
