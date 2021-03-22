package bst;

public class BST<Key extends Comparable<Key>, Value> {
    private Node<Key, Value> root;

    private static class Node<Key extends Comparable<Key>, Value> {

    }

    public BST(Key key, Value value) {

    }

    private static <Key extends Comparable<Key>, Value> Node insert(Node<Key, Value> n, Key key, Value value) {
        return null;
    }

    private static <Key extends Comparable<Key>, Value> Node delete(Node<Key, Value> n, Key key) {
        return null;
    }

    private static <Key extends Comparable<Key>, Value> Value get(Node<Key, Value> root, Key key) {
        return null;
    }

    private static <Key extends Comparable<Key>, Value> Value min(Node<Key, Value> root) {
        return null;
    }

    private static <Key extends Comparable<Key>, Value> Value max(Node<Key, Value> root) {
        return null;
    }

    private static <Key extends Comparable<Key>, Value> Value floor(Node<Key, Value> root, Key key) {
        return null;
    }

    private static <Key extends Comparable<Key>, Value> Value ceil(Node<Key, Value> root, Key key) {
        return null;
    }

    private static <Key extends Comparable<Key>, Value> int rank(Node<Key, Value> root, Key key) {
        return 0;
    }

    public void insert(Key key, Value value) {
        this.root = insert(this.root, key, value);
    }

    public void delete(Key key) {
        this.root = delete(this.root, key);
    }

    public Value get(Key key) {
        return get(this.root, key);
    }

    public Value min() {
        return min(this.root);
    }

    public Value max() {
        return max(this.root);
    }

    public Value floor(Key key) {
        return floor(this.root, key);
    }

    public Value ceil(Key key) {
        return ceil(this.root, key);
    }

    public int rank(Key key) {
        return rank(this.root, key);
    }
}
