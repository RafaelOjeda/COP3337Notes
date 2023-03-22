# Recursion

Definition: The process in which a method calls itself continuously. 
A method that calls itself is called a recursive method. Useful for factorials,
transversing trees, and simplifying a complex task.

Recursive methods uses "the call stack"

``` java 
    public static void myRecursiveMethod(String input) {
        if (input.length() == 0) { // base case
            return;
        }
        System.out.print(input.charAt(0));
        myRecursiveMethod(input.substring(1));
    }
```

Always have a base case to prevent the recursive method from becoming an infinite loop.
In this example the base case is when the input length is equal to 0; 

``` java
public static void hello() {
    System.out.println("Hello");
    hello();
}
```
Because there is no base case this code will print an infinite amount of times "Hello" causing a StackOverflowError. This is because all unfinished methods are stored in the stack and when the stack is overflown the error will be thrown.

``` java
// With base case
public static void hello(int n) {
    if (n >= 1) {
        System.out.println("Hello");
        hello(n-1);
    }
}
public static void main (String[] args) {
    hello(5);
}
```
This code would print out "Hello" 5 times until n < 1