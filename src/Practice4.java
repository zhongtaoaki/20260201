// 多態性
// ポリモーフィズム
// 条件１：継承関係がある
// 条件２：オーバーライドがある
// 条件３：親クラスのポインターが子クラスに指している
public class Practice4 {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.name = "macbook";
        computer.spec = "M4 2024 32G ";

        Manjyu manjyu = new Manjyu("富士山抹茶まんじゅ", "Green", 30, "macha");

        Goods[] products = { computer, manjyu };

        for (Goods goods : products) {
            System.out.println(goods.getName());
        }

        Goods goods3 = new Computer();
        goods3.name = ("仮商品");
        System.out.println(goods3.getName());

    }

}
