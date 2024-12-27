package com.app;

import java.util.Scanner;

public class Smallestnumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number 1:");
		int num1 = scan.nextInt();
		System.out.print("Enter Number 2:");
		int num2 = scan.nextInt();
		System.out.print("Enter Number 3:");
		int num3 = scan.nextInt();	
		
		if(num1>num2 && num1>num3) {
			System.out.println("Number1 is greater.");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("Number2 is greater.");
		}
		else if(num3>num1 && num3>num2) {
			System.out.println("Number3 is greater.");
		}
		else if(num1==num2 && num1==num3){
			System.out.println("All numbers are equal.");
		}
		else if(num1==num2 && num1>num3){
			System.out.println("Number 1 and Number 2 are equal and greater than Number 3.");
		}
		else if(num2==num3 && num2>num1){
			System.out.println("Number 2 and Number 3 are equal and greater than Number 1.");
		}
		else if(num3==num1 && num3>num2){
			System.out.println("Number 1 and Number 3 are equal and greater than Number 2.");
		}
		scan.close();
		
	}

}
