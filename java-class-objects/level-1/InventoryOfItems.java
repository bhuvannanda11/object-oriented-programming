import java.lang.reflect.Array;
import java.util.*;

public class InventoryOfItems {

    ArrayList<Item> list;

    InventoryOfItems(){
        list =  new ArrayList();
    }

    public void addItem(Item item){
        list.add(item);
    }

    public void displayList(){
        for(Item item : list){
            System.out.println("Inventory of Item Details :");
            System.out.println("Item Code is :" + item.itemCode);
            System.out.println("Item Name is :" + item.itemName);
            System.out.println("Item Price is :" + item.itemPrice);
        }
    }

    public double totalCost(){
        int result = 0;
        for(Item item : list){
            result += item.itemPrice;
        }
        return result;
    }


    static class Item {
        int itemCode;
        String itemName;
        double itemPrice;

        public Item(int itemCode, String itemName, double itemPrice) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item i1 = new Item(101, "Windows", 80000);
        Item i2 = new Item(102, "Linux", 89000);
        Item i3 = new Item(103, "Mac", 100000);
        Item i4 = new Item(104, "Windows", 60000);

        InventoryOfItems store = new InventoryOfItems();

        store.addItem(i1);
        store.addItem(i2);
        store.addItem(i3);
        store.addItem(i4);

        store.displayList();
        
        


        sc.close();
    }
}
