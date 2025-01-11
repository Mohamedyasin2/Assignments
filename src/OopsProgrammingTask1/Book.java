package OopsProgrammingTask1;

public class Book {
    private int book_id;
    private String book_title;
    private String book_author;
    private boolean isAvailable;

    public Book(int book_id, String book_title, String book_author, boolean isAvailable) {
        this.book_id = book_id;
        this.book_title = book_title;
        this.book_author = book_author;
        this.isAvailable = isAvailable;
    }

    public int getBookId() {
        return book_id;
    }

    public String getBookTitle() {
        return book_title;
    }

    public String getBookAuthor() {
        return book_author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book ID: " + book_id + ", Title: " + book_title + ", Author: " + book_author + ", Available: " + isAvailable;
    }
	
	
}
