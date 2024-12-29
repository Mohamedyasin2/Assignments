package class_assignments;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter binary number: ");
		
		int binum = scan.nextInt();//To get binary number
		int cal =0;// For total
		int remainder;
		
			for(int i=0;i<=3;i++){
				remainder = binum%10;
				cal = cal+(int) (remainder*(Math.pow(2,i)));
				binum = binum/10;
			}
	
			System.out.println(cal);
			
			scan.close();
	}

}
