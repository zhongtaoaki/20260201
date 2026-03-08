package rps;

/**
 * じゃんけんのゲームを作りましょう
 * Player2人がいる。
 * １０試合を行い、勝ったら１点取る、負けても減点しない
 * Player1は、順番でぐー、パー、チョッキを出す
 * Player2は、ランダムで出す Random.nextInt()
 */
public class RPSTest {

   public static void main(String[] args) {

      // Step1 2人のプレイヤーを出馬してもらう
      Player player1 = new Player("ZhangSan");
      Player player2 = new Player("LiSan");

      // Step2 2人のプレイヤーがそれぞれ違うストラテジーを装備する
      player1.setStrategy(new RandomStrategy());
      player2.setStrategy(new SequenceStrategy());

      // Step3 2人のプレイヤーを対戦してもらう
      // Step3.1 2人のプレイヤーがそれぞれハンズを出してもらう
      Hand handOfPlayer1 = player1.getHands();
      Hand handOfPlayer2 = player2.getHands();

      // Step3.2 2人が出したハンズを比較し、結果を出す
      int result = handOfPlayer1.compare(handOfPlayer2);

      // Step4 10回戦まで続けてもらう

      for (int i = 0; i < args.length; i++) {

      }

      // Step5 得点を計算し、勝敗を宣言する
      // result1 + result2 + result3
   }
}
