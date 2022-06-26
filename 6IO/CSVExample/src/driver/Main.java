package driver;
import java.io.*;
public class Main {
    public static final String OUTPUT = System.getProperty("user.dir") + "/output/";
    public static final String INPUT = System.getProperty("user.dir") + "/input/";

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(OUTPUT + "out.csv");

        out.println("Alex Martinez,123459,9999");
        out.println("Rose Gonzales,67899,9541234567");
        out.println("John Cruz,99999,1234567891");
        out.flush();
        out.close();
    }
}
