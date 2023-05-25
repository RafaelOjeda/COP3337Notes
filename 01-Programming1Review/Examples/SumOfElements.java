import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {

        int[] num;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values do you want to enter: ");
        num = new int[scan.nextInt()];

        System.out.println("Enter " + num.length + " values: \n");

        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
            sum += num[i];

            if (num[i] < min) {
                min = num[i];
            }

            if (num[i] > max) {
                max = num[i];
            }
        }
        
        System.out.println("Sum of elements: " + sum);
        System.out.println("Max value:" + max);
        System.out.println("Min value: " + min);
    }
}