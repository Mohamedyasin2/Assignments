package ExceptionExercise;

public class test {

	public static void main(String[] args) {
		try {
			throw new NullPointerException("You should give any intiger value.");
		}
		catch(RuntimeException e){
			System.out.println("Cause:"+e.getMessage());
		}
	}

}
