package ExceptionAndCollectionTask5;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {
	
	Scanner scan = new Scanner(System.in);
	
	// Create a stack
	Stack<Integer> stack = new Stack<>();
	
	// For adding element in to the stack 
	public void addElement() {
		
		// Get no.of element could be add
		System.out.print("How many elements do you push: ");
		int push_count = scan.nextInt();
		
		System.out.println("Enter integer value: ");
		int elements;
		
		// Push element to the stack
		for(int i=0;i<push_count;i++) {
			
			elements = scan.nextInt();
			stack.push(elements);
			
		}
	}
	
	// Want to remove element in stack
	public void removeElement() {
		
		// Get the element want to remove
		System.out.print("Enter element want to remove: ");
		Integer element = scan.nextInt();
		
		// If the element is present in stack then it will remove
		if(stack.contains(element)) {
			stack.remove(element);
		}
		
		// Element not present in stack
		else {
			System.out.println("Element not found in stack!");
		}
	}
	
	// Display stack
	public void display() {
		
		//If the stack is empty it will throw an message respectively
		if(stack.isEmpty()) {
			System.out.println("There is no element in stack.");
		}
		
		// else it will print stack
		else {
			
			for(Integer l:stack) {
				System.out.println(l);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stacks s = new Stacks();
		
		while(true) {
			
			System.out.println("1. Push element into the stack");
			System.out.println("2. Pop element from the stack");
			System.out.println("3. Display stack");
			System.out.println("4. Exit");
			System.out.print("Choose number between (1-4): ");
			
			int user = scan.nextInt();
			
			switch(user) {
			
			case 1:
				s.addElement();
				break;
				
			case 2:
				s.removeElement();
				break;
				
			case 3:
				s.display();
				break;
				
			case 4:
				System.out.println("Exiting...");
				scan.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid input!");
			}
			
		}
		
		
	}

}
