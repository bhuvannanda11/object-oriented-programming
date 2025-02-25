import java.util.*;

// Parent class: Student
class Student {
    // Instance variables
    public int rollNumber;  // Public member
    protected String name;   // Protected member
    private double CGPA;     // Private member

    // Constructor to initialize the student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent (Inherits from Student)
class PostgraduateStudent extends Student {

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA); // Calling the parent constructor
    }

    // Method to display the postgraduate student details
    public void displayPostgraduateDetails() {
        // Accessing protected member 'name' from the parent class
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);  // Accessing protected member
        System.out.println("CGPA: " + getCGPA()); // Accessing private member via public method
    }
}

// Main class to test the functionality
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student(101, "John Doe", 8.5);
        
        // Displaying student details
        System.out.println("Student 1 Details:");
        student1.displayStudentDetails();
        
        // Modifying CGPA using public method
        student1.setCGPA(9.0);
        System.out.println("\nUpdated Student 1 Details after CGPA modification:");
        student1.displayStudentDetails();

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent1 = new PostgraduateStudent(201, "Alice Smith", 9.2);
        
        // Displaying postgraduate student details
        System.out.println("\nPostgraduate Student 1 Details:");
        pgStudent1.displayPostgraduateDetails();
    }
}
