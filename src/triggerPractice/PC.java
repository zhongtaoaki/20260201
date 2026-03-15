package triggerPractice;

/**
 * PCクラス
 */
public class PC extends Device {

    @Override
    public void subscribe() {
        System.out.println("新作がPCで流れ始めた");
    }

}
