package ZooManagementSystems;

public class Zoo {
	
	// Add animals
	private String[] animals;

	public Zoo(String[] animals) {
		super();
		this.animals = animals;
	}
	
	public void Addanimals(String[] newAnimals) {
		
		String updateAnimals[] = new String[animals.length+newAnimals.length];
		
		//Copy old animals
		
		for(int i=0;i<animals.length;i++) {
			updateAnimals[i] = animals[i];
		}
		
		//Add new animals in an array
		
		for(int i=0;i<newAnimals.length;i++) {
			updateAnimals[animals.length+i]= newAnimals[i];
		}
		
		animals = updateAnimals;
	}
	
	// Remove animals in an array
	
	public void removeAnimals(String[] animalsToremove) {
		
		// Track how many animals want to keep
		int countTokeep = 0;
		
		for(String a:animals) {
			
			// Track animals removing
			boolean toRemove = false;
			
			// Remove animals is in an array it will remove
			for(String remove:animalsToremove) {
				if(a.equals(remove)){
					toRemove =true;
					break;
				}
			}
			// others to keep
			if(!toRemove) {
				countTokeep++;
			}
		}
		
		// Create array for remaining animals
		String updateAnimals[] = new String[countTokeep];
		
		int index=0;
		
		for(String a:animals) {
			
			// Track animals removing
			boolean toRemove = false;
			
			// Remove animals is in an array it will remove
			for(String remove:animalsToremove) {
				if(a.equals(remove)){
					toRemove =true;
					break;
				}
			}
			// others to keep
			if(!toRemove) {
				updateAnimals[index++]=a;
			}
		}
		
		animals = updateAnimals;
	}
	
	
	// Display animals
	public void displayAnimals() {
		
		for(String a:animals) {
			System.out.println(a);
		}
		
	}
	
	
}
