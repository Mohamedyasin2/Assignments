package class_assignments;
import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows = scan.nextInt();
		
		System.out.print("Enter number of columns: ");
		int cols = scan.nextInt();
		
		int matrix[][] = new int[rows][cols];
		int transpose[][] =new int [cols][rows];
		
//		Input matrix
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=scan.nextInt();
			}
		}
		
//		Print Input matrix
		System.out.println("Input Matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose matrix:");
		
//		Transpose matrix
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				transpose[j][i]=matrix[i][j];
			}
		}
		
		for(int[] r:transpose) {
			System.out.println(Arrays.toString(r));
		}
		
		scan.close();
	}

}
