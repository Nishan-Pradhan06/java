// java program to demonstarte buffered reader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {
    public static void main(String[] args) throws IOException {
        // enter data using bufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readline
        String name = reader.readLine();

        // printing the read line
        System.out.println(name);
    }
}
