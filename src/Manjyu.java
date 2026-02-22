public class Manjyu {

    // manjyu
    // このまんじゅうは、緑で、山の形状、産地は静岡、賞味期限は３・22まで、味は抹茶味、名前は富士山抹茶まんじゅ
    // このまんじゅうは、赤で、いちごの形状、産地は福岡、賞味期限は３・22まで、味はいちご味、名前は福岡いちごまんじゅ
    // 色、商品名、賞味期限、味

    // 抽象 VS 具体
    // オブジェクト
    // クラス

    // クラスの宣言
    // public class クラス名{}
    // クラスの宣言は、ファイル内、クラス外
    // クラス名とファイル名を一致しないといけない
    // 一つのファイルでは、一つのクラスしか定義しない
    // クラス名のネーミング、キャメルネーミング

    // クラスの使用(クラスを利用して、オブジェクトを生成する)
    // new クラス名（）;

    // フィールド 属性
    // フィールドの宣言
    // フィールドの宣言はクラス内、メソッド外
    // フィールドは、変数である、タイプ 変数名 初期化しない
    String name;
    String color;
    int expirationDate;
    String taste;

    // フィールドの使用
    // フィールドの使用はメソッド内
    // オブジェクト.フィールドのことで使用する
    public static void main(String[] args) {
        // Manjyu machaManjyu = new Manjyu();
        // machaManjyu.name = "富士山抹茶まんじゅ";
        // machaManjyu.color = "Green";
        // machaManjyu.expirationDate = 30;
        // machaManjyu.taste = "macha";

        // Manjyu ichigoManjyu = new Manjyu();
        // ichigoManjyu.name = "福岡いちごまんじゅ";
        // ichigoManjyu.color = "Red";
        // ichigoManjyu.expirationDate = 30;
        // ichigoManjyu.taste = "ichigo";

        // machaManjyu.printFields();

        // System.out.println("----------------");

        // ichigoManjyu.printFields();

        // System.out.println("----------------");

        Manjyu chocoManjyu = new Manjyu("チョコまんじゅ", "チョコ色", 30, "チョコ");
        chocoManjyu.printFields();

    }

    // メソッド
    // メソッドは必ずオブジェクトから使用すること
    public void printFields() {

        System.out.println("このまんじゅの商品名は：" + name);
        System.out.println("このまんじゅの色は：" + color);
        System.out.println("このまんじゅの賞味期限は：" + expirationDate);
        System.out.println("このまんじゅの味は：" + taste);
    }

    // コンストラクター constructor
    // 宣言しなくても使える 宣言してもいい（宣言し直す）
    // デフォルで、パラメータなし、ボディなしのコンストラクタが存在している
    // staticをつけてはいけない、戻り値の定義ができない、メソッド名はクラス名と一緒
    public Manjyu(String name, String color, int expirationDate, String taste) {
        this.name = name;
        this.color = color;
        this.expirationDate = expirationDate;
        this.taste = taste;
    }

    // 以下のメソッドを定義してください
    // まんじゅの種類を比較するメソッド 全ての属性が一致しなければならない
    // input まんじゅう二つ
    // output boolean

}
