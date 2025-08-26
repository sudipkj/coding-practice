package practice.code.threads.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorServicePractice {

    public static void task1(){
     System.out.println("task 1 " + Thread.currentThread().getName());
    }

    public static void task2(){
        System.out.println("task 2 " + Thread.currentThread().getName());
    }

    public static void task3(){
        System.out.println("task 3 "  + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.execute(() -> task1());
        ex.execute(() -> task2());
        ex.submit(()-> task3());
        ex.shutdownNow();

    }

}
