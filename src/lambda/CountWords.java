package lambda;

import java.util.ArrayList;

public class CountWords {

	public static void main(String[] args) {
		// Create a array list
		ArrayList <String> a = new ArrayList<>();
		
		a.add("orange");
		a.add("banana");
		a.add("apple");
		a.add("grapes");
		a.add("apple");
		a.add("apple");
		
		// Initialize count for counting the words starting with 'a'.
		
		
		int count =0;
		
		for(String list:a) {
			if(list.toLowerCase().charAt(0)=='a') {
				count++;
			}
		}	
		
		System.out.print(count);
		
		
		
		// <---- Lambda Expression ------>
		
//		int counts =0;
//		
//		a.forEach( (list)->{
//			if(list.toLowerCase().charAt(0)=='a') {
//				counts++;
//			}
//		});
//		
//		System.out.print(counts);
//		
	}

}
