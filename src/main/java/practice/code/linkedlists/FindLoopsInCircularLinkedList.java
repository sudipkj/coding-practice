package practice.code.linkedlists;

public class FindLoopsInCircularLinkedList {
    // Node definition
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Returns the number of nodes in the loop if a loop exists, otherwise 0.
     */
    public static int countNodesInLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Loop detected, count nodes in loop
                int count = 1;
                Node temp = slow;
                while (temp.next != slow) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0; // No loop
    }

    // Example usage
    public static void main(String[] args) {
        // Create nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // Create a loop for testing: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        int loopLength = countNodesInLoop(head);
        if (loopLength > 0) {
            System.out.println("Loop detected. Number of nodes in loop: " + loopLength);
        } else {
            System.out.println("No loop detected.");
        }
    }
}

