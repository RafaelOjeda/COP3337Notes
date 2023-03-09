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
//
    public static String whatAboutThis(String input) {
        int l = input.length();

        if (l <= 0) {
            return input;
        }

        return whatAboutThis(input.substring(l/2))
                + whatAboutThis(input.substring(0,l/2));
    }

    public static void main(String[] args) {
        tailRecursion("Message");
        headRecursion("Message");
        System.out.println(whatDoesThisDo(4));
        System.out.println("Hello World!");
    }
}
