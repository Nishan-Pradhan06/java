
//the following is an array decleared with 10th elements. then code tres to access the 11th elements of the array which thows an exceptions.
import java.io.*;

public class expOne {
    public static void main(String[] args) {
        try {
            int a[] = new int[10];
            System.out.println("Accessing element at index 11: " + a[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Out of try-catch block");
    }
}
