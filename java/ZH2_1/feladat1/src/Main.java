import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> inputFromFile = new ArrayList<>(FileUtils.readLines("superhero.csv"));
        List<String> tempList = new ArrayList<>();
        List<Superhero> superheroes = new ArrayList<>();
        String[] temp;
        for (String s : inputFromFile) {
            temp = s.split(";");
            for (int i = 1; i < temp.length; i++) {
                tempList.add(temp[i]);
            }
            superheroes.add(new Superhero(temp[0],tempList));
            tempList.clear();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Képesség: ");
        String ab = sc.nextLine();
        for (Superhero superhero : superheroes) {
            if (superhero.getAbilities().stream().map(String::toLowerCase).collect(Collectors.toList()).contains(ab.toLowerCase(Locale.ROOT)))
                System.out.println(superhero.getName() + " ("+superhero.getAbilities().size()+")");
        }

    }
}
