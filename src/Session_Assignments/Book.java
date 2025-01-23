package Session_Assignments;

public class Book {
	
	private int book_id;
	private String book_name, book_author;
	
	public Book(int book_id, String book_name, String book_author) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
	}

	public int getBook_id() {
		return book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public String getBook_author() {
		return book_author;
	}
	
}
