// 3. Write a Java String Program to Replace a Character at a Specific Index.

import java.io.*;

public class replaceString {
    public static void main(String[] args) {
        String str = "Hello World!";
        int index = 7;
        char ch = 'a';
        StringBuffer s1 = new StringBuffer(str);
        s1.setCharAt(index, ch);
        String result = s1.toString();
        System.out.println("The original string is: " + str);
        System.out.println("The string after replacing the character at index " + index + " is: " + result);

    }
}
