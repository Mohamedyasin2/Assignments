package Session_Assignments;
import java.util.*;


public class ArrayListed {

	public static void main(String[] args) {
		
		LinkedList <Book> l = new LinkedList<Book>();
		
		Book b1 = new Book(1,"The Moon","Yasin");
		Book b2 = new Book(2,"The Sun","Mohamed");
		
		l.add(b1);
		l.add(b2);
		
		for(Book b:l) {
			System.out.println(b.getBook_id()+" "+b.getBook_name()+" "+b.getBook_author());
		}
		
		
		
	}

}
