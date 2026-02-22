public class Practice2 {

    public static void main(String[] args) {

        // 配列を用意、二次元配列である
        // 要素のデータ型はなんでもいい
        // 配列の要素を全てprintln しよう

        int[][] outerArray = {
                { 2, 6, 8, 10 },
                { 6, 6, 8, 10 },
                { 2, 4, 8, 10 },
                { 3, 6, 8, 10 },
                { 21, 6, 8, 10 },
        };

        // for (int i = 0; i < outerArray.length; i++) {
        // for (int j = 0; j < outerArray[i].length; j++) {
        // System.out.println(outerArray[i][j]);
        // }
        // }

        // for (int[] innerArray : outerArray) {
        // for (int i : innerArray) {
        // System.out.println(i);
        // }
        // }

        // メソッドを定義してください
        // 仕様：配列の要素の位置を書きがえる
        // input: 要素がint型の配列
        // output: 要素がint型の配列

        // mainメソッドでテストしてください
        int[] array = { 5, 6, 10, 2, 1, 88 };
        int[] newArray = sortArray(array);

        for (int i : newArray) {
            System.out.println(i);
        }

    }

    // バブルソート
    public static int[] sortArray(int[] array) {

        // そのずらす処理をまたループして、全配列の全要素をソートする
        for (int j = 0; j < array.length - 1; j++) {
            // その比較をループして、一番大きい要素が一番最後になる
            for (int i = 0; i < array.length - j - 1; i++) {
                // 隣同士を比較して、大きいほうが後ろにずらす
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1] + array[i];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] = array[i] - array[i + 1];
                }
            }
        }

        return array;

    }

}
