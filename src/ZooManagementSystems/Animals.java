package ZooManagementSystems;

public abstract class Animals {
	
	private String name;

	public Animals(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void makesound(); // All animals have specific sound
	
	public void eat() {
		System.out.println(getName()+" is eating.");
	}
	
	
}
