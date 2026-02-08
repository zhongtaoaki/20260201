public class Switch {
    public static void main(String[] args) {

        // DRY
        // Dont Repeat Yourself

        // 一年中、十二が月がある
        // それぞれ季節を表している
        // １〜１２までのとある数字が、何の季節なのかを判断して、季節の名前を出力してください

        // １〜１２までのとある数字
        int month = 13;

        // 何の季節なのかを判断
        if (month == 3 || month == 4 || month == 5) {
            // 季節の名前を出力
            System.out.println("春です。");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("夏です。");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("秋です。");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("冬です。");
        } else {
            System.out.println("１〜１２まで数字を入れてください");
        }

        // switchに許される変数のデータ型
        // byte,char,short,int,String,Enum
        switch (month) {
            case 3, 4, 5:
                System.out.println("春です。");
                break;
            case 6, 7, 8:
                System.out.println("夏です。");
                break;
            case 9, 10, 11:
                System.out.println("秋です。");
                break;
            case 12, 1, 2:
                System.out.println("冬です。");
                break;
            default:
                System.out.println("１〜１２まで数字を入れてください");
                break;
        }
    }
}
