import java.util.*;
public class Book {
    private String title;
    private String author;
    private double price;

    public Book(){
        this.title = "Unknown title";
        this.author = "Unknown author";
        this.price = 0.0;
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters Method
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double price(){
        return price;
    }

    // Setters Method
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

    public static void main(String args[]){
        Book b1 = new Book();
        System.out.println("Default Constructor ");
        b1.printInfo();


        Book b2 = new Book("2003", "Bhuvan", 100000);
        System.out.println("Parameterized Constructor");
        b2.printInfo();
    }
}
