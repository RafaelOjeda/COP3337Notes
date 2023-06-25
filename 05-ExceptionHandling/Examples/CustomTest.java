import java.util.Scanner;

public class CustomTest {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 5 and 10");
        
        int num = scan.nextInt();

        try {
            if (num < 5 || num > 10) {
                throw new Custom("ERROR");
            }
            System.out.println("Good job!");
        } catch (Custom e) {
            System.out.println("Invalid Number");
            System.out.println(e.getMessage());
        }
    }

}
