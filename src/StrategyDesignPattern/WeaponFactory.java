package strategyDesignPattern;

// ファクトリーデザインパターン
public class WeaponFactory {

    /**
     * 武器を製造する
     * 
     * @param name 武器名
     * @return 武器
     */
    public static Weapon creatWeapon(String name) {
        if (name == "剣") {
            return new Sword();
        } else if (name == "銃") {
            return new Gun();
        } else {
            return new Weapon();
        }
    }
}
