package practice.code.threads.executorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class ExecutorServicePractice {

    public static String task1() {
        return "failure";
    }

    public static String task2() {
        return "failure";
    }

    public static String task3() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Success";
    }

    static List<Future<String>> futures = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService ex = Executors.newFixedThreadPool(1);
        futures.add(ex.submit(() -> task1()));
        ex.execute(() -> task2());
        futures.add(ex.submit(() -> task3()));
        ex.shutdown();

        boolean bool = ex.awaitTermination(1, TimeUnit.MILLISECONDS);
        System.out.println(bool);

        System.out.println(futures.get(1).get());

    }

}
