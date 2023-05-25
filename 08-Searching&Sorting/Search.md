# Search

## Linear Search
Linear search iterates through each element until "N" element is found. If element is found stop. Else if iteration is in the last element and "N" element is not found then one can say "N" element does not exist.

## Binary Search
Linear Search looks through every item while iterating making it very slow. While Binary
Search is logarithmically faster. This formula represents how fast it is "N" variable being
the number of items in the search: (log_2 of N). 
* So if there were 1000 items to search it would take max 10
attempts to find the item. 
* If there were 100000 it would only take max 16 attempts.

### How Does Binary Search Work?

Binary Search starts in the middle of a sorted array. It looks at the middle index checks if it is 
the correct target, if it is it stops right there. If it's not it checks if it is greater or less than. If it is
greater the new minimum is the old middle the maximum is still the same. It gets the middle of
that new sub array and continuously does the previous steps until the target is found

