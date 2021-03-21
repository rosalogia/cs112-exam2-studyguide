package sls;

public class DLL<T> {
    private class Node<T> {
        T data;
        Node<T> prev, next;

        public Node() {
            data = null;
            prev = null;
            next = null;
        }

        public Node(T d, Node<T> p, Node<T> n) {
            data = d;
            prev = p;
            next = n;
        }
    }

    private Node<T> head;

    public void insertAfter(T target, T newValue) {
    }

    public void append(T newValue) {
    }
}
