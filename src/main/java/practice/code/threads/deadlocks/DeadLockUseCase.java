package practice.code.threads.deadlocks;

class Shared {

    // This will have 2 method
    public synchronized void test1(Shared shared) throws InterruptedException {
        Thread.sleep(100);
        System.out.println("In test 1 " + Thread.currentThread().getName());
        shared.test2();
    }

    public synchronized void test2() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("In test 2 " + Thread.currentThread().getName());
    }
}

class Mythread extends Thread {

    Shared s1;
    Shared s2;

    Mythread(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void run() {
        try {
            s1.test1(s2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class Mythread2 extends Thread {

    Shared s1;
    Shared s2;

    Mythread2(Shared s1, Shared s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void run() {
        try {
            s2.test1(s1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

public class DeadLockUseCase {

    public static void main(String[] args) throws InterruptedException {

        Shared s1 = new Shared();
        Shared s2 = new Shared();
        Mythread m1 = new Mythread(s1, s2);
        Mythread2 m2 = new Mythread2(s1, s2);
        m1.start();
        m1.join();
        m2.start();


    }

}
