package com.app;
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Amount:");
		int amount = scan.nextInt();
		int result;
		
		if(amount<500){
			System.out.println("No discount is applied: "+amount);	
		}
		else if(amount>=500 && amount<=1000){
			result = (amount*10)/100;
			System.out.println("10% discount is applied: "+(amount-result));
			
		}
		else if(amount>1000){
			result = (amount*20)/100;
			System.out.println("20% discount is applied: "+(amount-result));
		}
	}

}
