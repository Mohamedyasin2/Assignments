package ZooManagementSystems;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//Existing animals in an array
		String[] intial_animals = {"Tiger","Lion"};
		
		Zoo zoo = new Zoo(intial_animals);
		
		while(true){
			
			// Get user input for managing zoo animals
			System.out.println("1. Adding animals");
			System.out.println("2. Removing animals");
			System.out.println("3. Show all animals");
			System.out.println("4. Exit");
			
			int user_input = scan.nextInt();
			scan.nextLine();
			
			switch(user_input) {
			
			case 1:
				// Set length for adding new animals
				System.out.print("How many animals do you add: ");
				int new_animals_count = scan.nextInt();
				
				//Create array to store new animals
				String newAnimals[] = new String[new_animals_count];
				
				//Insert new animals in an array
				for(int i=0;i<newAnimals.length;i++) {
					newAnimals[i]=scan.next();
				}
				
				zoo.Addanimals(newAnimals);
				
				break;
				
			case 2:
				
				// Set length for removing animals
				System.out.print("How many animlas want to remove: ");
				int remove_animals_count= scan.nextInt();
				
				// Get remove animals
				String removeAnimals[] = new String[remove_animals_count];
				for(int i=0;i<removeAnimals.length;i++) {
					removeAnimals[i]=scan.next();
				}
				zoo.removeAnimals(removeAnimals);
				
				break;
				
				
			case 3:
				// Display all animals 
				zoo.displayAnimals();
				break;
				
			case 4:
				System.out.print("Exited...");
				scan.close();
				return;
				
			default:
				System.out.println("Invalid input! Choose number with given range(1-3).");
			}
			
		}
	}

}
