package rps;

/**
 * プレーヤークラス
 * 名前や点数の属性があり、ハンズを出す処理もある
 */
public class Player {

    private String name;
    private RPSStrategy strategy;

    public RPSStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(RPSStrategy strategy) {
        this.strategy = strategy;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Hand getHands() {

        return new Hand();
    }
}
