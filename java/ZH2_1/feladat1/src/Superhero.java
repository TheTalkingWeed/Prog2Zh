import java.util.ArrayList;
import java.util.List;

public class Superhero {
    private String name;
    private List<String> abilities ;

    public Superhero(String name, List<String> abilities) {
        this.name = name;
        this.abilities = new ArrayList<>(abilities);
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", abilities=" + abilities +
                '}';
    }
}
