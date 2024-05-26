//2. Write a Java String Program to Reverse a String
import java.io.*;

public class stringReverse {
  public static void main(String[] args) {
      String str = "java the hawa";
      StringBuffer s = new StringBuffer(str);
      s.reverse();
      System.out.println(s);
  }
}
