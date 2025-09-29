package practice.code.linkedlists;

public class CircularLinkedList<E> {

    Node<E> head;
    Node<E> tail;

    static class Node<E> {

        E data;
        Node<E> next;

        Node(E value) {
            this.data = value;
        }

    }

    public void addHead(E value) {
        Node<E> node = new Node<>(value);
        head.next = head;
        head = node;
    }

    public void addTail(E value) {
        Node<E> node = new Node<>(value);
        tail.next = node;
        tail = node;

    }

    public void addNode(E value) {
        Node<E> node = new Node<>(value);
        tail.next = node;
        tail = node;
    }

    /**
     * Returns the node at the specified index (0-based), or null if index is out of bounds.
     * Simpler for-loop version.
     */
    public Node<E> getNode(int index) {
        if (head == null || index < 0) return null;
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
            if (current == head) return null; // index out of bounds
        }
        return current;
    }


}
