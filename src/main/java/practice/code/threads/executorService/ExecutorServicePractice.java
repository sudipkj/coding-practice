package practice.code.threads.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ExecutorServicePractice {

    public static void task1() {
        System.out.println("task 1 " + Thread.currentThread().getName());
    }

    public static void task2() {
//        ThreadUtils.threadSleep();
        System.out.println("task 2 " + Thread.currentThread().getName());
    }

    public static void task3() {
//        ThreadUtils.threadSleep();
        System.out.println("task 3 " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(1);
        ex.execute(() -> task1());
        ex.execute(() -> task2());
        ex.submit(() -> task3());
//        List<Runnable> incomepleteThreads = ex.shutdownNow();
//        incomepleteThreads.stream().forEach(System.out::println);
        ex.shutdown();

        /*Read only 3 things -- more on shutDown and shutDownNow with awaitTermination*/
        boolean bool = ex.awaitTermination(1, TimeUnit.MILLISECONDS);
        System.out.println(bool);

    }

}
