import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> inputFromFile = new ArrayList<>(FileUtils.readLines("superhero.csv"));
        Set<String> tempSet = new HashSet<>();
        String[] temp;
        for (String s : inputFromFile) {
            temp = s.split(";");
            for (int i = 1; i < temp.length; i++) {
                tempSet.add(temp[i]);
            }

        }
        System.out.println(tempSet.size());
    }
}
