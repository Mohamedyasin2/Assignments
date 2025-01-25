package JavaAdvance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		
		// Create list with element
		List<String> l = Arrays.asList("abc","","bc","efg","abcd","","jkl");
		
		// For removing empty element
		List<String> non_empty_string = new ArrayList<>();
		
		// Check empty string is present or not
		for(String list:l) {
			if(list.isEmpty()) {
				System.out.println("There is an empty string in list.");
				System.out.println("After removing it.");
				break;
			}
		}
		
		//after removing empty string print remaining element
		
			
		for(String list:l) {
				
			if(!list.isEmpty()) {
					non_empty_string.add(list);
			}
				
		}
			
		System.out.println(non_empty_string);
	}
}
