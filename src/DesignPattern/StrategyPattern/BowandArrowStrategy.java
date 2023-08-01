package DesignPattern.StrategyPattern;


public class BowandArrowStrategy implements DragonSlayingStrategy{

    @Override
    public void execute(){
        System.out.println("Shoot Dragon with Magical cross and Bow");
    }
}
