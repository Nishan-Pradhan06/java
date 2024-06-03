import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamsExample {

    public static void main(String[] args) throws IOException {
        // creating FIleReader object
        File file = new File("mytest.txt");
        FileReader reader = new FileReader(file);
        char chars[] = new char[(int) file.length()];
        // raeding data from thew file
        reader.read(chars);
        // writing data to another file

        File out = new File("copyofMyFIle.txt");
        FileWriter writer = new FileWriter(out);
        // writing data to the file
        writer.write(chars);
        writer.flush();
        System.out.println("Data sucessfully writtern in the specified file");

    }
}