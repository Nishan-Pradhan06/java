// 3. Recursion and Access Control Implement a recursive method to calculate the factorial of a number.Ensure the method is accessible only within its package.Provide a
// class that
// demonstrates the
// use of this
// method with
// proper access
// control handling.


import java.util.Scanner;

class FactorialCalculator {
    // Recursive method to calculate factorial
    int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

// TestFactorial.java (in default package)
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate factorial: ");
        int number = scanner.nextInt();

        scanner.close();

        // Using the factorial calculator
        FactorialCalculator calculator = new FactorialCalculator();

        // Accessing the calculateFactorial method indirectly through the instance
        int factorial = calculator.calculateFactorial(number);
        System.out.println("Factorial of " + number + ": " + factorial);
    }
}
