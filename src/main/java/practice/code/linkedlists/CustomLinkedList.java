package practice.code.linkedlists;

public class CustomLinkedList<E> {
    Node<E> head;
    Node<E> tail;

    @Override
    public String toString() {
        return "CustomLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    static class Node<E>{



        Node<E> next;

        E value;

        Node(E value){
            this.value = value;
        }



    }

    public void addHead( E element){
        Node<E> node = new Node<>(element);
        node.next = head;
        head = node;
    }


    public void addTail( E element){
        Node<E> node = new Node<>(element);
        node.next = tail;
        tail = node;
    }

    public void addElement(E element){
        Node<E> node = new Node<>(element);
        tail.next = node;
        tail = node;
    }



    // main method to test the linked list
    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.addHead("Sudip");
        list.addTail("Rakesh");
        list.addElement("Rohit");

        System.out.println("Head: " + list.head.value);
        System.out.println("Tail: " + list.tail.value);
        System.out.println("list : " + list);
    }

    //code to generate palindrome word





}
