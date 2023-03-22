package Examples.IOExample.src;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        

        Scanner input = null;
        PrintWriter output = null;

        try {
            input = new Scanner(new FileInputStream("reader.txt"));
            output = new PrintWriter(new FileOutputStream("writer.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            System.exit(0);
        }
    
        while (input.hasNextLine()) {
            output.println(input.nextLine());
        }

        input.close();
        output.close();
    }
}