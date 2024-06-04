// package assignment_2;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) throws IOException {
        String fileName = "java.txt";

        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}
