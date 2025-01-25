package JavaAdvance;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Task3 {

	public static void main(String[] args) {
		
		// Create 10 list of students name
		LinkedList<String> students_list  = new LinkedList<>();
		students_list.add("Mohamed");
		students_list.add("Yasin");
		students_list.add("Haris");
		students_list.add("Aasik");
		students_list.add("Thaha");
		students_list.add("Abdul");
		students_list.add("Safeek");
		students_list.add("Shadik");
		students_list.add("Ahamed");
		students_list.add("Rafeek");
		
		// stream list data and filter names which is starting with 'a'
		Stream<String> separate = students_list.stream()
				.filter( l -> l.toLowerCase().startsWith("a"));
		
		// Iterate the each element for display
		Iterator<String> itr = separate.iterator();
		
		// Print student name which is starting with 'a'
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
