package rps;

/**
 * 子クラスとして、具体的なしーけんしゃるなストラテジーを持つ、つまり順番に出す
 */
public class SequenceStrategy implements RPSStrategy {

    private int index = 0;

    @Override
    public Hand getHands() {
        this.index++;

        Hand result = Hand.getHandByIndex(this.index % 3);

        return result;
    }
}
