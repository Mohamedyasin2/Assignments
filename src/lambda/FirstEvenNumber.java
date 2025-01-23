package lambda;
import java.util.*;
import java.util.function.Function;
public class FirstEvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList <Integer>();
		
		a.add(11);
		a.add(15);
		a.add(18);
		a.add(20);
		
		Iterator<Integer> itr = a.iterator();
		
		// Create lambda expression for check if even number is present or not 
		Function<Integer,Integer> even = nums -> (nums%2==0)?nums:null;
		
		// Iterate the list
		while(itr.hasNext()) {
			
			Integer num = itr.next();
			
			// Pass the list element to the arguments
			Integer result = even.apply(num);
			
			// If the even number is present then break 
			if(result != null) {
				System.out.println(result);
				break;
			}
			
		}
		
		
	}

}
