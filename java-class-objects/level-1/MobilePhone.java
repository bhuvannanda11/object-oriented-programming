public class MobilePhone {
    String brand;
    String model;
    double price;

    public MobilePhone(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Details of the phone are :");
        System.out.println("Brand is :"+brand);
        System.out.println("Model is :"+model);
        System.out.println("Price is :"+price);
    }


    public static void main(String[] args) {
        MobilePhone obj1 = new MobilePhone("Samsung", "Galaxy S25 Ultra", 111000);
        MobilePhone obj2 = new MobilePhone("Apple", "Iphone", 129999);

        obj1.printInfo();
        System.out.println();
        obj2.printInfo();


    }
}
