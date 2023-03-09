# Linked List

Exists in java.util </br>

<b>Part of the List Interface along with ArrayList preserving the order and allows duplicate values
extends List interface. </b>

<u>Difference Between ArrayList and LinkedList</u></br>
Linked List is has sequential access while ArrayList has random access.

Different types of Linked List:
* Singly Linked List can go to the next
* Doubly Linked List like Singly but can go to the previous item as well.
* Circular Singly Linked List the last item can refer to the first.
 Circular Doubly Linked List a mix of circular singly and doubly linked list

  | Method Names                                      | Description                                          |
  |------------------------------------------------------|---------------------------------------------------|
  | LinkedList<String> lst = new LinkedList<String>() | An empty list.                                       |
  | lst.addLast("Romeo")                              | Adds an element to the end of the list. Same as add. |
  | lst.addFirst("Juliet")                            | Adds an element to the beginning of the list. lst is now [Sally, Harry].
  | lst.getFirst()                                    | Gets the element stored at the beginning of the list; here "Sally".
  | lst.getLast()                                     | Gets the element stored at the end of the list; here "Harry".
  | String removed = lst.removeFirst();               | Removes the first element of the list and returns it. removed is "Sally" and lst is [Harry]. Use removeLast to remove the last element.
  | ListIterator<String> iter = lst.listIterator()    | Provides an iterator for visiting all list elements

