import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFIle {

    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {  // Corrected the condition to check for end of file
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();  // Added exception handling
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();  // Added exception handling for closing streams
            }
        }
    }
}
