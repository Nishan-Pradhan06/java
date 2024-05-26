// 2. Write a Java program to create a class called "Employee" with a name, salary, and hire_date attributes, and a method to calculate years of service.

public class Employee {
    String name;
    double salary;
    int hire_date;

    public Employee(String emp_name, double emp_sal, int hire_emp_date) {
        this.name = emp_name;
        this.salary = emp_sal;
        this.hire_date = hire_emp_date;
    }

    public void setName(String n)
    {
        this.name=n;
    }

    public void setName(String s) {
        this.salary = s;
    }
    
    public void setName(int date) {
        this.hire_date = date;
    }
    // Method to calculate year
    public int calculateYearOfServices()
    {

    }
    
}
