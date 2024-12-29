package class_assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		int input = 121;
		int reverse =0;//Initialize a reverse 
		
		while(input !=0) {
			int remainder = input%10; // It stores a remainder
			reverse = reverse*10 + remainder;
			input =input/10; // To get another digit
		}
		if(input == reverse) {
			System.out.println("Given number is palindrome");
		}
		else {
			System.out.println("Given number is not palindrome");
		}
	}

}
