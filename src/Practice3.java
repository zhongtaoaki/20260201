import day4.VariablArray;

public class Practice3 {

    // jvm java virtual machine
    // javac
    // java
    // 入り口
    // スレッド
    public static void main(String[] args) {

        VariablArray array = new VariablArray();
        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);
        array.push(5);
        array.push(6);
        array.push(7);

        for (int i = 0; i < array.getLength(); i++) {
            System.out.println(array.get(i));
        }

        // CRUD
        // ✅ create read
        // ❌ update delete
    }
}
