package triggerPractice;

public class Main {

    public static void main(String[] args) {

        Trigger trigger = new Trigger();

        Device pc = new PC();
        pc.setCategory("熱血");
        trigger.addSubscriber(pc);

        Device tv = new TV();
        tv.setCategory("日常");
        trigger.addSubscriber(tv);

        Device phone = new Phone();
        phone.setCategory("異世界");
        trigger.addSubscriber(phone);

        trigger.publish("NEW パンティ＆ストッキング with ガーターベルト", "熱血");

    }
}
