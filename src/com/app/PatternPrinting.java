package com.app;

public class PatternPrinting {

	public static void main(String[] args) {
		 int k = 5; // Starting value for the pattern

	        for (int i = 0; i < k; i++) {
	            // Print decreasing numbers from k to (k - i)
	            for (int j = k; j > k - i; j--) {
	                System.out.print(j);
	            }

	            // Print constant numbers (k - i) to fill the row
	            for (int j = 0; j < k - i; j++) {
	                System.out.print(k - i);
	            }

	            // Move to the next line after each row
	            System.out.println();
	        }
	}

}
