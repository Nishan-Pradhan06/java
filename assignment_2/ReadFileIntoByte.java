// 2. Write a Java program to read the contents of a file into a byte array
package assignment_2;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ReadFileIntoByte {
    public static void main(String [] args)
    {
        try {
            byte writeData[] = { 11, 12, 12, 12, 12 };
            OutputStream os = new FileOutputStream("writebyte.txt");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
