# Recursion

Definition: The process in which a method calls itself continuously. 
A method that calls itself is called a recursive method. Useful for factorials,
transversing trees, and simplifying a complex task.

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
