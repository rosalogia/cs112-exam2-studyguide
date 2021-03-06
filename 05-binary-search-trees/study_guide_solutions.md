# Topic 5: Binary Search Trees

## Conceptual Questions

1. Define a symbol table and discuss the methods included in the ordered symbol table API
   
   The primary purpose of a symbol table is to associate a value with a key. The client can
   insert key–value pairs into the symbol table with the expectation of later being able to
   search for the value associated with a given key.

   Here is the API for **Ordered** Symbol Tables:

   ![Image of Symbol Table API from Sedgwick](https://algs4.cs.princeton.edu/31elementary/images/ordered-symbol-table-api.png)

2. See [Programming Problems](#programming-problems).

3. See [Programming Problems](#programming-problems).

4. See [Programming Problems](#programming-problems).

5. Identify the best and worst case time complexities for insertions to a BST
  * **Best Case: O(log n) when the tree is balanced**.
    
    Why is this? In any
    BST, the maximum depth you will ever need to reach to make an insertion is equal to
    the height of the tree. In a balanced tree, the height of the tree is always approximately 
    log base-2 of the amount of nodes in the tree. Think about why this is: by storing
    nodes in a binary tree rather than a linked list, we can repeatedly halve the amount of links
    we need to follow to arrive at a given value (assuming we balance our tree).

  * **Worst Case: O(n)** when e.g. all the nodes are left or right nodes and the item being inserted goes at the bottom.
  
    Note: it's worth explicitly mentioning that both the best and worst case (and, indeed, _all_ cases) can be said
    to have a run-time complexity of O(h) where h is the height of the tree. In the best case, as mentioned, the height
    is approximately log<sub>2</sub>(n), whereas in the worst case, the height of the tree is equal to n.


6. List the pros and cons of using BSTs
    Note: a straight-forward answer to this question isn't properly provided in any of the course materials, so along with
    a quote from the lecture slides, a list that I wrote is provided.

    "The Binary Search Tree is a dynamic structure that combines the flexibility of insertion in a linked structure
    with the efficiency of search in an ordered array."
    
    * Pros:
      * Searching and inserting are O(log n) on average, compared to an average time complexity of O(n) for search and insertion
        on unordered arrays/lists
    * Cons:
      * Worst case complexity for searching and inserting is O(n), and will be reached if data is inserted into the BST in order.

  

7. Draw the BST that results from inserting the following list of numbers in the order given:
   `[2, 25, 38, 28, 17, 16, 6, 22, 37]`

   ![Image of Binary Search Tree generated by VisuAlgo](https://i.imgur.com/VS8ciob.png)

8. List the order in which nodes in the above BST will be visited for ...
  * In-Order (Left, Root, Right) Traversal: `[2, 6, 16, 17, 22, 25, 28, 37, 38]`
  * Pre-Order (Root, Left, Right) Traversal: `[2, 25, 17, 16, 6, 22, 38, 28, 37]`
  * Post-Order (Left, Right, Root) Traversal: `[6, 16, 22, 17, 37, 28, 38, 25, 2]`

9. Compute the floor, ceiling, and rank of the key `20` in the above BST. See [Programming Problems](#programming-problems).
  * Floor: 17
  * Ceiling: 22
  * Rank: 4

10. List at least three real world applications that would best be solved using a BST rather than other data structures studied
    so far. Explain why.

    Recall that BSTs are simply an efficient data structure for implementing the Symbol Table pattern/API. Whenever a Symbol Table
    is needed or useful, a BST can be used to implement it efficiently. Therefore, the following applications of Symbol Tables
    can also be considered applications of BSTs.
    
    ![Applications of Symbol Tables from Sedgewick](https://algs4.cs.princeton.edu/31elementary/images/symbol-table-applications.png)

11. List at least three real world applications that would best be solved using a data structure other than a BST. Explain why.
  
  * Storing data that is not comparable. In this case, the primary benefits of storing data in a BST are lost, as the "lower values
    to the left" and "higher values to the right" system is no longer applicable. E.g. a friends list in a multi-player game.
  * Storing data where lookup is not a priority. If it is rare or unlikely that you will need to perform key-look-up on a collection
    of data and, for example, you will need to traverse your data in a particular order frequently, a linked list variant might
    be sufficient for your purposes, and be more intuitive to work with without incurring additional performance costs. E.g.
    storing a list of web pages recently visited.
  * Storing data where random-access is a higher priority than search. Accessing an arbitrary index of an array can always be done
    in O(1) time. This benefit is lost with a BST, so if random-access is more useful to you than being able to search in avg. O(log n) time,
    using an array or array-like structure might be preferable.

## Programming Problems

**Note**: Code solutions can be found in the [provided project template](./bst-project/).

2. Create and implement a BST

3. Explain and implement the algorithms for inserting, deleting, and searching for nodes in a BST.
  * Insertion: start at the root and compare the new key to the root's key. If the new key < the root's key,
    check if the left sub-tree is null and recursively insert into the left sub-tree if it exists. If the left
    sub-tree is null, set the left sub-tree to a new node containing the new key. If the new key > the root's key,
    perform this same process on the right sub-tree. Optionally, if the new key is equal to the root's key, update
    the root.

  * Hibbard Deletion: if deleting a node with 0 children, set the link which points to it to `null`. If deleting
    a node with 1 child, set the link which points to it to instead point to its child. If deleting a node with 2
    children, find the minimum in the right sub-tree and swap its position with the node being deleted. Then, delete
    the minimum of the right sub-tree as usual.

  * Search: start at the root and compare the new key to the root's key. If the new key < the root's key,
    check if the left sub-tree is null and recursively search the left sub-tree if it exists. If the left
    sub-tree is null, return null. If the new key > the root's key, perform this same process on the right
    sub-tree. If the new key is equal to the root's key, return the root's value.

4. Implement code to find the smallest/largest element in a BST.

9. Implement the floor, ceiling, and rank methods for a BST.
