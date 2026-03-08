package rps;
// ポリモーフィズム

// 条件１： 継承
// 条件２： 子クラスが親クラスのメソッドをオーバーライドする
// 条件３： 親クラスのポインターが子クラスに指している

// コンパイルは親クラスをみる、ランタイムは子クラスを見る

/**
 * プレーヤークラス
 * 名前や点数の属性があり、ハンズを出す処理もある
 */
public class Player {

    private String name;
    private RPSStrategy strategy;
    private int point = 0;

    public int getPoint() {
        return point;
    }

    /**
     * 勝敗の結果によって点数を付き加える
     * 勝ったら一点追加、引き分けもしくは負けたら点数維持
     * 
     * @param point
     */
    public void setPoint(int point) {
        if (point == 1) {
            this.point++;
        }
    }

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

    /**
     * 手を出す
     * 
     * @return ぐー、チョキ、パーの三つのうちどれかを返す
     */
    public Hand getHands() {
        return this.strategy.getHands();
    }
}
