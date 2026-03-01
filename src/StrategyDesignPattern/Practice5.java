package StrategyDesignPattern;

public class Practice5 {

    public static void main(String[] args) {

        Player player1 = new Player("zhangsan", "21", "20000", "2000");
        Player player2 = new Player("lisi", "22", "5000", "20000");

        player1.setWeapon(WeaponFactory.creatWeapon("剣"));
        player2.setWeapon(WeaponFactory.creatWeapon("銃"));

        System.out.println("player1のターンです。");
        player1.getWeapon().attack();
        System.out.println("player2のターンです。");
        player2.getWeapon().attack();

    }
}
