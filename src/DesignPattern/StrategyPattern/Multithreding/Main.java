package DesignPattern.StrategyPattern.Multithreding;

public class Main {
    public static void main(String Args[]) {
        Threads t1 = new Threads("First Thread");
        Threads t2 = new Threads("Second Thread");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        ExtendingThreadsClass threadsClass = new ExtendingThreadsClass("ThreadWithThreadClass");

        threadsClass.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        thread2.start();
//        thread1.start();
    }
}
