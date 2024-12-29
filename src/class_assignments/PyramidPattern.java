package class_assignments;
import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the height of pyramid: ");
		int height =scan.nextInt();
		
		for(int i=1;i<=height;i++) {// This loop is for height of the pyramid
			for(int j=1;j<=height-i;j++) {// This loop is for space (common difference = j=j+i)
				System.out.print(" ");
			}
				for(int k=1;k<=2*i-1;k++) {// This loop is for star printing
					System.out.print("*");
				}
				System.out.println();
			}
		
		scan.close();
	}

}
