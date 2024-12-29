package class_assignments;
import java.util.Scanner;

public class GCDandLCM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number one: ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter number two: ");
		int num2 = scan.nextInt();
		
		int lcm;
		int gcd =0;
		
//		GCD calculation
//		output = (num1 < num2)?num1:num2;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD is: "+gcd);
		
		
//		LCM calculation
		
		lcm = (num1 > num2)?num1:num2;
		
		while(true){
			if(lcm%num1 == 0 && lcm%num2 ==0) {
				System.out.println("LCM is: "+lcm);
				break;
			}
			++lcm;
		
		scan.close();
		
		}
	}

}
