// Parent class: Book
class Book {
    // Instance variables
    public String ISBN;      // Public member
    protected String title;  // Protected member
    private String author;   // Private member

    // Constructor to initialize the book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author name
    public String getAuthor() {
        return this.author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook (Inherits from Book)
class EBook extends Book {

    // Constructor to initialize eBook details
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author); // Calling the parent constructor
    }

    // Method to display eBook details (Accessing protected and public members)
    public void displayEBookDetails() {
        // Accessing public member 'ISBN' and protected member 'title' from parent class
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);     // Accessing public member
        System.out.println("Title: " + title);   // Accessing protected member
        System.out.println("Author: " + getAuthor()); // Accessing private member via public method
    }
}

// Main class to test the Book and EBook classes
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("1234567890", "Java Programming", "John Doe");

        // Displaying book details
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();

        // Modifying the author name using the setter method
        book1.setAuthor("Jane Smith");
        System.out.println("\nUpdated Book 1 Details:");
        book1.displayBookDetails();

        // Creating an EBook object
        EBook eBook1 = new EBook("0987654321", "Advanced Java", "Robert Brown");

        // Displaying eBook details
        System.out.println("\nEBook 1 Details:");
        eBook1.displayEBookDetails();
    }
}
