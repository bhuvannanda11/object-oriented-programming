// Parent class: Employee
class Employee {
    // Instance variables
    public int employeeID;       // Public member
    protected String department; // Protected member
    private double salary;       // Private member

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify the salary
    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    // Public method to get the salary (for demonstration purposes)
    public double getSalary() {
        return this.salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager (Inherits from Employee)
class Manager extends Employee {

    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary); // Calling the parent constructor
    }

    // Method to display manager details (Accessing protected and public members)
    public void displayManagerDetails() {
        // Accessing public member 'employeeID' and protected member 'department' from parent class
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);     // Accessing public member
        System.out.println("Department: " + department);     // Accessing protected member
        System.out.println("Salary: $" + getSalary());      // Accessing private member via public method
    }
}

// Main class to test the Employee and Manager classes
public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee1 = new Employee(101, "HR", 50000);

        // Displaying employee details
        System.out.println("Employee 1 Details:");
        employee1.displayEmployeeDetails();

        // Modifying the salary using the public method
        employee1.modifySalary(55000);
        System.out.println("\nUpdated Employee 1 Details after salary modification:");
        employee1.displayEmployeeDetails();

        // Creating a Manager object
        Manager manager1 = new Manager(201, "Sales", 75000);

        // Displaying manager details
        System.out.println("\nManager 1 Details:");
        manager1.displayManagerDetails();
    }
}
