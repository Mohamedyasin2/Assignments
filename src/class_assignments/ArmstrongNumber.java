package class_assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int copy = 0;// without affecting original value
		int digits =0;// count digits
		int sum=0; // Get total
		
//		 This loop is for count how many digits
		copy = num;
		while(copy !=0){
			int remainder = copy%10;
			digits++;
			copy =copy/10;
		}
		
//		This loop is for apply power to individual numbers and get total
		copy = num;
		while(copy!=0) {
			sum = (int) (sum+Math.pow(copy%10,digits));
			copy = copy/10;
		}
		
		if(sum == num) {
			System.out.println("Given number is Armstrong.");
		}
		else {
			System.out.println("Given number is not Armstrong");
		}
		
	}

}
