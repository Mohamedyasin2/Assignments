package OopsProgrammingTask1;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Library library = new Library(100); // Capacity of 100 books
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();

                    System.out.print("Is the book available (true/false): ");
                    boolean isAvailable = scanner.nextBoolean();

                    Book book = new Book(id, title, author, isAvailable);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter book ID to remove: ");
                    int removeId = scanner.nextInt();
                    library.removeBook(removeId);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
}
