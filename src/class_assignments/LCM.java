package class_assignments;
import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = scan.nextInt();
				
		System.out.print("Enter second number: ");
		int num2 = scan.nextInt();
		
		int output;
		
		output = (num1 > num2)?num1:num2;
		
		while(true){
			if(output%num1 == 0 && output%num2 ==0) {
				System.out.println("LCM is: "+output);
				break;
			}
			++output;
		}
		
		scan.close();
	}

}
