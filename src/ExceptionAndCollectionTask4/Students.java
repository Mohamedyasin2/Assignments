package ExceptionAndCollectionTask4;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Students {
	
	Scanner scan = new Scanner(System.in);
	
	Map<String,Integer> addstudents = new HashMap<>();
	
	public void addStudents() {
	
		
		System.out.print("How many students do you add: ");
		int add_count = scan.nextInt();
		
		String student_name;
		int student_grade;
		
		for(int i=0;i<add_count;i++) {
			
			System.out.print("Enter Student name: ");
			student_name = scan.next();
			
			System.out.print("Enter Grade of the student: ");
			student_grade = scan.nextInt();
			
			// Adding student name and grade in hashMap
			addstudents.put(student_name,student_grade );
						
		}
		System.out.println("Students added successfully!");
		
	}
	
	public void removeStudents() {
		
		System.out.println("Enter student name to remove: ");
		
		String student_name = scan.nextLine();
		
		if(addstudents.containsKey(student_name)) {
			addstudents.remove(student_name);
			System.out.println("Student has been successfully removed");
		}
		else {
			System.out.println("Student not found!");
		}
		
	}
	
	
	public void display() {
		
		if(addstudents.isEmpty()) {
			System.out.println("No students are availbale!");
		}
		else {
			
			for(var list:addstudents.entrySet()) {
				
				System.out.println("Student Name: "+list.getKey()+ ", Grade: "+list.getValue());
			}
			
		}
		
	}
	
	
}
