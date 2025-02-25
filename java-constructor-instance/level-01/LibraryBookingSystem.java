import java.util.*;
class LibraryBookingSystem {
    // Attributes of the class
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize the attributes
    public LibraryBookingSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book '" + title + "' has been borrowed successfully.");
            return true;
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
            return false;
        }
    }

    // Method to return the book
    public void returnBook() {
        isAvailable = true;
        System.out.println("The book '" + title + "' has been returned.");
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Unavailable"));
    }

    // Main method to test the system
    public static void main(String[] args) {
        // Creating a LibraryBookingSystem object (representing a book)
        LibraryBookingSystem book1 = new LibraryBookingSystem("The Catcher in the Rye", "J.D. Salinger", 10.99, true);

        // Displaying book details
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();

        // Borrowing the book
        System.out.println("\nAttempting to borrow the book...");
        book1.borrowBook();

        // Displaying book details after borrowing
        System.out.println("\nBook 1 Details after borrowing:");
        book1.displayBookDetails();

        // Attempting to borrow the same book again
        System.out.println("\nAttempting to borrow the book again...");
        book1.borrowBook();

        // Returning the book
        System.out.println("\nReturning the book...");
        book1.returnBook();

        // Displaying book details after returning
        System.out.println("\nBook 1 Details after returning:");
        book1.displayBookDetails();
    }
}
