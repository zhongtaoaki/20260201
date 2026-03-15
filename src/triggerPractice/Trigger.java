package triggerPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * トリガー社
 * 新作を配信できる
 */
public class Trigger {

    private Subscriber[] subscribers = {};

    // NOTE List
    /**
     * 
     * 配列の長さが可変
     * 要素のデータタイプ必ず一致しないといけない
     * 順番がある
     * インデクスがある
     */
    public List<Subscriber> subscriberList = new ArrayList<>();

    /**
     * カプセル💊
     * 新しいデバイスを追加
     * 
     * 
     * @param subscriber 新しいデバイス
     */
    public void addSubscriber(Subscriber subscriber) {

        subscriberList.add(subscriber);

    }

    /**
     * 新作を配信する
     */
    public void publish(String animeName, String category) {
        System.out.println("新しいアニメを配信した");

        for (Subscriber subscriber : subscribers) {
            subscriber.subscribe();
        }

    }
}
