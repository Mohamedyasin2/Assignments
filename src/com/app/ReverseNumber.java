package com.app;

public class ReverseNumber {

	public static void main(String[] args) {
		int input = 876;
		int reverse =0;//Initialize a reverse 
		
		while(input !=0) {
			int remainder = input%10; // It stores a remainder
			reverse = reverse*10 + remainder;
			input =input/10; // To get another digit
		}
		System.out.println(reverse);
		
		}

}
