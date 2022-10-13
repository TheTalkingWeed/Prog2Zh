public class Game {
    private final String title;
    private final int score;
    private final double time;

    public Game(String title, String score, String time) {
        this.title = title;
        this.score = Integer.parseInt(score.split("%")[0]);
        this.time = Double.parseDouble(time.split(" ")[0]);

    }

    public String getTitle() {
        return title;
    }

    public int getScore() {
        return score;
    }

    public double getTime() {
        return time;
    }

    public boolean isBetterThan(Game game){
        return score > game.getScore();
    }

    public  boolean isLongerThan(Game game){
        return time > game.getTime();
    }

    @Override
    public String toString() {
        return title + " (" + score + "%), " +time+" hours to beat";
    }
}
