package triggerPractice;

/**
 * 購読インターフェース
 */
public interface Subscriber {

    /**
     * アニメコンテンツを購読する
     */
    void subscribe();

    /**
     * 興味があるカテゴリを取得する
     * 
     * @return 興味があるカテゴリ
     */
    String getCategory();
}
