package lambda;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		LinkedList <Integer> a = new LinkedList<Integer>();
		
		a.add(15);
		a.add(20);
		a.add(25);
		a.add(30);
		a.add(35);
		
		// Reverse the list
		Iterator <Integer> itr = a.descendingIterator();
		
		// Print the list
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
