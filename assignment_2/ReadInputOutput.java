package assignment_2;

//Qn1 write a java program to read input from the java console.

import java.util.Scanner;

public class ReadInputOutput {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("You entered: " + s);

        // Prompt the user to enter an integer
        System.out.println("Enter an integer: ");
        int a = sc.nextInt();
        System.out.println("You entered: " + a);

        // Prompt the user to enter a float
        System.out.println("Enter a float: ");
        float b = sc.nextFloat();
        System.out.println("You entered: " + b);
    }
}
