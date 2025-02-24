import java.util.*;

public class AreaOfCircle {
    double radius;


    public AreaOfCircle(){
        System.out.println("Constructor called");
    }

    public AreaOfCircle(double radius){
        this.radius = radius;
    }

    public double printArea(){
        return Math.PI * radius *radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }


    public void printInfo(){
        System.out.println("Circle Details");
        System.out.println("Radius is: "+radius);
        System.out.println("Area of Circle is :"+printArea());
        System.out.println("Circumference is :"+circumference());
    }


    public static void main(String[] args) {
        AreaOfCircle a1 = new AreaOfCircle();
        AreaOfCircle a2 = new AreaOfCircle(11);

        a1.radius = 10;

        a1.printInfo();
        System.out.println();
        a2.printInfo();


    }
}
