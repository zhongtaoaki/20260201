public class Computer extends Goods {

    public String spec;
    public String warrantyPeriod;

    // override
    // オーバーライド
    @Override
    public String getName() {
        return "これは子クラス：" + this.spec + this.name;
    }

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.name = "macbook";
        computer.spec = "M4 2024 32G ";

        System.out.println(computer.name);
        System.out.println(computer.getName());
    }

}
