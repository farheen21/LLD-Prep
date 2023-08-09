package DesignPattern.StrategyPattern.Multithreding;

public class ExtendingThreadsClass extends Thread{
    private  String threadName ;


    public ExtendingThreadsClass(String threadName){
        super(threadName);
    }
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running - Step " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
