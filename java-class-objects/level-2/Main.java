import java.util.*;
class CartItem {
    String itemName;
    double price;
    int quantity;


    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


    public double getTotalPrice() {
        return price * quantity;
    }

}


class ShoppingCart {
    CartItem[] cartItems;
    int itemCount;

    public ShoppingCart(int maxSize) {
        cartItems = new CartItem[maxSize];
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = new CartItem(itemName, price, quantity);
            itemCount++;
            System.out.println("Added " + itemName + " to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }


    public void removeItem(String itemName) {
        boolean itemFound = false;
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].itemName.equals(itemName)) {
                // Shift all elements to the left to remove the item
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null;  // Remove the last item
                itemCount--;
                System.out.println("Removed " + itemName + " from the cart.");
                itemFound = true;
                break;
            }
        }
        if (!itemFound) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Method to display the total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].getTotalPrice();
        }
        System.out.println("Total cost of items in the cart: $" + totalCost);
    }
}


public class Main {
    public static void main(String[] args) {
        // Create a shopping cart with a maximum size of 5 items
        ShoppingCart cart = new ShoppingCart(5);

        // Adding items to the cart
        cart.addItem("Macbook", 135000.00, 1);
        cart.addItem("Iphone", 75000.00, 2);


        cart.displayTotalCost();
        cart.removeItem("Smartphone");
        cart.displayTotalCost();

        // Trying to remove an item that is not in the cart
        cart.removeItem("Tablet");
    }
}
