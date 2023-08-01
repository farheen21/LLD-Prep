package DesignPattern.StrategyPattern;


public class StrategyPattern {
    public static void main(String Args[]){
        System.out.println("Green dragon spotted ahead!");
        var dragonSlayer = new DragonSlayer(new BowandArrowStrategy());
        dragonSlayer.goToBattle();

        System.out.println("Red dragon spotted ahead!");
        dragonSlayer.changeStrategy(new HammerStrategy());
        dragonSlayer.goToBattle();

        System.out.println("black dragon spotted ahead!");
        dragonSlayer.changeStrategy(new SwordStrategy());
        dragonSlayer.goToBattle();
        
    }
}
