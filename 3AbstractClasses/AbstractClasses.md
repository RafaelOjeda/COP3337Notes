# Abstract Classes/Methods


## Abstract Classes
Definition: abstract classes are classes that cannot be used to create objects. 
To access that abstract class the class must be inherited. 
Not all methods in an abstract class need to be abstract methods.

## Abstract Methods 
Definition: abstract methods are methods that only have a signature. 
They include no body. The class inheriting the abstract class 
must override all abstract methods. 



Creating an abstract class:
``` java
    public abstract class className {
    
        public abstract String helloWorld();
    }
```

Uses: Abstract classes and methods are to achieve a form of uniformity 
with the classes inheriting it due to them having to be overriden in the child class.
With abstract classes one can use Polymorphism to their advantage.