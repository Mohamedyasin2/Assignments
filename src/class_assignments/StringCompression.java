package class_assignments;
import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String givenString = scan.nextLine();
		int count=0;
		
		for(int i=0;i<givenString.length();i++) {// This loop for separate string
			for(int j=0;j<givenString.length();j++) {// This loop find repeated string
				if(givenString.charAt(i)==givenString.charAt(j)) {
					count++;
				}
			}
			boolean alreadyPrinted = false;
			for(int k=0;k<i;k++) {
				if(givenString.charAt(i) == givenString.charAt(k)) {
					alreadyPrinted = true;
					break;
				}
			}
			if(!alreadyPrinted) {
				System.out.print(givenString.charAt(i)+count);
			}
			count=0;
		
		}
		scan.close();
	}
}
