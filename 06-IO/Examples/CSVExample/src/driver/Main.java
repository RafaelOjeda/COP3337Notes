package driver;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static final String OUTPUT = System.getProperty("user.dir") + "/output/";
    public static final String INPUT = System.getProperty("user.dir") + "/input/";

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File(INPUT + "input.csv"));
        PrintWriter out = new PrintWriter(OUTPUT + "output.csv");



        while(in.hasNextLine()){
            String[] cells = in.nextLine().split(",");
            int counter = cells.length;
            for(String cell: cells) {
                counter--;
                String trimmed = cell.trim();
                out.printf("%15.10s", trimmed);
                if (counter == 0) {
                    if (in.hasNextLine())
                        out.println();
                }
            }
        }


        in.close();
        out.close();
    }
}
