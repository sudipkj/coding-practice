package practice.code;

class Mythread1 extends Thread{

    @Override
    public void run() {
        System.out.println("Hello");
    }
}

class Mythread2 extends Thread{

    @Override
    public void run() {
        System.out.println(" World");
    }
}
public class ThreadSyncQuestion {

    public static void main(String[] args) {
    Mythread1 t1 = new Mythread1();
    Mythread2 t2 = new Mythread2();
    t1.start();
    Utils.joinThread(t1);
    t2.start();
    }
}
