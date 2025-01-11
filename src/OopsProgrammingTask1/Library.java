package OopsProgrammingTask1;

public class Library {
	private Book[] books;
    private int count;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.count = 0;
    }

    public void addBook(Book book) {
        if (count >= books.length) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        books[count++] = book;
        System.out.println("Book added: " + book.getBookTitle());
    }

    public void removeBook(int book_id) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getBookId() == book_id) {
                books[i] = books[count - 1]; // Replace with the last book
                books[count - 1] = null; // Nullify the last slot
                count--;
                System.out.println("Book removed: " + books[i].getBookTitle());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book with ID " + book_id + " not found.");
        }
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }
	
}

