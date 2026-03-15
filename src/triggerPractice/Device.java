package triggerPractice;

/**
 * デバイス、すべてのデバイスの親クラス
 */
public abstract class Device implements Subscriber {

    private String category;

    @Override
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
