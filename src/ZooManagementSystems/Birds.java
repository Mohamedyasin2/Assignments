package ZooManagementSystems;

public class Birds extends Animals implements Flyable {
	
	public Birds(String name) {
		super(name);
	}
	
	
	public void makesound() {
		System.out.println(getName()+"...chirps");
	}
	
	
	public void fly() {
		System.out.println(getName()+" is flying.");
	}
}
