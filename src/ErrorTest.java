public class ErrorTest {

    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 3, 4, 5 };
        int number = 100;
        boolean flag = true;
        try {
            flag = isMyLuckyNumber(number, array);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(flag);
        System.out.println("最後の処理。ここまで来たらサーバーはダウンしていないと言える");

    }

    static boolean isMyLuckyNumber(int number, int[] array) throws Exception {
        boolean flag = true;
        for (int i : array) {

            if (i == 1) {
                throw new Exception("１は許せていない");
            }

            try {
                if (number % i != 0) {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("ゼロがあった");
            }
        }
        return flag;

    }

}
