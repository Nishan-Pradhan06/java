//Exercise 2: Write a program in Java to compute the sum of the digits of a given integer. Remember, your integer should not be less than the five digits. (e.g.,if input is 23451 then sum of the digits of 23451wi11 be 15)

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int num, sum = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = sc.nextInt();

        do {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;

        } while (num != 0);

        System.out.println("The Sum of Digits is : " + sum);
        sc.close();
    }
}