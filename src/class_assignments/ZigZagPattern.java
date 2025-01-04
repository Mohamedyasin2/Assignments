package class_assignments;
import java.util.Scanner;
import java.util.Random;

public class ZigZagPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		int [] arr;
		arr = new int[num];
		
		Random random = new Random();
		
		int k=0;
		boolean alreadyPrinted = false;
		
		while(k>num) {
			
			int r = random.nextInt(1,num);
			
			arr[k]=r;
			
			for(int j=1;j<arr.length;j++) {
				if(arr[k]==arr[j]) {
					alreadyPrinted=true;
					break;
				}
			}
			if(!alreadyPrinted) {
				k++;
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		scan.close();
	}
	
}

