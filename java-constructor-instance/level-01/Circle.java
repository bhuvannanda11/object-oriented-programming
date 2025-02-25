import java.util.*;
public class Circle {
    private double radius;


    public Circle(){
        this(1.0);
        // Chaining to the parameterized constructor with default radius
    }

    // Parameterized constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // get method
    public double getRadius(){
        return radius;
    }

    // get method
    public void setRadius(double radius){
        this.radius = radius;
    }

    // calculate area method
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    // calculate circumference method
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }


    public static void main(String[] args) {
        Circle c1 = new Circle(); 
        // Uses default constructor
        System.out.println("Default Circle Radius: " + c1.getRadius());
        System.out.println("Default Circle Area: " + c1.calculateArea());
        System.out.println("Default Circle Circumference: " + c1.calculateCircumference());

        System.out.println();

        Circle c2 = new Circle(5.0); 
        // Uses parameterized constructor
        System.out.println("Custom Circle Radius: " + c2.getRadius());
        System.out.println("Custom Circle Area: " + c2.calculateArea());
        System.out.println("Custom Circle Circumference: " + c2.calculateCircumference());
    }
}
