package lambda;

import java.util.List;

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
		
		List<Books> b = List.of(
					new Books("Book A", "Fiction", 350, 19.99),
				    new Books("Book B", "Non-Fiction", 250, 15.99),
				    new Books("Book C", "Fiction", 400, 25.99),
				    new Books("Book D", "Fantasy", 300, 12.99),
				    new Books("Book E", "Fiction", 200, 9.99),
				    new Books("Book F", "Fiction", 450, 30.99)
				    );

		List<Books> g = b.stream()
				.filter(Books::countgenre).toList();
				
	}

}
