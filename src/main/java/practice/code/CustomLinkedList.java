package practice.code;

public class CustomLinkedList<E> {
    Node<E> head;
    Node<E> tail;

    static class Node<E>{



        Node<E> next;

        E value;

        Node(E value){
            this.value = value;
      ;  }



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


}
