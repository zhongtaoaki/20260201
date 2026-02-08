public class Loop {
    public static void main(String[] args) {

        // DRY

        int count = 1;
        while (count <= 10) {
            System.out.println("count: " + count + " Hello World");
            count++;
        }

        do {
            System.out.println("count: " + count + " Hello World");
            count++;
        } while (count <= 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i + " Hello World");
        }

        int[] array = { 1, 20, 34, 41, 51, 63, 7, 8, 90, 102, 103 };
        // 要件： 配列Arrayのかなに、３の整数倍の要素を出力してください

        // 以上の手順を１０回繰り返す
        for (int i = 0; i < array.length; i++) {
            // -----ループ開始-----
            // ３の整数倍かどうかを判断したい
            if (array[i] % 3 == 0) {
                // もし、３の整数倍の場合、要素の値を出力
                System.out.println(array[i]);
            }
            // -----ループ終了-----
        }

        String[] nameList = { "りゅうさん", "ていさん", "ルアンさん", "マイさん" };
        for (String name : nameList) {
            System.out.println(name);
        }

        for (int i = 0; i < nameList.length; i++) {
            System.out.println(nameList[i]);
        }

        int i = 10;
        int j = 18;
        boolean switchFlag = i > j;
        while (switchFlag) {
            String s = "Hello World";
            System.out.println(s);
        }

        int[] numberList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int k = 0; k < numberList.length; k++) {
            numberList[k] *= 10;
            System.out.println(numberList[k]);
        }

        for (int k : numberList) {
            k *= 10;
            System.out.println(k);
        }

        for (int k : numberList) {
            System.out.println(k);
        }

        System.out.println("-------------");
        int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int k = 0; k < array2.length; k++) {

            if (k == 3) {
                continue;
            }
            System.out.println(array2[k]);
        }

    }
}
