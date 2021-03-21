# Topic 3: Special Linked Structures

## Conceptual Questions

1. Describe and illustrate the memory representation (how to make them) and allocation
(how much space they require) when implementing circular and doubly linked lists.
  * Circular Linked Lists:
    * Memory Representation: A circular linked list is a special form of a singly linked list
      where all nodes are in a continuous cycle. There is no use of null in a circular linked
      list to indicate the end of the list.

      By keeping a pointer to the last entry we have access to the first and last entry in
      constant time.

      * last: `last`
      * first: `last.next`

      ```java
      class CircularLinkedList<T> {
          Node<T> last;
          Node<T> data;
      }
      ```
    * Allocation: The `CircularLinkedList` class must contain a reference to the last node in the list, which consume 8 bytes
      of space. Therefore the amount of memory allocated for the list must be 8 bytes in addition to the size of a `Node<T>`
      times the number of nodes in the list.
  * Doubly Linked Lists:
    * Memory Representation: A linked list where every node refers to its previous and next nodes.
      Each node has three parts:
      * A data part
      * A link to the previous node
      * A link to the next node

      ```java
      class DoublyLinkedList<T> {
          Node<T> data;
      }

      class Node<T> {
          T data;
          Node<T> prev;
          Node<T> next;
      }
      ```
    * Allocation: Since a Doubly Linked List node must store a reference to the previous object as well as the next object,
      it consumes an additional 8 bytes of memory per node in the list.

2. See [Programming Problems](#programming-problems).

3. See [Programming Problems](#programming-problems).

4. List the advantages and disadvantages of using circular linked lists and doubly-linked lists.
  * Circular Linked List:
    * Advantages:
      * A circular linked list can be traversed beginning at any node in the list.
      * A circular linked list can be used to implement a data structure such as a
        queue where two references front, and back are needed. However, we note that
        `back.next == front`.
      * A circular linked list can also be singly or doubly linked.
      * This is a great data structure to implement an application such as a multi-player game
        where players can be maintained in a circular linked list.
      * Circular doubly linked list are used for implementation of practical data structures.
    * Disadvantages:
      * Need to maintain a reference to the last node at all times.
      * It may be bit trickier to implement some operations such as `addLast` or `addFirst`.
  * Doubly Linked List:
    * Advantages:
      * More versatile than singly linked list as one can traverse in both directions.
      * When implementing a dynamic application, reference to `mostRecentlyAccessedNode`
        can be saved in order to move forward or backward.
    * Disadvantages:
      * Each node requires extra 8 bytes of memory for previous reference.
      * It is harder to implement operations such as inserting a node to the middle.

5. Give at least one application where it is more appropriate to use a circular linked list than it is to use
any other data structure. Justify your choice.
  * A circular linked list can be used to implement a queue, where only one reference is needed to implement enqueue or deque operations.
  * A circular linked list can be used to allocate a shared resource to multiple applications where each application is given some fixed amount of time and the operations can be continued until all applications complete their tasks.
  * A circular linked list can be used in a multi player game, where each player is given a chance in sequence, and first player is given a chance again in the second round once the last player is done in the first round.

6. Give at least one application where it is more appropriate to use a doubly linked list than it is to use
any other data structure. Justify your choice.
  * A doubly linked might be suitable for many applications where it is important to be able to navigate the linked structure in any direction (forward or backward)
  * Maintaining the history of web pages visited where both backward and forward navigation of the history is possible.
  * Maintaining most and least recently used memory cache.
  * A music player with next and previous buttons to maintain the history of the playlist, both forward and backward.


## Programming Problems

**Note**: solutions for these problems are included in the provided project template.

2. Implement common methods on circular and doubly linked lists including, but not limited to:
  * Insert
  * Delete
  * Update
  * Traverse

3. Given a problem statement, design, develop, debug, and test a Java program that uses the
appropriate data structure(s).
