import java.util.*;
public class EmployeeDetails {
    String name;
    int id;
    double salary;
    
    public EmployeeDetails(String name,int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public EmployeeDetails(){
        System.out.println("Constructor called");
    }

    public void printInfo(){
        System.out.println("Name is :"+name);
        System.out.println("Id is :"+id);
        System.out.println("Salary is :"+salary);
    }


    public static void main(String[] args) {
        EmployeeDetails e1 = new EmployeeDetails();
        EmployeeDetails e2 = new EmployeeDetails("Harry",11,100000);

        e1.name = "Bhuvan";
        e1.id = 2110992292;
        e1.salary = 1800000;

        e1.printInfo();
        e2.printInfo();
    }
}