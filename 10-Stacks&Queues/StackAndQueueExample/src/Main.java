import java.util.*;
public class Main {

    private static boolean isInt(char num) {

        try {
            Integer.parseInt(String.valueOf(num));
            return true;

        } catch (NumberFormatException exp) {
            return false;
        }

    }

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> num = new LinkedList<Integer>();
        Queue<Character> letter = new LinkedList<Character>();

        System.out.print("Input a text:");
        String input = in.nextLine();

        for (int i = 0; i < input.length(); i++) {

            if (isInt(input.charAt(i))) {
                num.add(i);
            } else {
                letter.add(input.charAt(i));
            }
        }

        System.out.println("Numbers: " + num);
        System.out.println("Characters: " + letter);


        /*
         * PriorityQueue may be sorted for each index to have a priority unlike other Queues where the items are fixed based on FIFO
         * Example: You are stuck in traffic and an ambulance has its sirens on. The ambulance has higher priority so it will skip the traffic.
         */

        PriorityQueue pq = new PriorityQueue();

        pq.offer("K");
        pq.offer("C");
        pq.offer("A");
        pq.offer("B");

        System.out.println(pq);


    }
}