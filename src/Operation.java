public class Operation {

    public static void main(String[] args) {

        // 演算子
        // +-*/
        int i = 40 + 5;
        System.out.println(i);

        int j = 10;
        System.out.println(i * j);

        // 足し算、引き算、掛け算、割り算
        // 割り算では、int同士の結果は整数になる
        // 四捨五入せず、捨てるだけ
        System.out.println(i / j);

        // intとdouble同士の演算は、doubleになる
        double d = 10;
        System.out.println(i / d);

        // % モード 余り
        System.out.println(10 % 3);

        // 比較
        // である、でない、> <
        int smallNumber = 11;
        int largelNumber = 12;

        System.out.println(smallNumber == largelNumber);
        System.err.println(smallNumber != largelNumber);
        System.out.println(smallNumber > largelNumber);
        System.out.println(smallNumber >= largelNumber);
        System.out.println(smallNumber < largelNumber);
        System.out.println(smallNumber <= largelNumber);
        System.out.println(11 < 12);
        System.out.println(11 <= 12);

        int studentAScore = 61;
        int line = 60;
        System.out.println(studentAScore >= line); // 合格です。おめでとう。

        // アンド(且つ)、オア（或いは）、ノット
        boolean flag1 = true;
        boolean flag2 = false;

        System.out.println(flag2 & flag1);
        System.out.println(flag1 | flag2);
        System.out.println(flag2 && flag1);
        System.out.println(flag1 || flag2);

        System.out.println(!flag1);

        // 代入演算子 =, += , -= , ++, --
        int number1 = 10;
        int number2 = 11;
        System.out.println(number2 + number1); //21
        System.out.println(number2); //11


        System.out.println(number2 += number1); // 21
        System.out.println(number2); // 21

        number2++; // 22
        System.out.println(number2); // 22

        ++number2; // 23
        System.out.println(number2); // 23

        System.out.println(number2++); // 23
        System.out.println(++number2); // 25

        int number3 = number2++;
        System.out.println(number3);
    }
}
