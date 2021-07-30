### ArrayList 
=> Resizable array implementation 
=> The backing datastructure array of objects
=> When an element is added to an ArrayList it first checks whether the new element has room to fill or it needs to grow the size of the array, If capacity has to be increased then the new capacity is calculated which is 50% more than the current capacity and the array is increased by that capacity.
add  - add(element/index, element)
remove  - remove(element/index)
sort - list.sort(Comparator)
search - contains() / indexOf()
update - set(inde, element)

=> Preserves insertion order
=> fast access

##
Time complexity :-
Insert -Best case - O(1) Worst case - O(n)
Delete -  Best case - O(1) -Worst case - O(n)
Update - O(1)
Sort - uses timsort(Give wiki link- https://en.wikipedia.org/wiki/Timsort#Minimum_size_.28minrun.29) - O(n Log n) time
Search - contains uses indexOf - O(n) in worstcase
Size - O(1) - Arraylist maintains a varaible to preserve size on each operation
isEmpty - O(1) 

### LinkedList :-
1. The backing datastructure is doubly linkedlist
2. By default add() methods adds elements at end of the list
3. LinkedList implements List, Dequeue
4. descendingIterator() - To traverse reverse of the list
5. It implements Deque becuase These operations allow linked lists to be used as a stack, queue, or double-ended queue. 
=> Preserves insertion order
=> Easy for manipulation


## Time complexity :-
Insert at last or first-Best case - O(1) - Worst case - O(n`)
Delete -  Best case - O(1) -Worst case - O(n)
Update - O(n)
Sort - uses timsort(Give wiki link- https://en.wikipedia.org/wiki/Timsort#Minimum_size_.28minrun.29) - O(n Log n) time
Search - O(n)
Size - O(1) - Maintains a variable to preserve size on each operation
isEmpty - O(1) 


###Difference between ArrayList and LinkedList :-
ArrayList and LinkedList both implements List interface and maintains insertion order. Both are non synchronized classes.
Previously, Java’s Arrays.sort method used Quicksort for arrays of primitives and Merge sort for arrays of objects. In the latest versions of Java, Arrays.sort method and Collection.sort() uses Timsort.