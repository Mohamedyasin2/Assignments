package com.app;

import java.util.Scanner;

public class Day1{
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Your Mark:");
		int mark = scan.nextInt();
		
		if(mark>=90) {
			System.out.println("A");
		}
		else if(mark <=90 && mark>=80) {
			System.out.println("B");
		}
		else if(mark <=80 && mark >=60) {
			System.out.println("C");
		}
		else if(mark <=60 && mark >=40) {
			System.out.println("D");
		}
		else if(mark <=40 && mark >=35) {
			System.out.println("E");
		}
		else {
			System.out.println("Failed");
		};
		
		scan.close();
		
	}

};
