package practice.code;

import java.util.stream.IntStream;

class MyThread extends Thread{
    @Override
    public void run() {

        IntStream.range(0, 10).filter(x -> !(x%2 == 0)).forEach(x -> {
            System.out.println(Thread.currentThread().getName() + " " + x);
            Thread.yield();
        });

    }
}
class HisThread extends Thread{
    @Override
    public void run() {
        System.out.println("HisThread");
        IntStream.range(0, 10).filter(x -> (x%2 == 0)).forEach(x -> {
            System.out.println(Thread.currentThread().getName() + " " + x);
            Thread.yield();
        });
    }
}
public class ThreadSequencePrinting {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("T2");
        HisThread t2 = new HisThread();
        t2.setName("T1");

        t1.start();
        t2.start();


    }
}


