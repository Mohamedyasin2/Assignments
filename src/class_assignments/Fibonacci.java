package class_assignments;

public class Fibonacci {

	public static void main(String[] args) {
		int input = 5;
		int firstValue =0;// Intiate first value
		int secondValue =1;// Intiate second value
		int nextValue = 0;
		for(int i=0;i<input;i++){
			System.out.print(firstValue+", ");
			nextValue = firstValue + secondValue;
			firstValue = secondValue;// swap first value as second value
			secondValue =nextValue;// swap third value as second value for to get fourth value
		}
		
	}

}
