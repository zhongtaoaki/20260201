package triggerPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * トリガー社
 * 新作を配信できる
 */
public class Trigger {

    // NOTE List
    /**
     * 
     * 配列の長さが可変
     * 要素のデータタイプ必ず一致しないといけない
     * 順番がある
     * インデクスがある
     */
    public List<Subscriber> subscriberList = new ArrayList<>();

    // Note Map
    /**
     * one to one
     * 長さは可変である
     * 順番がない
     * インデクスがないが、代わりKeyがインデクスとして使える
     */
    public Map<String, List<Subscriber>> categoryMap = new HashMap<>();

    List<Category> categories = new ArrayList<>();

    /**
     * カプセル💊
     * 新しいデバイスを追加
     * 
     * 
     * @param subscriber 新しいデバイス
     */
    public void addSubscriber(Subscriber subscriber) {

        subscriberList.add(subscriber);

        String key = subscriber.getCategory();

        // categoryMap.containsKey(subscriber.getCategory())
        if (categoryMap.get(key) != null) {
            categoryMap.get(key).add(subscriber);
        } else {
            categoryMap.put(key, new ArrayList<>());
        }

        for (String k : categoryMap.keySet()) {
            categoryMap.get(k);
        }

        categoryMap.size();
    }

    /**
     * 新作を配信する
     */
    public void publish(String animeName, String category) {
        System.out.println("新しいアニメを配信した");

        for (Category existedCategory : categories) {
            if (category.equals(existedCategory.name)) {
                for (Subscriber subscriber : existedCategory.subdSubscribers) {
                    subscriber.subscribe();
                }
            }
        }
    }
}
