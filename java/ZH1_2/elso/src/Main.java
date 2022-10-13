public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Gamer123", "harcos");
        Player p2 = new Player("Hacker1", "mágus");
        Player p3 = new Player("Körte", "felderítő");

        System.out.println(p1); // Level 1 harcos Gamer123
        System.out.println(p1.getName()); // Gamer123
        System.out.println(p2.getLevel()); // 1
        System.out.println(p2.increaseXp(2)); // az xp-t 2-vel növeljük
        System.out.println(p2.getLevel()); // 2
        System.out.println(p3.getCast()); // felderítő
        System.out.println(p1.compare(p2)); // -1
        System.out.println(p1.compare(p3)); // 0
        System.out.println(p2.compare(p1)); // 1
    }
}
