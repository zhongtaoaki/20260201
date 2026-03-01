// 継承
// 父類　子類
// 継承が成り立て入れば、子クラスが自動的に親クラス
// のフィールドを継承している(has)
// 親クラスに定義されたprivateじゃないもの全て継承される
// Java、ダイアモンド継承はサポートされていない
public class Goods {

    public String name;
    public String type;
    public int price;
    public String maker;

    private String number;

    public String getName() {
        return "これはスーパークラス：" + this.name;
    }

}
