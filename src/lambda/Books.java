package lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Books {

		String book_title;
		String genre;
		int pages;
		double price;
		
		
	public Books(String book_title, String genre, int pages, double price) {
			super();
			this.book_title = book_title;
			this.genre = genre;
			this.pages = pages;
			this.price = price;
		}

	

	public String getBook_title() {
		return book_title;
	}

	public String getGenre() {
		return genre;
	}

	public int getPages() {
		return pages;
	}

	public double getPrice() {
		return price;
	}

	public boolean countgenre() {
		return "Fiction".equalsIgnoreCase(genre);
	}
		

	public static void main(String[] args) {
		
		// Created list of books
		List<Books> b = List.of(
					new Books("Book A", "Fiction", 350, 19.99),
				    new Books("Book B", "Non-Fiction", 250, 15.99),
				    new Books("Book C", "Fiction", 400, 25.99),
				    new Books("Book D", "Fantasy", 300, 12.99),
				    new Books("Book E", "Fiction", 200, 9.99),
				    new Books("Book F", "Fiction", 450, 30.99)
				    );

		// Convert list to stream for filter the book
		List<Books> filterbooks = b.stream().
				// Select fiction books and its page is more than 300
				filter(book -> book.countgenre() && book.getPages() > 300).
				collect(Collectors.toList());
		
		// If there is no fiction book in list then it will throw mentioned message
		if(filterbooks.isEmpty()) {
			System.out.println("There is no fiction books in a list.");
		}
		
		// Print the filter book
		filterbooks.forEach(
				book -> System.out.println(book.getBook_title()+" "+book.getGenre()+" "+book.getPages()+" "+book.getPrice()));
				
		// Calculate average price for fiction books
		OptionalDouble averagePrice = filterbooks.stream()
				.mapToDouble(Books::getPrice).average();
		
		// Print average price
		System.out.println("Average Price of fiction books: "+averagePrice);
		
		// Select most expensive fiction book
		Books most_expensive = Collections.max(filterbooks,Comparator.comparingDouble(Books::getPrice));
		
		// Print the most expensive book
		System.out.println("Most Expensive book is: "+most_expensive.getBook_title());
		
		
	}

}
