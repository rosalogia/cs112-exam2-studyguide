# Topic 6: Balanced Search Trees

## Conceptual Questions

1. What is a balanced binary search tree? Why are they important?
  * A balanced binary search tree is a binary search tree where costs are guaranteed to be logarithmic.
    The trees have near-perfect balance, where the height is guaranteed to be no larger than 2 log<sub>2</sub>(n). 

2. Illustrate and explain the structure of a 2-3 tree.
  * A 2-3 search tree is a tree that either is empty or:
    1. A 2-node, with one key (and associated value) and two links, a left link to a 2-3 search tree
    with smaller keys, and a right link to a 2-3 search tree with larger keys
    2. A 3-node, with two keys (and associated values) and three links, a left link to a 2-3 search
    tree with smaller keys, a middle link to a 2-3 search tree with keys between the node's keys and
    a right link to a 2-3 search tree with larger keys.

3. Explain insertion into a 2-3 tree and the invariants associated with it.
  * When inserting into a 2-3 tree, you may either add a new key to a 2-node to create a 3-node,
    or insert a 3-node at the bottom by adding a new key to a 3-node (temporarily creating a 4-node),
    moving the middle key of the 4-node into its parent (making it a 3-node), and repeating up as necessary.
    If the root is reached in this process, the root should be split into 3 2-nodes.
  * The invariants associated with 2-3 tree insertion are that each insertion must maintain symmetric order and
    perfect balance. This keeps search and insert times proportional to log<sub>2</sub>(n).

4. Explain and implement search as it relates to red-black (RB) trees.
  * Although the fact that they are balanced makes search much faster on RB trees, the algorithm for searching
    a RB tree is the same as that for searching a regular BST (due to the fact that we implement them using BSTs).

6. Explain the guaranteed logarithmic performance for search and insert for RB trees.
  * We know that the time it takes to do search and insert on a BST is proportional to the
    height of the tree. Therefore, if we can make the height of the tree proportional to
    log<sub>2</sub>(n), we can ensure that search and insertion take time proportional to log<sub>2</sub>(n)
    as well.

7. Explain the advantages of RB trees.
  * Self-balancing takes constant time, so there is no performance disadvantage to implementing a self-balancing (e.g. Red Black) tree
  * In the worst case, an RB tree has a height of log<sub>2</sub>(n), which is already a large improvement over the worst case for
    a regular binary search tree. This improves search and insertion performance significantly.

8. Give conditions when implementing a RB tree is most appropriate.
  * Since Red Black trees are nothing more than an efficient, self-balancing implementation of binary search trees, any
    application of BSTs is a valid application of RB trees. You may once again refer to this list of applications of
    Symbol Tables to see how RB trees can be used:

    ![Symbol Table applications](https://algs4.cs.princeton.edu/31elementary/images/symbol-table-applications.png)

## Programming Problems

5. Implement RB tree insert.
  * Textbook Videos: [Balanced Search Trees: B. Red-Black BSTs](https://cuvids.io/app/video/140/watch)
