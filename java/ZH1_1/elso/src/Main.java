public class Main {
    public static void main(String[] args) {
        Game g1 = new Game("Subnautica", "84%", "43 hours");
        Game g2 = new Game("Danganronpa 1", "82%", "28.5 hours");
        Game g3 = new Game("Immortals Fenyx Rising", "77%", "41.5 hours");

        System.out.println(g1); // Subnautica (84%), 43 hours to beat
        System.out.println(g1.getTitle()); // Subnautica
        System.out.println(g1.getScore()); // 84
        System.out.println(g1.getTime()); // 43.0
        System.out.println(g1.isBetterThan(g2)); // true
        System.out.println(g3.isBetterThan(g2)); // false
        System.out.println(g3.isLongerThan(g2));

        Playlist winter = new Playlist();
        winter.add(g1);
        winter.add(g2);
        winter.add(g3);

        System.out.println(winter.getBestGame()); // Subnautica (84%), 43 hours to beat
        System.out.println(winter.getLongestGame()); // Subnautica (84%), 43 hours to beat
        System.out.println(winter.getShortestGame());
    }
}
