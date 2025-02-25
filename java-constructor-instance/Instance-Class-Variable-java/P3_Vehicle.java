import java.util.*;
class P3_Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all Vehicle objects)
    private static double registrationFee = 100.00;  // Default registration fee

    // Constructor to initialize vehicle details
    public P3_Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
        System.out.println("Registration Fee updated to: $" + registrationFee);
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Creating Vehicle objects
        P3_Vehicle vehicle1 = new P3_Vehicle("John Doe", "Car");
        P3_Vehicle vehicle2 = new P3_Vehicle("Jane Smith", "Motorcycle");

        // Displaying vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Updating the registration fee
        P3_Vehicle.updateRegistrationFee(150.00);

        // Displaying vehicle details after updating registration fee
        System.out.println("Vehicle 1 Details after fee update:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details after fee update:");
        vehicle2.displayVehicleDetails();
    }
}
