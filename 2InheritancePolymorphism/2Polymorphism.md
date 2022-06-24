# Polymorphism
Polymorphism means many forms.

### Compile-Time Polymorphism
is named after it occurs during the compilation process. The compiler checks the method signature at build time to identify 
which method to call for a given method call at build time. It’s also known as early binding, static polymorphism, 
or overloading. <br /> <br />

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Method Overloading** - is a type of polymorphism. Method Overloading is when
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the programmer creates multiple methods with the same name but different
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;parameters. For example it is very common use to create constructors and
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;having method.
``` java
    public class overloadingExample {
    String overloadingExample;
        public overloadingExample () {
            overloadingExample = "Hello World!";
        }
        
        public overloadingExample(String overloadingExample) {
            this.overloadingExample = overloadingExample;
        }
    }
```

### Runtime Polymorphism ### 
In this approach, the call to an overridden method is resolved dynamically during runtime rather than at build time. 
Method overriding is one such method that is used to achieve runtime polymorphism. <br /> <br />

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**Method Overriding** - is another type of polymorphism. Method Overriding <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;happens when an inheriting class is modifying a method from the superclass. <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Whether it be a different body or <br />
``` java
    public class superClass {
        public String helloName() {
            return "Hello Spongebob";
        }
    }
    
    public class childClass extends superClass {
        @Override
        // Not only is the method being overriden but overloaded as well due
        // to different parameters
        public String helloName(String name) {
            return "Hello " + name;
        }
    }
```
<br />

``` java
    class ABC {
        public void myMethod(){
            System.out.println("Overridden Method");
        }
    }
    public class XYZ extends ABC{
    
        public void myMethod(){
            System.out.println("Overriding Method");
        }
        public static void main(String args[]){
            ABC obj = new XYZ();
            obj.myMethod();
        }
    }
```

The example above, ABC and XYZ class is another type of method overriding. In this example, a child class object allocated to the
parent class reference. The type of the object will be identified at run-time to determine which method will be invoked.
The version of the method that will be invoked is determined by the type of object (not the type of reference). <br />