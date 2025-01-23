package ExceptionAndCollectionTask2;

public class Driver {

	public static void main(String[] args) {
		 try {
	            Voter voter = new Voter("V12345", "yasin", 16);
	        } catch (InvalidVoterAgeException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            Voter voter = new Voter("V12346", "mohamed", 20);
	            System.out.println("Voter created: " + voter.getName());
	        } catch (InvalidVoterAgeException e) {
	            System.out.println(e.getMessage());
	        }
	   }
}
