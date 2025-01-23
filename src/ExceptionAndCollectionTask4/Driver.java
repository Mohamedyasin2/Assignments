package ExceptionAndCollectionTask4;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Students st = new Students();
		
		while(true) {
			
			System.out.println("1. Add Students");
			System.out.println("2. Remove Students");
			System.out.println("3. Display Students");
			System.out.println("4. Exiting");
			
			System.out.print("Choose number between (1-4): ");
			int choice = scan.nextInt();
			
			switch(choice){
				
			case 1:
				st.addStudents();
				break;
				
			case 2:
				st.removeStudents();
				break;
				
			case 3:
				st.display();
				break;
				
			case 4:
				System.out.println("Exitig...");
				scan.close();
				System.exit(0);
				
			default:
				System.out.println("Invalid input!");
				break;
			}
		}
		
	
	}

}
