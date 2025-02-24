import java.util.*;
public class BookDetails {
    String title;
    String author;
    double price;

    public BookDetails(){
        System.out.println("Contructor called");
    }

    public BookDetails(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public void printInfo(){
        System.out.println("Book Details");
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
    }
    public static void main(String[] args) {
        BookDetails b1 = new BookDetails();
        BookDetails b2 = new BookDetails("SuperBikes","BMW s1000rr pro",3500000);

        b1.title = "Java Language";
        b1.author = "James Gosling";
        b1.price = 2000.0;

        b1.printInfo();
        System.out.println();
        b2.printInfo();


    }
}
