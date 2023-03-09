# Exception Handling

The Exception class is a subclass of the Throwable class. Another subclass of Throwable is the Error class. Errors are caused by the system not the program.

<p> Exception handling is exactly what it sounds like. It is being able to handle the errors that 
one may get from code and managing it in your own way. For example if you ask a user to
input a String, and they input an int you can handle it to tell them to try again and display a
message.

Throwable is the interface of all Exceptions and Errors. Under Exceptions there are 3 
different categories of Exceptions: IOException, ClassNotFoundException, and 
RuntimeException.
</p>
Ways of handling exceptions: <br />
1. Try-catch block
<br />2. throws keyword

<br />Try-catch block is created like this:
``` java
    try {
        // code that throws exception
    } catch (exceptionName e) {
        // code if it breaks
    } finally {
        // code if it breaks or not like the default in switch statement.
    }
```

The throws keyword is simply put on the signature of the method and following that is the
name of the exception. This does not prevent a program of crashing but simply tells the 
Java that be aware that it might crash.
```java
    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
            ...
        }
    }
```

<u>Throwing Exceptions</u>
<p>An exception can also be thrown using the throw keyword. When one throws an exception.
It breaks from the flow of the code and either tries to catch it via try-catch using the 
nearest block or it'll handle it on its own.</p>

```java 
    throw new NullPointerException("Exception Message.")
```

## User Defined Exception Classes
One can create their own exception classes. Must inherit a predefined exception class.

```java
    class InvalidNumberException extends Exception {
        public InvalidNumberException() {
            super();
        }

        public InvalidNumberException(String message) {
            super(message);
        }
    }
```

## Vocabulary
- Try: code that throws exception
- Catch: code to be excecuted if exception is thrown and exception handler.
- Throw: To throw an object of type Exception
- Throws: To declare method throws Exception and does not handle.

