package class_assignments;

public class CountDigits {

	public static void main(String[] args) {
		int num =45678;
		int count =0; // To store digits
		while(num !=0) {
			int remainder = num%10; // Separate the given number
			count++;
			num =num/10; // Send the remaining number to remainder
		}
		System.out.println(count);
		
		
	}

}
