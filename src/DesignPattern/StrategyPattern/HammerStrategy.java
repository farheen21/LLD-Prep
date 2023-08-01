package DesignPattern.StrategyPattern;

public class HammerStrategy implements  DragonSlayingStrategy{
    @Override
    public void execute(){
        System.out.println(" Break the head of Dragon with Hammer");
    }
}
