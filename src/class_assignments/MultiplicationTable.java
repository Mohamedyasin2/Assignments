package class_assignments;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the tables number: ");
		int num = scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		scan.close();
		
	}

}
