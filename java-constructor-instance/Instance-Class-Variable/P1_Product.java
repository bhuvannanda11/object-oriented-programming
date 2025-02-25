class P1_Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all Product objects)
    private static int totalProducts = 0;

    // Constructor to initialize product details and increment totalProducts
    public P1_Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment the count of products each time a product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Creating product objects
        P1_Product product1 = new P1_Product("Laptop", 1200.00);
        P1_Product product2 = new P1_Product("Smartphone", 800.00);
        P1_Product product3 = new P1_Product("Headphones", 150.00);

        // Displaying product details using instance method
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2 Details:");
        product2.displayProductDetails();
        System.out.println();

        System.out.println("Product 3 Details:");
        product3.displayProductDetails();
        System.out.println();

        // Displaying total products created using class method
        P1_Product.displayTotalProducts();
    }
}
