package DesignPattern.StrategyPattern.Multithreding;

public class Threads implements  Runnable{
    private String threadName;
    Threads(String threadName){
        this.threadName = threadName;
    }
    @Override
    public void run(){
        System.out.println("Calling from runnable interface");
        for(int i = 1; i <= 5; i++){
            System.out.println("Running"+threadName+" "+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

