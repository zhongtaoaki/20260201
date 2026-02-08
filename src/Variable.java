public class Variable {

    public static void main(String[] args) {

        // コメントアウト
        // 変数の宣言
        // タイプ 変数名 = 値;
        // タイプ 基本型、参照型
        // 基本型
        // 整数 byte [-128,128),short(65536),int(integer)(2の３２次乗 ４２億) ,long(2の64次乗)
        // 小数 float(4byte),double(8byte)
        // 文字 char(character)
        // ブリアン boolean(true,false)
        // 自動カスト
        // 強制カスト
        // 変数名で使える文字：a,A,1,_,$,ナンバーは頭文字として使ってはいけない
        // 実際の現場では頭文字が小文字しか使えない、 int javaScore = 90
        // キャメルネーミング javaScore
        // スネークネーミング java_score
        // = 代入演算子, 右の値を左の変数に代入する
        // 値はデフォルトのタイプがある、＝の左右は必ずデータタイプ一緒である、もしくは自動カスト、もしくは強制カストさせる
        // メソッドの中にある変数は全部ローカル変数と言います。
        // int i = 20000;
        // byte b = 127;
        // long l = 20000000;
        // short s = (short)l;
        // float f = 1.3f;
        // double d = 1.33;
        // char c1 = 21000;
        // char c2 = '鄭';
        // boolean flag1 = true;

        // 変数の使用
        // 変数名を使うことで使用できる
        // System.out.println(i);
        // System.out.println(c1);
        // System.out.println(c2);
        // System.out.println(s);

        int i1 = 10;
        int i2;
        i2 = 20;
        // i2 = 30;

        // System.out.println(i2);/

        // 参照型
        // 参照型のデータタイプは大文字から始まる
        // 文字列
        String s = "Hello World";
        System.out.println(s);

        // 配列
        // javaでは、配列での要素は必ず同じタイプである
        // javaでは、配列の長さは不可変
        // 配列の宣言
        int score1 = 10;
        int score2 = 20;
        int score3 = 50;
        int score4 = 100;
        int score5 = 10;
        byte[] array1 = { 10, 20, 50, 100, 10 };
        int[] array2 = { score1, score2, score3, score4, score5 };
        int[] array3 = new int[5];// {0,0,0,0,0}
        int[] array4 = new int[] { 10, 20, 50, 100, 10 };
        char[] array5 = new char[5];
        double[] array6 = new double[5];
        boolean[] array7 = new boolean[5];

        int[] array8 = new int[4];
        array8[0] = 1;
        array8[1] = 2;
        array8[2] = 3;
        array8[3] = 4;
        
        int[] array9 = {};

        Double i = null;
        System.out.println(i);

        double[] array10 = {0 ,1.0};

        // 配列の使用
        // インデックスを利用することで要素を使う
        // 最後の要素のインデックスは、length-1
        // System.out.println(array1[0]);
        // System.out.println(array1[4]);
        // System.out.println(array1[5]);
        // System.out.println(array1[-1]);
        System.out.println("int型の初期値は：" + array3[4]);
        System.out.println("char型の初期値は：" + array5[4]);
        System.out.println("double型の初期値は：" + array6[4]);
        System.out.println("boolean型の初期値は：" + array7[4]);

        // int[][] array8 = new int[5][5];
        // int[][] array9 = {
        //     {1,1,3,4,5}, 
        //     {5,2,3,4,5}, 
        //     {1,3,4,2,5}, 
        //     {6,5,3,4,6}, 
        //     {9,4,5,6,7}
        // };
        // array8[0][0] = 1;
        // array8[4][2] = 1;

        // // System.out.println(array9[4][2]);
        // System.out.println(array8[3][1]);
        
    }
}
