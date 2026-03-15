package triggerPractice;

/**
 * TVクラス
 */
public class TV extends Device {

    @Override
    public void subscribe() {
        System.out.println("新作がTVで流れ始めた");
    }
}
