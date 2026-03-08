package rps;

// コンストラクタをプライベートにした
// 自前でインスタンスを作る
// 作ったインスタンスを定数化する
// インスタンスをpublic

/**
 * ハンズクラス
 * ぐー、チョキ、パーの三種類を限定する
 */
public enum Hand {

    ROCK("ぐー", 0), SCISSOR("チョキ", 1), PAPER("パー", 2);

    // public static final Hand ROCK = new Hand("ぐー");
    // public static final Hand SCISSOR = new Hand("チョキ");
    // public static final Hand PAPER = new Hand("パー");

    private final String name;
    private final int index;

    public String getName() {
        return name;
    }

    private Hand(String name, int index) {
        this.name = name;
        this.index = index;
    }

    private final static Hand[] hands = { ROCK, SCISSOR, PAPER };

    /**
     * インデクスに基づいてHandを取得
     * 
     * @param index インデクス
     * @return Hand
     */
    public static Hand getHandByIndex(int index) {
        return hands[index];
    }

    /**
     * 二つのHandお勝敗を判別する
     * 
     * @param 比較先のHand
     * @return 勝つ場合１を返却、負ける場合−１を返却、引き分けの場合は０を返却
     */
    public int compare(Hand target) {

        if (this.name == target.name) {
            return 0;
        } else if ((this.index - target.index + 3) % 3 == 2) {
            return 1;
        } else {
            return -1;
        }
    }

}
