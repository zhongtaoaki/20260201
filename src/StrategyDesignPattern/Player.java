package strategyDesignPattern;

public class Player {

    private String name;
    private String age;
    private String hp;
    private String attack;

    public Player(String name, String age, String hp, String attack) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        this.attack = attack;
    }

    private Weapon weapon;

    /**
     * 武器を設置する
     * 
     * @param weapon 武器
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * 武器を取得する
     * 
     * @return 武器
     */
    public Weapon getWeapon() {
        return this.weapon;
    }

}
