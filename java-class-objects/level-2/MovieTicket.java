import java.util.*;
public class MovieTicket {

    String movieName;
    String seatNumber;
    double price;


    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Assigned";  
        this.price = 0.0;  
    }


    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicketDetails() {
        System.out.println("Movie Ticket Details are below :");
        System.out.println("Movie Name: "+movieName);
        System.out.println("Seat Number: "+seatNumber);
        System.out.println("Price: "+price);
    }


    public static void main(String[] args) {

        MovieTicket m1 = new MovieTicket("Jatt and Juliet 3");
        MovieTicket m2 = new MovieTicket("Tabaah");
        

        m1.bookTicket("B11", 500);
        m2.bookTicket("A18", 700);
        
        
        m1.displayTicketDetails();
        m2.displayTicketDetails();
    }
}
