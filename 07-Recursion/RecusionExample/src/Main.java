public class Main {

    public static void tailRecursion(String input) {
        if (input.length() == 0) { // base case
            return;
        }
        System.out.print(input.charAt(0));
        tailRecursion(input.substring(1));
    }

    /*
     * tailRecursion("Hello)
     *
     * "H"
     * "e"
     * "l"
     * "l"
     * "o"
     *
     * Prints one by one in order
     */

    public static void headRecursion(String input) {
        if (input.length() == 0) { // base case
            return;
        }

        headRecursion(input.substring(1));
        System.out.print(input.charAt(0));
    }

    /*
     *  headRecursion("Hello")
     *  "ello"
     *  "llo"
     *  "lo"
     *  "o"
     *  ""
     *  base case is true:
     *
     * "olleH"
     *
     * Prints in reverse
     */


    public static int whatDoesThisDo(int a) {
        if (a <= 1) {
            return 1;
        }

        int intermediate = whatDoesThisDo(a-1);
        return a * intermediate;
    }

    /*
     *  whatDoesThisDo(4);
     *  a = 4
     *  a = 3
     *  a = 2
     *  base case becomes true
     */

    public static void backwardCounting(int n) {
        if (n > 0) {
            System.out.println(n);
            n--;
            backwardCounting(n);
        }
    }

    public static void verticalWriting(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            verticalWriting(n/10);
            System.out.println(n%10);
        }
    }

    public static void verticalReverseWriting(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            System.out.println(n%10);
            verticalWriting(n/10);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n-1)*n;
        }
    }

    public static int multiply (int x, int y) {
        if (y == 0) {
            return n;
        } else if (y == 1) {
            return x;
        } else {
            return multiply(x, (y-1));
        }
    }

    public static int power (int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1){
            return base;
        } else {
            return power(base, (exp - 1)) * 1;
        }
    }

    public static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n-1) + fibonacci(n-2);
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        tailRecursion("Message");
        System.out.println();

        headRecursion("Message");

        System.out.println();
        System.out.println(whatDoesThisDo(4));

        System.out.println();
        backwardCounting(10);

        System.out.println();
        verticalWriting(4985);

        System.out.println();
        verticalReverseWriting(4985);

        System.out.println();
        System.out.println(multiply(4, 3));

        System.out.println();
        System.out.println(fibonacci(5));
    }
}
