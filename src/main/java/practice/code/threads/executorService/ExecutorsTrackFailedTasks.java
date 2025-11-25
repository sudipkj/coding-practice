package practice.code.threads.executorService;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorsTrackFailedTasks {



    private static String task1(){
        System.out.println("Task 1 Completed");
        return "Success";
    }

    private static String task2(){
        System.out.println("Task 2 Completed");
        throw new IllegalArgumentException();
    }
    private static String task3(){
        System.out.println("Task 3 Completed");
        return "Success";
    }
    private static Map<Integer, Future<String>> taskStatusMap = new HashMap<>();

    @SneakyThrows
    public static void main(String[] args) {

        ExecutorService executors = Executors.newSingleThreadExecutor();

        taskStatusMap.put(1, executors.submit(() -> task1())) ;
        taskStatusMap.put(2, executors.submit(() -> task2())) ;
        taskStatusMap.put(3, executors.submit(() -> task3())) ;

        executors.shutdown();
        executors.awaitTermination(5, TimeUnit.SECONDS);

        taskStatusMap.entrySet().stream().forEach(System.out:: println);
        System.out.println(taskStatusMap.get(2));
    }

}
