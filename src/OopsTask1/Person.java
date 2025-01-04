package OopsTask1;


public class Person {
	String name;
	int age;
	
	// Construct for initialize name and age 
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	// Constructor for default age
	public Person(String name) {
		this.name=name;
		this.age=18;
	}
	 
	// Method to display name and age
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
