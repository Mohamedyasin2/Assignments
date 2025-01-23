package ZooManagementSystems;

public class Fish extends Animals implements Swimmable {

	public Fish(String name) {
		super(name);
	}
	
	public void swim(){
		System.out.println(getName()+" is swimming.");
	}
	
	public void makesound() {
		System.out.println(getName()+" makes bubble sound.");
	}
}
