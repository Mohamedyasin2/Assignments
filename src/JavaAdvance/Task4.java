package JavaAdvance;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Get user birth date
		System.out.println("Enter your birth date (YYYY-MM-DD): ");
		String birthdate_input = scan.nextLine();
		
		// Parse birth date to local date format
		LocalDate birthdate = LocalDate.parse(birthdate_input);
		
		// get current date
		LocalDate currentdate = LocalDate.now();
		
		// calculate age months days 
		Period age  = Period.between(birthdate, currentdate);
		
		System.out.print("Your age is "+age.getYears()+", "+age.getMonths()+" months"+", "+age.getDays()+" days.");
		
		
		scan.close();
		
	}

}
