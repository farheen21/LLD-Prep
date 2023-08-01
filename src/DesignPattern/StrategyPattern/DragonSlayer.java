package DesignPattern.StrategyPattern;

//--|> full arrow is-a relationship
//--> blank arrow has-a relationship


//Reference has been taken from here :- https://java-design-patterns.com/patterns/strategy/
//Intent :- Define a family of Algorithm and encapsulate each one and make them interchangeable , Strategy lets the algo vary
// Independently of the client.

// Simple Plain Definition :- Strategy pattern allows choosing the best-suited algorithm at runtime.

//This is class where we need different algo with specific need
public class DragonSlayer {
    private DragonSlayingStrategy strategy;
    public DragonSlayer(DragonSlayingStrategy strategy){
        this.strategy = strategy;
    }

    public void changeStrategy(DragonSlayingStrategy newStrategy){
        this.strategy = newStrategy;
    }

    public void goToBattle(){
        strategy.execute();
    }

}
