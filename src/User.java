public class User {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public User(String name, int score) {
        this.name = name;
        this.score = score;
    }
}