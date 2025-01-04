package com.app;

public class RemoveElementInArray {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 3, 3, 4, 2};
		int count=0;
		int target = 3;
		for(int num:arr) {
			if(num==target) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("There is no element "+target+" in array:");
			for(int num:arr) {
				System.out.println(num);
			}
		}
		
		int[] new_arr = new int[arr.length-count];
		int k=0;
		
			for(int num:arr) {
				if(num!=target) {
					new_arr[k++]=num;
				}
			}
			
			for(int num:new_arr) {
				System.out.println(num);
			}
		
		

	}

}
