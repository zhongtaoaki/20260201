package triggerPractice;

public class Main {

    public static void main(String[] args) {

        Trigger trigger = new Trigger();

        trigger.addSubscriber(new PC());
        trigger.addSubscriber(new TV());
        trigger.addSubscriber(new Phone());

        trigger.publish();

    }
}
