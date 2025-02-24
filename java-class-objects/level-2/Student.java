import java.util.*;
public class Student {
    String name;
    int rollNumber;
    double marks;

    public Student(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String Calculatemarks(){
        if(marks >=90){
            return "A";
        }
        else if(marks >=75){
            return "B";
        }
        else if(marks >=50){
            return "C";
        }
        else{
            return "F";
        }
    }

    public void printInfo(){
        System.out.println("Student Details are :");
        System.out.println("Student name :"+name);
        System.out.println("Student rollNo is :"+rollNumber);
        System.out.println("Student marks is :"+marks);
        System.out.println("Student Grade is :"+Calculatemarks());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Bhuvan", 1, 99);
        Student s2 = new Student("John", 2, 35);

        s1.printInfo();
        System.out.println();
        s2.printInfo();
        
    }
}
