import java.util.InputMismatchException;
import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        // Does not handle error if inputs are not of type Integer.
        // int one, two;

        // Scanner scan = new Scanner(System.in);
        
        // System.out.println("Enter first number: ");
        // one = scan.nextInt();
        // System.out.println("Enter second number: ");
        // two = scan.nextInt();

        // Fix:

        int one = 0;
        int two = 0;

        boolean check = true;
        Scanner scan = new Scanner(System.in);
        while (check) {
            try {
                System.out.println("Enter first number: ");
                one = scan.nextInt();
                System.out.println("Enter second number: ");
                two = scan.nextInt();
                check = false;
            } catch(InputMismatchException e) {
                System.out.println("You may only input integers.");
                scan.nextLine();
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.printf("%d + %d = %d", one, two, one+two);
    }
}