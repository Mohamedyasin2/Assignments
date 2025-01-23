package ExceptionAndCollectionTask1;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) 
            throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }

        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains invalid characters. Only alphabets are allowed.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Helper method to validate name
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+"); // Only letters and spaces are allowed
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}

