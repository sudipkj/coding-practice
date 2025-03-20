package practice.code;

class Shared {

    synchronized void test1(Shared shared){

        Utils.threadSleep();
        shared.test2();
        System.out.println("In test1 method");
    }
    synchronized public void test2(){

        Utils.threadSleep();
        System.out.println("In test2 method");
    }

}
class MyThread1 extends Thread{
    private Shared s1;
    private Shared s2;

    public MyThread1(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run() {
        s1.test1(s2);
    }
}

class  MyThread2 extends Thread{
    private Shared s1;
    private Shared s2;

    public MyThread2(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public void run() {
        s2.test1(s1);
    }
}

public class DeadLockExample {

    public static void main(String[] args) {
        System.out.println("Called Main");
        Shared s1 = new Shared();
        Shared s2 = new Shared();
        MyThread1 t1 = new MyThread1(s1, s2);
        t1.start();

        MyThread2 t2 = new MyThread2(s1, s2);
        t2.start();


    }
}

class Utils{
    public static void threadSleep(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void joinThread(Thread t){
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
