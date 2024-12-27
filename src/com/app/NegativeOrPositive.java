package com.app;

import java.util.Scanner;

public class NegativeOrPositive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int number = scan.nextInt();
		
		if(number>=0) {
			System.out.println("Given number is positive");
		}
		else {
			System.out.println("Given number is negative");
		}
		scan.close();
	}


}
