package StrategyDesignPattern;

public class Gun extends Weapon {

    @Override
    public void attack() {
        System.out.println("銃を使った");
    }
}
