# Inheritance

Inheritance is a way to acquire all the properties of a parents class
onto its child class. This is an essential part to OOP. This gets rid 
of repetition within classes that are all related to each other. A parent
class is also known as a super class. The super keyword behaves in the 
same format as the this keyword. The only difference is that super calls 
the super class. To allow inheritance one declares the classes super class
by using the extends keyword following the class name where the signature
of the class is.

``` java
public class superClass {
    protected int number = 777;
    
    protected void helloWorld() {
        System.out.println("Hello World!");
    }
}

public class childClass extends superClass {
    protected int number = 999;
    
    public void printNumber() {
        // Calls super class number field
        System.out.println("Super class number: " + super.number); 
        // Calls the number field in current class
        System.out.println("Child class number: " + number);
    }
}
```