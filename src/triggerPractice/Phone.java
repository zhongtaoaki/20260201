package triggerPractice;

/**
 * スマホクラス
 */
public class Phone extends Device {

    @Override
    public void subscribe() {
        System.out.println("新作がPhoneで流れ始めた");
    }

}
