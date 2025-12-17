package practice.code.linkedlists;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

    public static void main(String[] args) {
        Comparator<Integer> ct = (a,b) -> b-a;
        PriorityQueue<Integer> pq = new PriorityQueue<>(ct);
        pq.add(10);
        pq.add(5);
        pq.add(7);
        pq.add(11);

        pq.stream().forEach(System.out:: println);
    }
}
