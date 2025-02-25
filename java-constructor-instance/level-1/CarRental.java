import java.util.*;
public class CarRental {


    // Attributes of the class
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalRatePerDay;

    // Constructor to initialize the rental details
    public CarRental(String customerName, String carModel, int rentalDays, double rentalRatePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * rentalRatePerDay;
    }

    // Method to display the rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Rate per Day: $" + rentalRatePerDay);
        System.out.println("Total Rental Cost: $" + calculateTotalCost());
    }

    // Main method to test the CarRental system
    public static void main(String[] args) {
        // Creating a CarRental object
        CarRental rental1 = new CarRental("Alice Johnson", "Toyota Corolla", 5, 30.0);

        // Displaying rental details and calculating total cost
        System.out.println("Car Rental 1 Details:");
        rental1.displayRentalDetails();

        // Creating another CarRental object with different details
        CarRental rental2 = new CarRental("Bob Smith", "Honda Civic", 3, 35.0);

        // Displaying rental details and calculating total cost
        System.out.println("\nCar Rental 2 Details:");
        rental2.displayRentalDetails();
    }
}
