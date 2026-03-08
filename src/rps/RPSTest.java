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

      // Step1 2人のプレイヤーを出馬してもらう DONE
      Player player1 = new Player("ZhangSan");
      Player player2 = new Player("LiSan");

      // Step2 2人のプレイヤーがそれぞれ違うストラテジーを装備する DONE
      player1.setStrategy(new RandomStrategy());
      player2.setStrategy(new SequenceStrategy());

      // Step3.2 2人が出したハンズを比較し、結果を出す

      // Step4 10回戦まで続けてもらう

      for (int i = 0; i < 10; i++) {
         // Step3 2人のプレイヤーを対戦してもらう
         // Step3.1 2人のプレイヤーがそれぞれハンズを出してもらう
         Hand handOfPlayer1 = player1.getHands();
         Hand handOfPlayer2 = player2.getHands();
         int result = handOfPlayer1.compare(handOfPlayer2);
         player1.setPoint(result);
         player2.setPoint(-result);
         System.out.println((i + 1) + "回戦");
         System.out.println(player1.getName() + "が出した手は：" + handOfPlayer1.getName());
         System.out.println(player2.getName() + "が出した手は：" + handOfPlayer2.getName());
         System.out.println(result);
      }

      System.out.println(player1.getName() + ": " + player1.getPoint());
      System.out.println(player2.getName() + ": " + player2.getPoint());
      // Step5 得点を計算し、勝敗を宣言する
      if (player1.getPoint() == player2.getPoint()) {
         System.out.println("引き分け");
      } else if (player1.getPoint() > player2.getPoint()) {
         System.out.println(player1.getName() + "の勝つ");
      } else {
         System.out.println(player2.getName() + "の勝つ");
      }

   }
}
