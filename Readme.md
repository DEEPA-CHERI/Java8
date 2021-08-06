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



###Lambda expressions :-
   
   Why lambdas?
   -> Enable to treat functionality as a method argument, or code as data.
   -> A function that can be created without belonging to any class.
   -> A lambda expression can be passed around as if it was an object and executed on demand.
   -> It enables to write a method in a more readable and concise manner
   -> It enables functional programming
   
   
   ** Type of a lambda expression is a interface
   ** Interface should have only one abstract method is called functional interface
   ** It is good practice to add if it is for lambda
   ** We dont need to create everytime interfaces, we have a set of function interfaces defined in util.Function package to implement lambda expressions
   ** Lambda expressions are tempting to say syntactic sugar on anonymous inner class
   ** Lambda expressions is not a shortcut for inner classes
   ** Lambda expressions does not have this own context it shares the parent context where as inner anonymous class has its own contexts
   
   Exception Handling in Lambdas :-
   
   we can handle exception where we define our lambda expressions but that looks clumsy
   In order to avoid clumsiness we can wrap our lambda expression into another lambda and handle exception there
   
   
   Method References :-
   
   ==> Method reference is an alternative way of writing lambda expressions
   syntax :-
       ==> Static method className::methodName
       ==> instance method instance::MethodName
   
   
   
   Java 8 introduces streams to iterate over collection
   External Iterators - for loop and foreach loop
   Internal Iterators are being introduced in java8 (streams)
   
   Collections has default stream method,
   if we want to process a stream of data we can use stream otherwise we can use parallel stream.
   parallel stream does not preserve order of the data. It will use all the cores present in the system to execute the code.
   
   
   Best Practice :-
   Use @FunctionalInterface, in case of lambda expression interfaces