import java.util.Scanner;

public class InventoryOfItems02 {
    static class Item{
        int itemCode;
        String itemName;
        double itemPrice;

        public Item(int itemCode, String itemName, double itemPrice) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }

        public Item(){
        System.out.println("Constructor called");
        }

        public void totalCost(int quantity) {
            System.out.println(itemName + " " + (itemPrice * quantity));
        }

        public void printInfo() {
            System.out.println("Inventory of Item Details :");
            System.out.println("Item Code is :" + itemCode);
            System.out.println("Item Name is :" + itemName);
            System.out.println("Item Price is :" + itemPrice);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item i1 = new Item();
        Item i2 = new Item(102,"Windows",80000);

        i1.itemCode = 101;
        i1.itemName = "Macbook";
        i1.itemPrice = 135000;

        System.out.println("Enter the quantity of the items :");
        int quantity = sc.nextInt();

        i1.printInfo();
        System.out.println();
        i2.printInfo();
        System.out.println();
        i1.totalCost(quantity);
        System.out.println();
        i2.totalCost(2);
    }
}
