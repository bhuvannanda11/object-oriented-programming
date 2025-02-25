import java.util.*;
public class Person {
    private String name;
    private int age;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(Person otherPerson){
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter 
    public void setName(String name) {
        this.name = name;
    }

    // Getter 
    public int getAge() {
        return age;
    }

    // Setter 
    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Person Details are:");
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Bhuvan",21);
        p1.printInfo();


        System.out.println();
        Person p2 = new Person(p1);
        p2.printInfo();
    }
}
