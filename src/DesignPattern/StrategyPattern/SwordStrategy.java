package DesignPattern.StrategyPattern;

public class SwordStrategy implements DragonSlayingStrategy{

    @Override
    public void execute(){
        System.out.println("Kill the Dragon with your sword");
    }
}
