// 3. Write a Java program to create an abstract class named Shape that contains an empty method named numberOfSides(). Provide three classes named Rectangle, Triangle, and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides()that shows the number of sides in the given geometrical structures.
// 4. Write two Java classes Employer and Engineer. Engineer should inherit from Employee class. Employee class to have two methods display() and calcSalary(). Write a program to display the engineer salary and to display from Employee class using a single object instantiation.(ie. only one object creation allowed)
// -> display() only prints the name of the class and doe snot return any value. Ex. "Name of class in Employee"
// -> calcSalary() in Employee displays "salary of employee is 10000" and calcSalary() in Engineer displays "Salary of employee is 20000".
class Employeee {
    void display() {
        System.out.println("Name of class in Employee");
    }

    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employeee {
    @Override
    void calcSalary() {
        System.out.println("Salary of employee is 20000");
    }
}

public class Employer {
    public static void main(String[] args) {
        // Using single object instantiation
        Employee emp = new Engineer();

        // Display the name of the class
        emp.display();

        // Display the salary calculated based on the object type
        emp.calcSalary();
    }
}