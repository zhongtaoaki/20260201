package day4;

public class VariablArray {

    // 封装 カプセル化
    // アクセス修飾子
    // public プロジェクト内の範囲で見える
    // protected package内の範囲で見える 他packageの子クラスでも見える
    // (default) package内の範囲で見える
    // private 可視範囲は本クラス内

    // ※ default を修飾するフィールドやメソッドを書かないでください
    private int[] array = new int[0];

    public int length;

    // Javadoc
    /**
     * 与えられた要素を配列の最後にプッシュする
     * 
     * @param element プッシュされる要素
     */
    public void push(int element) {

        int[] newArray = new int[this.array.length + 1];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        newArray[this.array.length] = element;
        array = newArray;
    }

    /**
     * この可変配列の現在の長さを取得する
     * 
     * @return この可変配列の現在の長さ
     */
    public int getLength() {

        return this.array.length;
    }

    /**
     * インデクスに基づいて要素を取得
     * 
     * @param index 取得したい要素のインデクス
     * @return 取得したい要素
     */
    public int get(int index) {
        return array[index];
    }
}
