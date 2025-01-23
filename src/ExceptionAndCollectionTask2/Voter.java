package ExceptionAndCollectionTask2;

public class Voter {
    private String voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(String voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getters for accessing fields
    public String getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
