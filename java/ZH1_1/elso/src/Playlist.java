import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private static List<Game> games;

    public Playlist() {
        games = new ArrayList<>();
    }

    public void add(Game name){
        games.add(name);
    }

    public Game getBestGame(){
        Game game = null;
        int max = 0;
        for (Game g:games) {
            if (g.getScore() > max) {
                max = g.getScore();
                game = g;
            }
        }

        return game;
    }

    public Game getLongestGame(){
        Game game = null;
        int max = 0;
        for (Game g:games) {
            if (g.getTime() > max) {
                max = g.getScore();
                game = g;
            }
        }

        return game;
    }
    public Game getShortestGame(){
        Game game = null;

        double max = 0;
        for (Game g:games) {
            if (g.getTime() > max) {
                max = g.getScore();
            }
        }
        double min = max;
        for (Game g:games) {
            if (g.getTime() < min) {
                min = g.getTime();
                game = g;
            }
        }

        return game;
    }


}
