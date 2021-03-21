package sls;

public class CLL<T> {
    private class Node<T> {
        T data;
        Node<T> next;

        public Node() {
            data = null;
            next = null;
        }

        public Node(T d, Node<T> n) {
            data = d;
            next = n;
        }
    }

    private Node<T> last;

    public void prepend(T newValue) {
    }

    public void update(T target, T newValue) {
    }

    public void delete(T target) {
    }
}
