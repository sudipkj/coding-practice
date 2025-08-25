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


}
