public class Method {

    public static void main(String[] args) {

        /**
         * ２。メソッドの使用
         * 位置： メソッドの中に使用しなければならない
         * 同じクラスでは、メソッド(パラメータ)を使うことで使用できる
         */
        int month = 12;
        String season = getSeason(month);
        System.out.println(season);

        System.out.println(args);

        int squaredResult = getSquare(2, 3);
    }

    /**
     * １。メソッドの宣言
     * 修飾子 戻り値 メソッド名(パラメータ ){
     * メソッドボディ
     * }
     * 
     * 位置：メソッドは、メソッドの外部、クラスの内部に宣言しなければならない
     * 修飾子：public static
     * 戻り値: データタイプ,あるいは void,
     * もしデータタイプが定義された場合必ずメソッドボディの中にreturnしなければならない
     * もし、voidを定義された場合、メソッドボディの中にreturnしなくてもいい, methodの終了を意味する
     * メソッド名： 変数名の同じ、キャメルネイミング
     * パラメータ：(データタイプ 変数名, データタイプ 変数名, データタイプ 変数名), ()
     * パラメータなくてもいい
     * パラメータが一つだけでもいい
     * パラメータ複数がある場合も良い、順序で決まる、データ型も必ずそれぞれ一致しなければならない
     */

    public static String getSeason(int month) {

        String season;

        // 何の季節なのかを判断
        if (month == 3 || month == 4 || month == 5) {
            // 季節の名前を出力
            season = "春です。";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "夏です。";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "秋です。";
        } else if (month == 12 || month == 1 || month == 2) {
            season = "冬です。";
        } else {
            season = "１〜１２まで数字を入れてください";
        }

        return season;
    }

    public static int getSquare(double a, int b) {

        for (int i = 0; i < b; i++) {
            a *= a;
        }
        return (int) a;
    }
}
