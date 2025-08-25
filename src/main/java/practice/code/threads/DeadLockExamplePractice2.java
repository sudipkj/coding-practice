package practice.code.threads;

public class DeadLockExamplePractice2 {

    static class Shared {

        public synchronized void test1(Shared s) throws InterruptedException {
            Thread.sleep(1000);
            s.test2();
        }

        public synchronized void test2() throws InterruptedException {
            Thread.sleep(1000);
            System.out.println("In shared test2" + Thread.currentThread().getName());
        }
    }

    static class MyTestThread1 extends Thread{
        Shared s1;
        Shared s2;

        MyTestThread1(Shared s1, Shared s2){
            this.s1 = s1;
            this.s2 = s2;
        }
        public void run(){
            try {
                s1.test1(s2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static class MyTestThread2 extends Thread{
        Shared s1;
        Shared s2;

        MyTestThread2(Shared s1, Shared s2){
            this.s1 = s1;
            this.s2 = s2;
        }
        public void run(){
            try {
                s2.test1(s1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Shared s1 = new Shared();
        Shared s2 = new Shared();
        MyTestThread1 t1 = new MyTestThread1(s1, s2);
        MyTestThread2 t2 = new MyTestThread2(s1, s2);

        t1.start();
        t1.join();
        t2.start();
    }
}
