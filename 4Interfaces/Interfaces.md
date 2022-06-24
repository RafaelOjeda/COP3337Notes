# Interfaces

Interfaces are similar to abstract classes. The difference is that all methods within an 
Interface are abstract. Also, all fields within an interfaces are assumed to be final.
Interfaces as well cannot be instantiated. To implement an interface use the keyword implements
instead of extends.

``` java
    public class interface {
        ...
    }
    
    public class implementsInterface implements interface {
        ...
    }
```