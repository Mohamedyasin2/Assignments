package ExceptionAndCollectionTask3;
import java.util.Scanner;

public class Weeksday {
	Scanner scan = new Scanner(System.in);
	
	String[] weekdays= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	
	public void ChooseDays() {
		System.out.print("Choose number from (0-6) for days: ");
		
		 try {
	            int user = scan.nextInt();

	            // Accessing the array element
	            System.out.println("The day is: " + weekdays[user]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: The number you entered is out of range. Please enter a number between 0 and 6.");
	        } catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter a number between 0 and 6.");
	        }
	}
}
