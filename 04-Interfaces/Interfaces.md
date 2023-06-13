# Interfaces

* Is not a class
* It is a type
* An extreme case of abstract classes
* "implements" keyword
* Only contains abstract classes and abstract methods
* Cannot be instantiated.
* No constructors
* Classes can implement multiple interfaces

Interfaces are similar to abstract classes. The difference is that all methods within an 
Interface are abstract. Also, all fields within an interfaces are assumed to be final.
Interfaces as well cannot be instantiated. To implement an interface use the keyword implements
instead of extends.

* Common interfaces used: 
  * Comparable - to compare/for sorting objects
  * Cloneable Interfaces
  * Serializable Interface

``` java
    public class interface {
        ...
    }
    
    public class implementsInterface implements interface {
        ...
    }
```

Comparable Interface - Used to compare objects when sorting.
Contains the compareTo() abstract method. Commonly used to sort generics.
