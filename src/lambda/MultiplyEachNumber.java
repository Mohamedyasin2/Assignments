package lambda;

import java.util.Iterator;
import java.util.LinkedList;

public class MultiplyEachNumber {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(2);
		l.add(4);
		l.add(6);
		l.add(8);
		l.add(10);
		
		Iterator<Integer> itr = l.iterator();
		
		// Initialize sum value 
		int sum=0;
		
		// Iterate the list
		while(itr.hasNext()) {
			
			int num = itr.next();
			
			sum = sum + num*2;
		}
		System.out.println(sum);
	}

}
