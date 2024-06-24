// 1. Constructors and Access Control

// Write a Java class Person with constructors for default, parameterized (name and age), and
// private access control. Demonstrate how these constructors can be used in another class


// Person.java
class Person {
    private String name;
    private int age;
    // Default constructor
    public Person() {
        this.name = "Nishan";
        this.age = 21;
    }
    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Private constructor
    // private Person(String name) {
    //     this.name = name;
    // }
    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
// TestPerson.java
public class PersonDetails {
    public static void main(String[] args) {
        // Using default constructor
        Person p1 = new Person();
        System.out.println("Person 1: " + p1.getName() + ", Age: " + p1.getAge());
        // Using parameterized constructor
        Person p2 = new Person("Isha", 19);
        System.out.println("Person 2: " + p2.getName() + ", Age: " + p2.getAge());
    }
}