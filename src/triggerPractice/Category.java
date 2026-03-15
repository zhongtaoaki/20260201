package triggerPractice;

import java.util.ArrayList;
import java.util.List;

public class Category {

    public String name;
    public List<Subscriber> subdSubscribers = new ArrayList<Subscriber>();

    public Category(String name) {
        this.name = name;
    }

}
