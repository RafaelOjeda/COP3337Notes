# <u>Quick Notes</u>

<b>toString():</b> method is used to print out the methods data in text form.
Common practice is to override it and have it output depending on the method.
---
<b>compareTo(String string):</b> Compare to method does exactly what it sounds. It compares
The string you are calling it from to the one you put in the parameters and returns an int.
If the return is a negative int it means that the string you are calling it from is smaller than the 
parameter. If the return int is zero than that means both ints are the same. If the return int is 
positive than that means the string calling it is larger than the parameter string.
<br /><br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The compareTo() method is part of the Comparable interface and is used in the .sort()
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;method comparing everything being sorted to one another and listed correctly. The
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;compareTo() method is commonly used to compare a string or object as you choose
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;by @Overriding it onto your class.
---
<b>delimeter():</b>