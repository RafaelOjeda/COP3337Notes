import java.util.*;
import java.io.*;
public class Main {
    public static void centerAlignTxtFile (String inputFileName, String outputFileName,
                                         int width, int maxCellLength){
        Scanner s;
        PrintWriter out;
        try{
            s = new Scanner(new File(INPUT + inputFileName));
            out = new PrintWriter(OUTPUT + outputFileName);
        }catch(FileNotFoundException exp){
            System.out.println("I/O exception");
            return;
        }
        while(s.hasNextLine()){
            String[] cells = s.nextLine().split("\t");
            int counter = cells.length;
            for(String cell: cells) {
                counter--;
                String trimmed = cell.trim();
                String format = "%." + maxCellLength + "s";
                if(width > maxCellLength) {
                    int diff = width-maxCellLength;
                    format = "%" + (maxCellLength + diff / 2) + "." + maxCellLength + "s";
                    for (int i = 0; i < diff - diff / 2; i++)
                        format += " ";
                }
                out.printf(format, trimmed);
                if (counter == 0) {
                    if (s.hasNextLine())
                        out.println();
                    out.flush();
                } else
                    out.print('\t');
            }
        }
        out.close();
        s.close();
    }
    public static void rightAlignTxtFile (String inputFileName, String outputFileName,
                                         int width, int maxCellLength){

        Scanner s;
        PrintWriter out;
        try{
            s = new Scanner(new File(INPUT + inputFileName));
            out = new PrintWriter(OUTPUT + outputFileName);
        }catch(FileNotFoundException exp){
            System.out.println("I/O exception");
            return;
        }
        while(s.hasNextLine()){
            String[] cells = s.nextLine().split("\t");
            int counter = cells.length;
            for(String cell: cells) {
                counter--;
                String trimmed = cell.trim();
                String format = "%" + width + "." + maxCellLength + "s";
                out.printf(format, trimmed);
                if (counter == 0) {
                    if (s.hasNextLine())
                        out.println();
                    out.flush();
                } else
                    out.print('\t');
            }
        }
        out.close();
        s.close();
    }
    public static void leftAlignTxtFile (String inputFileName, String outputFileName,
                                           int width, int maxCellLength){

        Scanner s;
        PrintWriter out;
        try{
            s = new Scanner(new File(INPUT + inputFileName));
            out = new PrintWriter(OUTPUT + outputFileName);
        }catch(FileNotFoundException exp){
            System.out.println("I/O exception");
            return;
        }
        while(s.hasNextLine()){
            String[] cells = s.nextLine().split("\t");
            int counter = cells.length;
            for(String cell: cells) {
                counter--;
                String trimmed = cell.trim();
                String format = "%-" + width + "." + maxCellLength + "s";
                out.printf(format, trimmed);
                if (counter == 0) {
                    if (s.hasNextLine())
                        out.println();
                    out.flush();
                }
            }
        }
        out.close();
        s.close();
    }
    public static final String INPUT = System.getProperty("user.dir") + "/input/";
    public static final String OUTPUT = System.getProperty("user.dir") + "/output/";
    public static void main(String[] args){
        //Left Alignment Tst
        leftAlignTxtFile("input.txt", "leftAligned.txt",
                20,14);
        //Center Alignment Test
        centerAlignTxtFile("input.txt", "centerAligned.txt",
                20,14);
        //Right Alignment Test
        rightAlignTxtFile("input.txt", "rightAligned.txt",
                20,14);


        //Class Activity XI
        Scanner s;
        try {
            s = new Scanner(new File(INPUT+ "input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error: input.csv not accessible!");
            return;
        }
        PrintWriter out;
        try {
            out = new PrintWriter(OUTPUT + "output2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: output.txt can't be accessed or created!");
            return;
        }
        while(s.hasNextLine()){
            String row = s.nextLine();
            //Approach 1:
            String[] words = row.split(",");
            int counter = words.length;
            for(String word: words){
                counter--;
                try{
                    int value = Integer.parseInt(word);
                    out.printf("%+5d", value);
                }catch(NumberFormatException exp){
                    try{
                        double value = Double.parseDouble(word);
                        out.printf("%-10.2g", value);
                    }catch(NumberFormatException exp2){
                        out.printf("%10.5s", word);
                    }
                }
                if(counter == 0) {
                    if(s.hasNextLine())//not the last row
                        out.println();
                    out.flush();
                }
                else
                    out.print('\t');
            }
            //Approach 2:
            /*Scanner rowScanner = new Scanner(row);
            rowScanner.useDelimiter(",");
            while(rowScanner.hasNext()){
                try{
                    int value = rowScanner.nextInt();
                    out.printf("%+5d", value);
                }catch(InputMismatchException exp){
                    try{
                        double value = rowScanner.nextDouble();
                        out.printf("%-10.2g", value);
                    }catch(InputMismatchException exp2){
                        out.printf("%10.5s", rowScanner.next());
                    }
                }
                if(!rowScanner.hasNext()) {
                    if(s.hasNextLine())//not the last row
                        out.println();
                    out.flush();
                }
                else
                    out.print('\t');
            }*/
        }
        out.close();
        s.close();
    }
}
