# Specialy Linked Structure Exercises

This folder contains a project template for the implementing various exercises concerned with special linked structures
in preparation for the 2nd CS112 mid-term. Your code will go in `app/src/main/java/sls/`. Solutions are available
in `app/src/test/java/Solutions.java`. `DLL` and `CLL` base classes are provided for you. Unit tests are provided
to ensure that you have successfully completed the exercises.

## Problem Statements

### Question 2: Implementing Linked List Operations

Implement the following methods in the `CLL` and `DLL` classes respectively.

#### CLL

* `prepend` i.e. "insert at front":
  Write a method in your CLL class to insert an element `newValue` at the front. Remember that CLLs store a reference to last, and last.next is the front of the list. Think about the possible cases that need to be covered.
  **Example Input:** `1->2->3->4->5(last)`, `newValue = 17`, remember that 5 is the stored node last, and it also has a pointer back to 1.
  **Example Output:** `17->1->2->3->4->5(last)`, Now 5 points to 17 which points to 1
* `update`:
  Write a method in your CLL class to set every node in the list whose value is `target` to `newValue`, If there is no node containing `target`, do nothing.
  **Example Input** `1->2->3->4->5(last)`, `target = 3`, `newValue = 6`
  **Example Output** `1->2->6->4->5(last)`
* `delete`:
  Write a method in your CLL class to delete the node containing `target` from the list. If there is no node containing `target`, do nothing. Think about the different cases. Remember that if you're using my provided CLL class, `target` is of type T, so comparisons will need to use `.equals()` rather than `==`.
  **Example Input:** `1->2->3->4->5(last)`, `target = 3`, remember that 5 is the stored node last, and it also has a pointer back to 1.
  **Example Output:** `1->2->4->5(last)`

#### DLL
* `insertAfter`:
  Write a method in your DLL class to insert an element `newValue` after the node containing `target`. If there is no node containing `target`, do nothing. Think about the possible cases that need to be covered. If you're using my provided DLL class, remember that `newValue` and `target` are of type T so comparisons will have to use `.equals()` rather than `==`.
  **Example Input:** `1<->2<->3<->4`, `target = 3`, `newValue = 17`
  **Example Output:** `1<->2<->3<->17<->4`
* `append`: i.e. "insert at end":
  Write a method append() in your DLL class that takes in a T `target` and inserts a new node containing `target` at the end of the DLL.
  **Example Input:** `1<->2<->3`, `target = 17`
  **Example Output:** `1<->2<->3<->17`

### Question 3: Queue Implementation

Implement a Queue class that's generic over `T` using the appropriate data structure. Have it implement the following interface:

* `void enqueue(T x)`: Enqueues element `x` to the front of the queue
* `T dequeue()`: Removes the element at the back of the queue and returns it
* `boolean isEmpty()`: Returns true if the queue is empty, false otherwise

## Running and Testing Your Code

You can run the code in `Main.java` by executing the following command in your terminal

Mac/Linux:
```
./gradlew --console plain run
```

Windows:
```
.\gradlew --console plain run
```

### Running the Unit Tests

Two scripts (one for Mac/Linux and one for Windows) are provided for running the tests and seeing their output. If
you are on Mac or Linux, the script is simply called `runtests`. If you are on Windows, it is called `runtests.bat`.

On Mac and Linux, you may execute the script via the following command:
```
./runtests
```

On Windows, use
```
.\runtests
```
