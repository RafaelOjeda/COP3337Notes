# Input / Output
Reading and Writing is what is I/O is. The Scanner object is not just used to read input from
the command line it's also used to read from a file. Instead of passing the parameter 
"System.in" you could pass it a File object. From there the Scanner object can be used to
read a File just line any command line.

### <u>Output</u>

<u>Passing a File object to the Scanner</u>
``` java
    Scanner scnr = new Scanner(new File("fileSource"));
```

Note: Initiating a new File object does not create a new file on the specified directory. 
Instead, it creates a new object in memory containing the file directory.

When you are doing using the Scanner it is important to close it using the .close() method.

### <u>Input</u>
<u>Using PrintWriter</u><br />
``` java
    PrintWriter out = new PrintWriter("fileSource");   
```
To print on a file using the PrintWriter method the same methods of a Scanner object can
be used. It is important to always close a file using the .close() method in order to save it.
For the changes to be seen immediately onto the file you can use the .flush() method.
