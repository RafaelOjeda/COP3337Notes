package Examples.IOExample.src;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // WRITTING EXAMPLE        
        // Scanner keyboard = new Scanner(System.in);
        // System.out.println("Enter file name: ");
        // String fileName = keyboard.nextLine();
        // PrintWriter writer = null;
        
        // try {
        //     // Append mode enabled.
        //     writer = new PrintWriter(new FileOutputStream(fileName, true));
        // } catch (FileNotFoundException e) {
        //     System.out.println("File not found");
        //     System.exit(0);
        // }

        // System.out.println("Enter any line: ");
        // String line = keyboard.nextLine();
        // writer.println(line);
        // writer.close();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = keyboard.nextLine();
        Scanner fileScanner = null;

        try {
            FileInputStream read = new FileInputStream(fileName);
            fileScanner = new Scanner(read);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open: " + fileName);
            System.exit(0);
        }

        // Reads first line
        // System.out.println(fileScanner.nextLine());

        // Prints word by word
        while (fileScanner.hasNext()) {
            System.out.println(fileScanner.next());
        }

        
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
    }
}