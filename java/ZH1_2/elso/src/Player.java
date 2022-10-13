public class Player {
    private final String name ;
    private final String cast;

    private int xp;
    private int level;

    public Player(String name, String cast) {
        this.name = name;
        this.cast = cast;
        xp = 0;
        level = 1;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getCast() {
        return cast;
    }
//    Az increaseXp() metódus paraméterül kap egy egész számot és annyival növeli az xp-t. Ha
//    az xp nagyobb vagy egyenlő mint az aktuális szint kétszerese, akkor növeljük a játékos szintjét.
    public int increaseXp(int addXp){
        xp += addXp;

        if (xp >= level * 2) level++;

        return xp;
    }

//    A compare()
//    metódus két játékos szintjét hasonlítja össze. Ha a bal oldali játékos kisebb szintű, akkor -1-et adunk vissza.
//    Ha a két játékos azonos szintű, akkor 0 a visszatérési érték. Ha a bal oldali játékos a nagyobb szintű, akkor
//+1 -et kell visszaadni.
    public int compare(Player p){
        return Integer.compare(level, p.getLevel());
    }

    @Override
    public String toString() {
        return String.format("Level %d %s %s",level,cast,name);
    }
}
