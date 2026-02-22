// シングルトン デザインパターン
public class Agent {

    private Agent() {
    }

    String name;

    private static Agent instance = new Agent();

    public String getAnswser(String question) {
        return "一生懸命考え中";
    }

    public static Agent getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Agent ai = getInstance();

        ai.getAnswser(null);
    }

}
