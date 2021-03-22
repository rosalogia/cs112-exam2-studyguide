# Binary Search Tree Exercises

This folder contains a project template for the implementing various exercises concerned with binary search trees
in preparation for the 2nd CS112 mid-term. Your code will go in `app/src/main/java/bst/`. Solutions are available
in `app/src/test/java/Solutions.java`. Unit tests are provided to ensure that you have successfully completed the exercises.

## Problem Statements

### Question 2: Create and Implement a BST

Begin implementing a BST class that's generic over `Key extends Comparable<Key>, Value` in the file provided. Create all the fields you believe will be necessary, as well
as a constructor that creates a BST with a given value at its root. Do not worry about implementing any methods on the class, as these
will be part of the next exercise.

### Question 3, 4, 9: Implement BST methods

Implement the following methods for your BST class:

* `Node insert(Node<Key, Value> n, Key key)`: inserts a provided element with a key of type `Key` and a value of type `Value` into the BST at the correct location.
* `Node delete(Node<Key, Value> n, Key key)`: deletes a node in the BST with a specified key, but keeps all the elements stored beneath it.
* `Value get(Node<Key, Value> root, Key key)`: searches for a node in the BST with a specified key and returns its value.
* `Value min(Node<Key, Value> root)`: returns the value in the BST with the smallest key.
* `Value max(Node<Key, Value> root)`: returns the value in the BST with the largest key.
* `Value floor(Node<Key, Value> root, Key key)`: returns the value in the BST with the largest key less than the provided key.
* `Value ceil(Node<Key, Value> root, Key key)`: returns the value in the BST with the smallest key larger than the provided key.
* `int rank(Node<Key, Value> root, Key key)`: returns the amount of nodes in the BST whose keys are smaller than the provided key.

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
