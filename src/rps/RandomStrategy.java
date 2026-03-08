package rps;

import java.util.Random;

/**
 * 子クラスとして、具体的なランダムなストラテジーを持つ
 */
public class RandomStrategy implements RPSStrategy {

    @Override
    public Hand getHands() {
        int index = new Random().nextInt(3);

        Hand result = Hand.getHandByIndex(index);

        return result;
    }
}
