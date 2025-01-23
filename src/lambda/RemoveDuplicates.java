package lambda;


import java.util.LinkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		
		l.add("apple");
		l.add("avacado");
		l.add("orange");
		l.add("grapes");
		l.add("avacado");
		
		// Sorting the list
		l.sort(null);
		
		LinkedList<String> l2 = new LinkedList<>();
		
		
		for(String list:l) {
			if(!l2.contains(list)){
				l2.add(list);
			}
		}
		
		l.clear();
		l.addAll(l2);
		
		for(String list:l) {
			System.out.println(list);
		}
	}

}
