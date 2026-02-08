public class If {
    public static void main(String[] args) {

        int i = 4;
        int j = 5;

        // System.out.println(i > j);

        // 分岐

        if (i > 100) {
            System.out.println("iは100より大きい。");
        } else if (i > 0) {
            System.out.println("iは100より小さいが、0よりは大きい。");
        } else if (i > -100) {
            System.out.println("iは0より小さいが、-100よりは大きい。");
        } else {
            System.out.println("iは-100より小さい。");
        }

        // -----
        if (i > 100) {
            System.out.println("iは100より大きい。");
        } else if (i > 0) {
            System.out.println("iは100より小さいが、0よりは大きい。");
        } else if (i > -100) {
            System.out.println("iは0より小さいが、-100よりは大きい。");
        } else {
            System.out.println("iは-100より小さい。");
        }
        System.out.println("iは整数。");

        // -----
        if (i > 100) {
            System.out.println("iは100より大きい。");
        } else {
            System.out.println("iは100より小さいが、0よりは大きい。");
            System.out.println("iは整数。");
        }
        System.out.println("iは整数。");

    }
}
